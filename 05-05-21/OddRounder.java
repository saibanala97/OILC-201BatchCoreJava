
/*
 * Define a method which returns the number itself if it is an even number, if the number is odd then return the next multiple of 10.

Write the method with the following specifications

Name of method oddRounder() // which accepts an integer value as argument and return the same value if it is an even number, if the value is odd then return the next multiple of 10. Example if x = 24 then return 24, if x = 25 then return 30.

Arguments: one argument of type integer

Return Type: an integer value

Specifications: The value returned by the method oddRounder() is determined by the following rules

if any of the given number is negative, return -1.

if any of the given number is zero, return -2.

if the given number is even, return the same number.

if the given number is odd, return the next multiple of 10package assignment_6;
 */
package assignment_6;
import java.util.Scanner;


public class OddRounder {
	static int oddRounder(int given_num) {
		int result = 0;
		if(given_num > 0  && given_num % 2 == 0) {
			result = given_num;
		}
		else if(given_num == 0 ) {
			result = -2;
		}
		else if(given_num < 0) {
			result = -1;
		}
		else {
			result = ((given_num + 9) / 10) * 10;
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		System.out.println(oddRounder(sc.nextInt()));

	}

}
