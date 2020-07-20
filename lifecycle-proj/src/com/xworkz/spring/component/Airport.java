package com.xworkz.spring.component;


public class Airport {
	private String location;
	private String aname;
	private int noOfTerminals;

	public Airport(String location) {
		this.location = location;
		System.out.println(this.getClass().getSimpleName() + "is created");
		System.out.println("Airport.location:"+this.location);
	}

	public void setNoOfTerminals(int noOfTerminals) {
		System.out.println("invoked setNoOfTerminals" + noOfTerminals);
		this.noOfTerminals = noOfTerminals;
	}

	public void setAname(String aname) {
		System.out.println("Name is "+aname);
		this.aname = aname;
		
	}

}
