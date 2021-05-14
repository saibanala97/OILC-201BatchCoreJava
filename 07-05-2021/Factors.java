package assignment_7;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		System.out.println(findFactors(sc.nextInt()));

	}

	 static String findFactors(int num) {
		String result = " ";
		for(int i = 1 ; i <= num ; i++) {
			if(num % i == 0) {
				result += i + " ";
			}
		}
		return result;
	}

}
