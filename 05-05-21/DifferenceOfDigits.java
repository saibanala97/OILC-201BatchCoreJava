/*
 Define a method which returns the difference of digits of the given two digit number.

Note: You should substract the units position value from tens positon value, the return value may be negative.

Write the method with the following specifications

Name of method getDiffOfDigits() // which accepts an integer value as argument and return the difference of it's digits.

Arguments: one argument of type integer

Return Type: an integer value

Specifications: The value returned by the method getDiffOfdigits() is determined by the following rules

if the given value is in between 10 and 99, return difference of it's digits.

Example: if x = 83, 8 - 3 return 5. if x = 38, 3 - 8 return -5.

if the given value is negative, return -3

if the given value is greater than 99, return -2

if the given value is in between 0 and 9, return -1

Read the steps below carefully before you start 1. Download the skeleton code provided
 */
package assignment_6;

import java.util.Scanner;

public class DifferenceOfDigits {
	static int getDiffOfDigits(int given_num) {
		int result = 0;
		int rem = given_num % 10;
		int quo = given_num / 10;
		if (given_num >= 10 && given_num <= 99) {
			result = rem - quo;
		} 
		else if (given_num < 0) {
			result = -3;
		} else if (given_num > 99) {
			result = -2;

		} else {
			result = -1;
		}
		return   result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println(getDiffOfDigits(sc.nextInt()));
		

	}

}
