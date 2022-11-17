package com.mayur.assignment11OctClassAndObject;


public class Height {

	private double feet;
	private double feet2;
	private double inches;

	public Height() {
	}

	public double getFeet() {
		return feet;
	}

	public void setFeet(double feet) {
		this.feet = feet;
	}

	public double getInches() {
		return inches;
	}

	public void setInches(double inches) {
		this.inches = inches;
	}

	public Height(double feet, double feet2) {
		this.feet = feet;
		this.feet2 = feet2;
	}

	public static void main(String[] args) {
		Height h = new Height(5.6, 5.8);
		
		h.display();
		 
	}

	public void display() {
		double result=feet+feet2;
		System.out.println("Total height in feet is: " +result +"feet");
		System.out.println("Height in inches is : "+result*12 +"inches");
	}
}


