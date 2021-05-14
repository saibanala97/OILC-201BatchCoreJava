package assignment_8;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[] = new int[10];

		System.out.println("enter 10 values into an Array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println(reverseArray(arr));

	}

	private static String reverseArray(int[] arr) {
		String res = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			res += " " + arr[i];
		}
		return res;
	}

}
