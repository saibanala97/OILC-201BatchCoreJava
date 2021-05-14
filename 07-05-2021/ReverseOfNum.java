package assignment_7;

import java.util.Scanner;

public class ReverseOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println(findReverseNum(sc.nextInt()));

	}

	public static String findReverseNum(int num) {
		String result = " ";
		int temp = num;
		int rev = 0;
		while (temp > 0) {
			rev = rev * 10 + temp % 10;
			temp = temp / 10;

		}
		result = " reverse of the given number = " + rev;

		return result;

	}

}
