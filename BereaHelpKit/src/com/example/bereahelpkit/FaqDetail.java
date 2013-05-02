package com.example.bereahelpkit;

import android.os.Bundle;
import android.view.ViewGroup;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

public class FaqDetail extends SherlockFragment {


	  @Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	    View view = inflater.inflate(R.layout.activity_faq_detail,
	        container, false);
	    return view;
	  }

	  public void setText(String item) {
	    TextView view = (TextView) getView().findViewById(R.id.detailsText);
	    view.setText(item);
	  }

}
