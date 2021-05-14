/*
 * Write a program DigitChecker.java, which accepts a two digit number as command line argument and prints Zero if the digits are same and if the two digits are different, it prints their difference. 
 * Ex: 
 * Input: 52 Output: 3 
 * Input: 88 Output: 0 
 * Note: Please do not use Conditional or Looping statements to solve the given problem.
 *
 * */

package assignment_1;

public class DigitChecker {

	public static void main(String[] args) {

		int value = Integer.parseInt(args[0]);

		// DigitChecker dc = new DigitChecker();
		String s = digitChecker(value);
		System.out.println(s);

	}

	public static String digitChecker(int num) {
		int fno = num % 10; // fno = 58%10 ==> fno = 5
		int sno = num / 10; // sno = 58/10 ==> s no = 8
		int diff = fno - sno; // diff = 5+8 ==> sum = 13
		return " " + diff;

	}
}
