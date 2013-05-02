package com.bereacollege.map;



import android.content.Intent;
import android.os.Bundle;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class MapActivity extends SherlockFragmentActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        
        setContentView(R.layout.main);
        TouchImageView img = (TouchImageView) findViewById(R.id.snoop);
        img.setImageResource(R.drawable.campusmapcom);
        img.setMaxZoom(5f);
    }

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present. 
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		menu.add("About").setShowAsAction(MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		//Go to the aboutMaps activity
		if(item.getTitle().equals("About")){
		   Intent about = new Intent(MapActivity.this, com.bereacollege.map.AboutMaps.class);
		   startActivity(about);
		}
		//To return to the Main Menu
	    if (item.getItemId() == android.R.id.home) {
	        finish();
	        return true;
	    }
		return true;
	}

}