/*
Define a method which returns the string as "Even" if the given number is an even number, return "Odd" if the given number is an odd number, return string as "Invalid Input" if the given number is less than or equal to 0.

Write the method with the following specifications

Name of method isEvenOrOdd() // which accepts an integer value as argument.

Arguments: one argument of type integer

Return Type: an String value (Even/Odd/Invalid Input)

Specifications: The value returned by the method isEvenOrOdd() is determined by the following rules

if the given number is negative or zero, return "Invalid Input"

if the given number is even, return "Even"

if the given number is odd, return "Odd"
 */


package assignment_6;

import java.util.Scanner;

public class EvenOrOdd {
	 static String isEvenOrOdd(int given_num) {
		 String result = " ";
		 if(given_num > 0 && given_num % 2 == 0) {
			 result = "even";
		 }
		 else if(given_num <= 0 ) {
			 result = "invalid input";
		 }
		 else {
			 result = "odd";
		 }
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println(isEvenOrOdd(sc.nextInt()));
		
		
	}

	

}
