/*
 Define a method which returns the 1 if the given number is positive, return -1 if the given number is negative, return 0 if the given number is 0.

Write the method with the following specifications

Name of method findSign() // which accepts an integer value as argument and return 1 if the argument value is positive, return -1 in case of negative value, return 0 if the argument value is 0.

Arguments: one argument of type integer

Return Type: an integer value

Specifications: The value returned by the method findSign() is determined by the following rules:

if any of the given number is positive, return 1.

if any of the given number is negative, return -1.

if any of the given number is zero, return 0.
 */

package assignment_6;

import java.util.Scanner;

public class SignFinder {
	static int findSign(int given_num) {
		int result = 0;
		if(given_num > 0) {
			result = 1;
		}
		else if(given_num == 0) {
			result = 0;
		}
		else {
			result = -1;
		}
		return result;
		
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println(findSign(sc.nextInt()));

	}

	
}
