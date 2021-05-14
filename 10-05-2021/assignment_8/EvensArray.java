package assignment_8;

import java.util.Scanner;

public class EvensArray {

	public static String findEvens(int arrVals[]) {
		String res = "even values are : ";

		for (int i = 0; i < arrVals.length; i++) {

			if (arrVals[i] % 2 == 0) {
				int even = arrVals[i];
				res += " " + even;
			}
		}

		return res;
	}

	public static void dispArray(int arrVals[]) {
		System.out.println("Elements in this arrVals Array :");
		for (int i = 0; i < arrVals.length; i++) {
			System.out.println(arrVals[i]);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 Array Values : ");
		int[] arrVals = new int[10];
		for (int i = 0; i < arrVals.length; i++) {
			arrVals[i] = sc.nextInt();
		}
		dispArray(arrVals);
		System.out.println(findEvens(arrVals));

	}

}
