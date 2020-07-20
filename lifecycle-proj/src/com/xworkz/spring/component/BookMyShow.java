package com.xworkz.spring.component;

public class BookMyShow {
	private String noOfmovies;
	private boolean bookingOpen;
	
	public BookMyShow() {
		System.out.println("BookingShow is created \t"+this.getClass().getSimpleName());
	}

	public String getNoOfmovies() {
		return noOfmovies;
	}
		

	public void setNoOfmovies(String noOfmovies) {
		System.out.println("invoked setNoOfmovies"+noOfmovies);
		this.noOfmovies = noOfmovies;
	}

	public boolean isBookingOpen() {
		return bookingOpen;
	}

	public void setBookingOpen(boolean bookingOpen) {
		System.out.println("invoked setBookingOpen"+bookingOpen);
		this.bookingOpen = bookingOpen;
	}
	
}
