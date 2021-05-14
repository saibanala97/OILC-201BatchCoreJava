/*
 * Write a program ThreeDPalindrome.java In this program accept a 3 digit integer as a command line argument and return the String true if the integer is a Palindrome or the String false otherwise.
 *  121 - >true
 *   123 -> false
 *    Note: Please do not use Conditional or Looping statements to solve the given problem.
 */

package assignment_1;

public class ThreeDPalindrome {

	public static void main(String[] args) {
		String s = args[0]; // 121

		boolean results = threeDPalindrome(s);
		System.out.println(results);

	}

	public static boolean threeDPalindrome(String s) {

		int n = s.length(); // n = 3

		String a = "";

		a = a + s.charAt(n - 1) + s.charAt(n - 2) + s.charAt(n - 3);

		return s.equals(a);

	}

}
