package com.example.bereahelpkit;

import android.os.Bundle;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.actionbarsherlock.app.SherlockListFragment;
import com.jacob.patton.bereaconvo.R;




public class FaqFragment extends SherlockListFragment {

	onArticleSelected mainActivityCall;
	
	SimpleAdapter myList2;
	
	List<HashMap<String, Object>> faqdata;
	
	boolean hasdata;
	
	public interface onArticleSelected{
		// these subroutine must be in the MainActivity class.
		// used to pass the position of the article to display
		public void displayArticleData(int position);
				
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	 	
		// creates the list for the adapter. 
		faqdata = new ArrayList<HashMap<String, Object>>();
		// This maps where the information goes. 
		String[] from = new String[] {"title",};
		int[] to = new int[] {R.id.lvTitle};
		// creating the simple adapter. 
		myList2 = new SimpleAdapter(getActivity(),faqdata,R.layout.listview_row,from, to);
		// setting the adapter
		setListAdapter(myList2);
		
		// find our layout to get access before inflating. 
		LinearLayout mylayout = (LinearLayout)inflater.inflate(R.layout.fragment_menu, container, false);
		
		return mylayout;
	}
	
	public void onAttach(Activity activity){
		super.onAttach(activity);
		 // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception.
		try{
			mainActivityCall = (onArticleSelected) activity;
			
		} catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
	}
	
	public void onListItemClick(ListView l, View v, int position, long id) {
		  // on click, whichever title you selected, it passes the position to the main activity which passes the correct array. 
			if(hasdata == true){
				mainActivityCall.displayArticleData(position);
			}
		}
	
}
