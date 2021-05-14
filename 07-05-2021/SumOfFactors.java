package assignment_7;

import java.util.Scanner;

public class SumOfFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		System.out.println(findSumOfFactors(sc.nextInt()));

	}

	private static String findSumOfFactors(int num) {
		String result = " ";
		int sum = 0;
		String factors = " ";
		for(int i = 1 ; i <= num ; i++) {
				if(num % i == 0) {
				 sum = sum + i;
				 result += i + " ";
				}
			}
		//factors = " factors for given num is : " + i
		result += " are factors & sum of factors = " + sum;
		return result;
	}

}
