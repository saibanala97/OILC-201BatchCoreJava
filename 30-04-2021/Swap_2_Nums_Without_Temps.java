package assignment_5;

import java.util.Scanner;

public class Swap_2_Nums_Without_Temps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		System.out.print("Enter num1 :");
		int num1 = sc.nextInt();
		System.out.print("Enter num2 :");
		int num2 = sc.nextInt();
		System.out.println("Values before swaping : " + num1 + "," + num2);

		swap(num1, num2);

	}

	private static void swap(int num1, int num2) {

		num1 = num1 + num2; // num1 = 10 + 20 ==> num1 = 30;
		num2 = num1 - num2; // num2 = 30-20 ==> num2 = 10;
		num1 = num1 - num2; // num1 = 30 - 20 ==> num2 = 20;
		System.out.println("Vales After swaping : " + num1 + "," + num2);

	}
}
