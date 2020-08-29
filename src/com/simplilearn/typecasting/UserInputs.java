package com.simplilearn.typecasting;

import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number");
		int userNumber = input.nextInt();
		System.out.println("the number is "+userNumber);
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter a number");
		String userNumber1 = input1.nextLine();
		int userInt = Integer.parseInt(userNumber1);
		double userDouble = Double.parseDouble(userNumber1);
		long userLong = Long.parseLong(userNumber1);
		System.out.println("the string is "+userNumber1);
		System.out.println("the int is "+userInt);
		System.out.println("the double is "+userDouble);
		System.out.println("the long is "+userLong);
		
	}

}
