package com.mayur.assignment11OctClassAndObject;

public class Complex {

	double real;
	double img;

	Complex(double real, double img) {
		this.real = real;
		this.img = img;
	}

	public static Complex add(Complex c1, Complex c2) {

		Complex temp = new Complex(1, 2);

		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;

		return temp;
	}
	
	public static Complex multiple(Complex c1, Complex c2) {

		Complex temp = new Complex(1, 2);

		temp.real = c1.real * c2.real;
		temp.img = c1.img * c2.img;

		return temp;
	}

	public static void main(String args[]) {
		Complex c1 = new Complex(1.8, 1.5);
		Complex c2 = new Complex(1.2, 3.5);
		Complex temp = add(c1, c2);
		System.out.printf("Sum is: " + temp.real + " + " + temp.img + "i\n");
		
		Complex mul = multiple(c1, c2);
		System.out.printf("Mul is: " + mul.real + " + " + mul.img + "i");
	}
}
