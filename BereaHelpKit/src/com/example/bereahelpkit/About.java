package com.example.bereahelpkit;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class About extends SherlockFragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
	  
		TextView res = (TextView)findViewById(R.id.AboutResourcesInfo);
		res.setText(Html.fromHtml(getString(R.string.mainresources_info)));
		TextView help = (TextView)findViewById(R.id.AboutHelpInfo);
		help.setText(Html.fromHtml(getString(R.string.help_info)));
	}
	
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
