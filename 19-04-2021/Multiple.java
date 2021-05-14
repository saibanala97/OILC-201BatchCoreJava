/*Write a program Multiple.java, which accepts an int values as command line argument and print the next multiple of 100.
 *  Ex:
 *   Input: 35 Output:
 *    100 Input: 435 Output: 500 
 *    Note: Please do not use Conditional or Looping statements to solve the given problem.
 *    
 */

package assignment_1;

public class Multiple {

	public static void main(String[] args) {

		int value = Integer.parseInt(args[0]);
		Multiple m1 = new Multiple();
		m1.multiple(value);

	}

	public void multiple(int num) {

		int res = ((num / 100) + 1) * 100;

		/*
		 * or int res = ((num+99)/100)*100;
		 * 
		 */
		System.out.println(res);

	}

}
