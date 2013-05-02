package com.example.bereahelpkit;

import java.util.ArrayList;
import java.util.List;


public class FAQData {
	//Master database
	public List<String[]> database;
	
	
	public List<String[]> createdata(){
		//[ID,FAQTitle, FAQQuestion, FAQAnswer]
		
		 database = new ArrayList<String[]>();
		 		// RES Life FAQ
			 database.add(new String[]{"0","Residence Life FAQ","FAQQuestion","FAQAnswer"});
			 database.add(new String[]{"1","Residence Life FAQ","FAQQuestion","FAQAnswer"});
			 database.add(new String[]{"2","Residence Life FAQ","FAQQuestion","FAQAnswer"});
			 database.add(new String[]{"3","Residence Life FAQ","FAQQuestion","FAQAnswer"});
			 database.add(new String[]{"4","Residence Life FAQ","FAQQuestion","FAQAnswer"});
			 database.add(new String[]{"5","Residence Life FAQ","FAQQuestion","FAQAnswer"});
			 database.add(new String[]{"6","Residence Life FAQ","FAQQuestion","FAQAnswer"});
			 database.add(new String[]{"7","Residence Life FAQ","FAQQuestion","FAQAnswer"});
			 database.add(new String[]{"9","Residence Life FAQ","FAQQuestion","FAQAnswer"});
					
				//CPOFAQ
				database.add(new String[]{"10","CPO FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"11","CPO FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"12","CPO FAQ","FAQQuestion","FAQAnswer"});
				
				//Fin Add FAQ
				database.add(new String[]{"13","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"14","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"15","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"16","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"17","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"18","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"19","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"20","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"21","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"22","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"23","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"24","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"25","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"26","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"27","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"28","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"29","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"30","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"31","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
				database.add(new String[]{"32","Financial Aid FAQ","FAQQuestion","FAQAnswer"});
			
			// returns the above list. 			
			return database;
	}
	
	


}
