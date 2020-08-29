package com.simplilearn.typecasting;

import java.util.Scanner;

public class ExerciseToConvertIntIntoFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an integer value");
		int userInt = input.nextInt();
		long userLong = (long) userInt;
		float userFloat = (float) userInt;
		double userDouble = (double) userInt;
		System.out.println("your number is"+userInt);
		System.out.println("your long is"+userLong);
		System.out.println("your float is"+userFloat);
		System.out.println("your double is"+userDouble);
		
		
	}

}
