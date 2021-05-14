package assignment_6;

import java.util.Scanner;

public class SumOfDigits {
	static int getSumOfDigits(int given_num) {

		int result = 0;
		if (given_num >= 10 && given_num <= 99) {
			int rem = given_num % 10;
			int quo = given_num / 10;

			result =  quo + rem;

		}
		else if (given_num < 0) {
			result = -3;

		} else if (given_num > 99) {
			result = -2;
		} else {
			result = -1;
		}

		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println(getSumOfDigits(sc.nextInt()));

	}

}
