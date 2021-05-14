/*
 Name of method isEven() // which accepts an integer value as argument and return 1 if the given number is even, else retrun 0.

Arguments: one argument of type integer

Return Type: an integer value

Specifications: The value returned by the method isEven() is determined by the following rules

if the given number is an even number, return 1 else return 0. Example if x = 22, return 1. if x = 35, return 0

if the given number is negative or zero, return -1package assignment_6;
 */
package assignment_6;

import java.util.Scanner;

public class Even {
	static int isEven(int num) {
		int result = 0;
		if (num > 0 && num % 2 == 0) {
			result = 1;
		} else {
			result = 0;
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println(isEven(sc.nextInt()));

	}

}
