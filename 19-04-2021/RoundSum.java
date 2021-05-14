/* Write a program SumOfDigits.java, which accepts a two digit number as command line argument and prints the sum of its digits.
   Ex: Input: 35 Output: 8 
   Input: 88 Output: 16 
   Note: Do not use Conditional or Looping statements while solving the problem.
  
 */

package assignment_1;

public class RoundSum {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int sum = 0;
		sum = sum + Integer.parseInt(round(a)) + Integer.parseInt(round(b)) + Integer.parseInt(round(c));
		System.out.println(sum);

	}

	private static String round(int n) {
		if (n % 10 >= 5) {
			return "" + (((n / 10) + 1) * 10);
		} else {
			return "" + ((n / 10) * 10);
		}
	}
}
