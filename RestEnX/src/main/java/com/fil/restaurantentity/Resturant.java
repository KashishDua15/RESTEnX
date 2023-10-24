package com.fil.restaurantentity;

public class Resturant {
	
	private String name;
	private String area;
	private int totalSeats;
	private int availableSeats;
	private int mealForTwo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public int getMealForTwo() {
		return mealForTwo;
	}
	public void setMealForTwo(int mealForTwo) {
		this.mealForTwo = mealForTwo;
	}
	public Resturant(String name, String area, int totalSeats, int availableSeats, int mealForTwo) {
		super();
		this.name = name;
		this.area = area;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
		this.mealForTwo = mealForTwo;
	}
	public Resturant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Resturant [name=" + name + ", area=" + area + ", totalSeats=" + totalSeats + ", availableSeats="
				+ availableSeats + ", mealForTwo=" + mealForTwo + "]";
	}
	
	
}
