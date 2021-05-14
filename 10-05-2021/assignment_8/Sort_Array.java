package assignment_8;

import java.util.Scanner;

public class Sort_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[] = new int[10];

		System.out.println("enter 10 values into an Array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		int res[] = sortArray(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(res[i]);
		}
	}

	private static int[] sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

}
