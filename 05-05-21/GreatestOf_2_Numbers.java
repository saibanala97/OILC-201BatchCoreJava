

/*
 * Define a method which returns the greatest number among two numbers.

Write the method with the following specifications

Name of method getGreatest() / / which accepts two integer values as argument and return the greatest value.

Arguments: two argument of type integer

Return Type: an integer value

Specifications: The value returned by the method getGreatest() is determined by the following rules

if any of the given numbers are negative, return -1.

if any of the given numbers are zero, return -2.

if the given numbers are positive, return the greatest.package assignment_6;
 */
package assignment_6;

import java.util.Scanner;

public class GreatestOf_2_Numbers {
	static int getGreatest(int fno , int sno) {
		int result = 0;
		if((fno > 0 && sno > 0) && fno > sno) {
			result = fno;
			
		}
		else if(fno == 0 && sno ==0) {
			result = -2;
		}
		else if(fno < 0 && sno < 0) {
			result = -1;
		}
		else {
			result = sno;
		}
		return result;
		
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println(getGreatest(sc.nextInt() , sc.nextInt()));
		
		
		

	}

}
