//1. Wap read 10 values into an array and find biggest of an array?

package assignment_8;

import java.util.Scanner;

public class Biggest_Val_Array {
	public static String findBigVal(int arrVals[]) {
		int bigVal = arrVals[0];

		for (int i = 0; i < arrVals.length; i++) {

			if (bigVal <  arrVals[i]) {
				bigVal = arrVals[i];
			}
		}
		String res = "Biggest  Value is : " + bigVal;
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
		System.out.println(findBigVal(arrVals));

	}

}
