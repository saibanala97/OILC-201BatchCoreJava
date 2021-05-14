package assignment_8;

import java.util.Scanner;

public class PrimesArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[] = new int[10];

		System.out.println("enter 10 values into an Array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("Prime Numbers:" + findPrime(arr));
	}

	private static String findPrime(int[] arr) {
		String res = "";

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				res += " " + arr[i];
			}
		}
		return res;
	}

	private static boolean isPrime(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

}
