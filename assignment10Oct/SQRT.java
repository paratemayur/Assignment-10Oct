package com.mayur.assignment10Oct;

import java.util.Scanner;

public class SQRT {

	public static double sqareRoot(int num) {
		
		double temp;
		double sqrt = num/2;
		do {
			temp = sqrt;
			sqrt = (temp+(num/temp))/2;
		}while((temp-sqrt)!=0);
		return sqrt;
		
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter any number : ");
		 int num = sc.nextInt();
//		 
//		 System.out.println(Math.sqrt(a));
//		 
//		 int sqrt = a*a;
//		 
//		// System.out.println("Square root of a is "+sqrt);
	
		
		double sqrt;
		
		System.out.println(sqareRoot(num));
	
	}
	
}
