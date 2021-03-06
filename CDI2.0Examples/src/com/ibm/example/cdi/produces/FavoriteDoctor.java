package com.ibm.example.cdi.produces;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

public class FavoriteDoctor {

	private String doctor = "Tom Baker";
	
	public @Produces @Favorite String getDoctor() {
		return doctor;
	}
	
	public void regenerate(@Disposes String instance) {
		System.out.println(instance + " is regenerating");
	}
}
