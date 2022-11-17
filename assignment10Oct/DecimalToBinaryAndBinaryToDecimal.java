package com.mayur.assignment10Oct;

import java.util.Scanner;

public class DecimalToBinaryAndBinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer a decimal Number : ");
		
		int num = sc.nextInt();
		
		String b = "";
		
		int temp = num;
		
		while(temp>0) {
			int res = temp%2;
			temp = temp/2;
			b = res + b;
		}
		
		System.out.println("Binary equivalent of "+num+ " is "+b);
	
		System.out.println();
		
		System.out.println("Enter any binary number : ");
		int bin = sc.nextInt();
		
		int temp1 = bin;
		int i = 0;
		int d = 0;
		while(temp1>0) {
			int res = temp1%10;
			temp1 = temp1/10;
			
			d = d+ res* (int)Math.pow(2, i++);
		}
		
		System.out.println("Decimal Equivalent of "+bin+" is "+d);
	}
		
}
