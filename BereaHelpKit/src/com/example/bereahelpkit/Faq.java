package com.example.bereahelpkit;

//Not in finished installtion Will be in future updates as the FAQ app.

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class Faq extends SherlockFragmentActivity
	implements FaqFragment.onArticleSelected{

	private List<String[]> database;
	
	//Integer for the article that is being displayed

	
	private List<String[]> dbDisplay;
	
    //a variable to keep track of if we are in small or large mode. 
    private boolean smallLayout = false;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        
			// Look for the id for small layout
		if(findViewById(R.id.article_frame_small)!= null){
				// find article fragment
				FaqDetail articleFrag = (FaqDetail) getSupportFragmentManager().findFragmentById(R.id.article_frame_small);
				FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
				// tell the program we are in the small layout. 
				smallLayout = true;
				//hide fragment and commit the change.  
				ft.hide(articleFrag);
				ft.commit(); 
				
		}
	     // if we are in landscape/large layout, show a blank article. 
	     if(!smallLayout){
	    	 displayBlankArticleData();
	     }
	
    }

	public void displayArticleData(int position){
		
		
		// look to see if we are in small mode. 
		if(smallLayout == true){
			
			// if so find both of the fragments and start transaction. 
			FaqDetail articleFrag = (FaqDetail) getSupportFragmentManager().findFragmentById(R.id.article_frame_small);
			FaqFragment menuFrag = (FaqFragment) getSupportFragmentManager().findFragmentById(R.id.menu_frame_small);
			FragmentTransaction ft = getSupportFragmentManager().beginTransaction();  
			// hide menu fragment
			ft.hide(menuFrag);
			// show article fragment.
			ft.show(articleFrag);
			//add it to the stack to enable using back button. 
			ft.addToBackStack(null);
			// pass the article data. 
			//articleFrag.updateArticle(dbDisplay.get(position));
			//commit the change. 
			ft.commit(); 
			
		}
		else{

			// this find the ArticleFragment frame and give it a variable name.
			FaqDetail articleFrag = (FaqDetail) getSupportFragmentManager().findFragmentById(R.id.article_frame);
			// pass the position from the selected menu to the article. 
			//articleFrag.updateArticle(dbDisplay.get(position));
			
		}
	}
	
	private void displayBlankArticleData(){
		FaqDetail articleFrag = (FaqDetail) getSupportFragmentManager().findFragmentById(R.id.article_frame);
		// tells it to show blank article. 
		//articleFrag.showBlankArticle();
	}

    // if the wizard generated an onCreateOptionsMenu you can delete
    // it, not needed for this tutorial

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item){
		//To return to the Main Menu
	    if (item.getItemId() == android.R.id.home) {
	        finish();
	        return true;
	    }
		return true;
	}
	
}
