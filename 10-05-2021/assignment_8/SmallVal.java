package assignment_8;

import java.util.Scanner;

public class SmallVal {

	public static String findSmallVal(int arrVals[]) {
		int smallVal = arrVals[0];

		for (int i = 0; i < arrVals.length; i++) {

			if (smallVal > arrVals[i]) {
				smallVal = arrVals[i];
			}
		}
		String res = "small  Value is : " + smallVal;
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
		System.out.println(findSmallVal(arrVals));

	}

}
