package com.xworkz.spring.component;

public class Stadium {
	private String Name;
	private String Location;
	public Stadium(String name,String location) {
		
		this.Name=name;
		this.Location=location;
		System.out.println("Stadium created name:"+this.Name+"location:"+this.Location);
	}
	public String getName() {
		return Name;
	}
	public String getLocation() {
		return Location;
	}

}
