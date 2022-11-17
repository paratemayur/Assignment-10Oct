package com.mayur.assignment11OctClassAndObject;

public class BoxWeight extends Boxx {

	int weight;
	public BoxWeight() {
		System.out.println("0 args Boxwei cons");
	}
	public BoxWeight(int weight, int length, int breadth, int height) {
		super(length, breadth, height);
		this.weight = weight;
		
		System.out.println("4 args boxwe cons");
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	@Override
	public String toString() {
		return "BoxWeight [weight=" + weight + "]";
	}
	public int calcDensity() {
		System.out.println("calcDensity method");
		return this.weight/(this.length*this.breadth*this.height);
	}
	
	
}
