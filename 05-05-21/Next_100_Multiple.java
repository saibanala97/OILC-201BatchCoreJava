/*Define a method which returns the next multiple of 100 for the given number.

Write the method with the following specifications

Name of method getNextMultipleOf100() // which accepts an integer value as argument and return the next multiple of 100.

Arguments: one argument of type integer

Return Type: an integer value

Specifications: The value returned by the method getNextMultipleOf100() is determined by the following rules

if the given value is negative or zero, return -1

if the given value is positive, return the next multiple of the given number.

Example: if x = 123, return 200.
*/
package assignment_6;

import java.util.Scanner;

public class Next_100_Multiple {
	static int getNextMultipleOf100(int given_num) {
		int result = 0;
		if (given_num > 0) {
			// ((num + 99)/100)*100;
			
			result = ((given_num + 99) / 100) * 100;
		}
		else {
			result = -1;
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		System.out.println(getNextMultipleOf100(sc.nextInt()));
		

	}

}
