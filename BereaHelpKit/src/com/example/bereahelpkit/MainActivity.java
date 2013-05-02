package com.example.bereahelpkit;

import com.actionbarsherlock.view.MenuItem;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;

public class MainActivity extends SherlockFragmentActivity {
//	private SlidingMenu menu;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	   
	    
	    
	    //getWindow().setFormat(PixelFormat.RGBA_8888);
	   // getWindow().addFlags(WindowManager.LayoutParams.FLAG_DITHER);
	    setContentView(R.layout.activity_main);
	    
	    GridView gridview = (GridView) findViewById(R.id.gridview);
	    gridview.setAdapter(new ImageAdapter(this));
	    
		    gridview.setOnItemClickListener(new OnItemClickListener() {
		    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
		    	//For seeing what was picked
		    	//Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
		    	   Intent i = null; //Will fill it soon
		    	   
                  //If an icon depending on what is chosen we run that app
		    	  //0 is map 1 is Convo 2 is FAQ app
		          if(position == 0){
		    	   //Intent for Map
		        	 i= new Intent(MainActivity.this, com.bereacollege.map.MapActivity.class);
		          }
		          if(position == 1){
		            //Intent for convo
		        	 i= new Intent(MainActivity.this, com.jacob.patton.bereaconvo.StartConvo.class);
		          }
		          if(position == 2){
		            //Intent for FAQ
		        	 i= new Intent(MainActivity.this, com.example.bereahelpkit.Faq.class);
		          }
		          if(i != null){
		        	 startActivity(i);
		          }
	        }

	    });
		    
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    //For About activity in the Sherlock Bar
		menu.add("About").setShowAsAction(MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		if(item.getTitle().equals("About")){
			//Start the intent if selected
		   Intent about = new Intent(this, About.class);
		   startActivity(about);
		}
		
		return true;
	}
	
}
