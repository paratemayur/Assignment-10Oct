package com.mayur.assignment10Oct;

import java.util.Scanner;

public class SumOfBin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Binary Number : ");	
		String bin1 = sc.nextLine();
		System.out.println("Enter Second Binary Number : ");	
		String bin2 = sc.nextLine();
		
		int num1 = Integer.parseInt(bin1, 2);
		int num2 = Integer.parseInt(bin2, 2);
		
		int output = num1 + num2;
		
		System.out.print("\nThe Sum Two Binary Numbers are = ");
		System.out.print(Integer.toBinaryString(output));
	}
}

