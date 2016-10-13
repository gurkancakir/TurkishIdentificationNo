package com.gurkan.test;

import com.gurkan.TurkishIdentificationNo.IdentificationClient;
import com.gurkan.TurkishIdentificationNo.Person;
import com.gurkan.TurkishIdentificationNo.Response;

public class ClientTest {
	
	 public static void main(String args[]) throws Exception {
	    	
	    	//person informations for test
	    	long tcno = 11111111111L;
	    	String name = "gürkan mustafa";
	    	String surname = "çakır";
	    	int birthday = 1993888;
	    	
	    	
	    	// create client for this person
	    	IdentificationClient identificationClient = new IdentificationClient(new Person(tcno, name, surname, birthday)); 

	    	// check validate
	    	Response response = identificationClient.checkIdentificationNo(); 
	    	
	    	// response
	    	System.out.println(response.getValid());
	    	
	    	for (String error : response.getErrors()) // if errors 
	    		System.err.println(error); // print errors
	    }
}
