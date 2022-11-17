package com.mayur.assignment13OctString;

import java.util.Scanner;

public class InsertTwoString {

	public static String addStringUsingSubString(String s1, String s2, int pos) {
		return s1.substring(0, pos) + s2 + s1.substring(pos);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String str1 = sc.nextLine();
		System.out.println("Enter 2nd String");
		String str2 = sc.next();

		System.out.println("Enter Index of String");
		String ThirdString = addStringUsingSubString(str1, str2, sc.nextInt());

		System.out.println(ThirdString);
	}
}
