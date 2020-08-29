package com.simplilearn.typecasting;

import java.util.Scanner;

public class ConversionFromStringsToPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("enter a string");
		String userString = input.nextLine();
		int userInt = Integer.parseInt(userString);
		long userLong = Long.parseLong(userString);
		float userFloat = Float.parseFloat(userString);
		double userDouble = Double.parseDouble(userString);
		
		System.out.println("your string is "+ userString);
		System.out.println("your int is "+ userInt);
		System.out.println("your long is "+ userLong);
		System.out.println("your float is "+ userFloat);
		System.out.println("your double is "+ userDouble);
		
	}

}
