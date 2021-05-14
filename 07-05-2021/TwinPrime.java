package assignment_7;

import java.util.Scanner;

public class TwinPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Range(Two values):");

		System.out.println(getTwinPrimes(s.nextInt(), s.nextInt()));
	}

	private static String getTwinPrimes(int start, int end) {
		int a[] = new int[40];
		String res = "";
		String res1 = "";
		int k = 0;
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				a[k] = i;
				k++;
			}
		}
		for (int i = 0; i < k; i++) {
			if (a[i + 1] - a[i] == 2) {
				res += a[i] + "," + a[i + 1] + "\n";
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