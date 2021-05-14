
/*
 * Define a method which returns the 1 if the given three digit number is palindrome, in other case return 0.

Write the method with the following specifications

Name of method isPalindrome() // which accepts an integer value as argument and return true if the given number is palindrome, else retrun false.

Arguments: one argument of type integer

Return Type: an integer value

Specifications: The value returned by the method isPalindrome() is determined by the following rules

if the given number is an three digit number, retun 1 if the number is palindrome, else return 0.

Example: if x = 232, return 1. if x = 345, return 0

if the given number is negative or zero, return -1

if the given number is not an three digit number, return -2package assignment_6;

 */
package assignment_6;

import java.util.Scanner;

public class Palindrome {
	 private static int isPalindrome(int num) {
	        int res = 0, n, temp = num;
	        int count = 0;
	        if (num <= 0) {
	            return -1;
	        } else {
	            while (num > 0) {
	                n = num % 10;
	                res = res * 10 + n;
	                num = num / 10;
	                count++;
	            }
	            if (count != 3) {
	                return -2;
	            } else if (res == temp) {
	                return 1;
	            } else {
	                return 0;
	            }
	        }
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		System.out.println(isPalindrome(sc.nextInt()));

	}

}

