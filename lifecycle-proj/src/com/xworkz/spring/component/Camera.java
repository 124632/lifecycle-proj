package com.xworkz.spring.component;

public class Camera {
	private String Brand;
	private double Price;
	
	public Camera(String brand,double price) {
		
		this.Brand=brand;
		this.Price=price;
		System.out.println("Camera created brand:" +this.Brand+ "Price:" +this.Price);
	}
	public String getBrand() {
		return Brand;
	}
	public double getPrice() {
		return Price;
	}

}
