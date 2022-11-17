package com.mayur.assignment10Oct;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String yn;

		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter First number : ");
			int n1 = sc.nextInt();

			System.out.println("Enter Second Number : ");
			int n2 = sc.nextInt();

			System.out.println("Select Symbol (+,-,*,/)");

			String sym = sc.next();

			int res;

			switch (sym) {
			case "+":
				res = n1 + n2;
				System.out.println("Addition is : " + res);

				break;

			case "-":
				res = n1 - n2;
				System.out.println("Sub :" + res);
				break;

			case "*":
				res = n1 * n2;
				System.out.println("Mul : " + res);
				break;

			case "/":
				res = n1 / n2;
				System.out.println("div : " + res);
				break;

			default:
				System.out.println("Invalid Symbol");
				break;

			}
			System.out.println("Do you want to continue (press y for yes and n for No)");
			yn = sc.next();
		} while (yn.equals("y") || yn.equals("Y"));
	}
}
