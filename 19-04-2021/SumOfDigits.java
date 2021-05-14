/*Write a program SumOfDigits.java, which accepts a two digit number as command line argument and prints the sum of its digits. 
Ex: 
	Input: 35 Output: 8 
	Input: 88 Output: 16 
	Note: Do not use Conditional or Looping statements while solving the problem.
	*/

package assignment_1;

public class SumOfDigits {

	public static void main(String[] args) {

		int value = Integer.parseInt(args[0]);
		
		String sum = sumOfDigits(value);
		System.out.println(sum);

	}

	public static String sumOfDigits(int num) {

		int fno = num % 10; // fno = 58%10 ==> fno = 5
		int sno = num / 10; // sno = 58/10 ==> sno = 8
		int sum = fno + sno; // sum = 5+8 ==> sum = 13

		return " " + sum;
	}

}
