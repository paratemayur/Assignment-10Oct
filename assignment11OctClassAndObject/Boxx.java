package com.mayur.assignment11OctClassAndObject;

public class Boxx {

	protected int length;
	protected int breadth;
	protected int height;

	public Boxx() {
		this(0);
		System.out.println("0 args");
	}

	Boxx(int length) {
		this(0, 0, 0);
		System.out.println("1 args");
	}

	public Boxx(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		System.out.println("Boxx 3 args cons");
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Boxx [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
	}

	public int calculateVolume() {
		return this.length * this.breadth * this.height;
	}

}
