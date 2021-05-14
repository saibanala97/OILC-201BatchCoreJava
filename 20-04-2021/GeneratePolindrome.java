package assignment2_21_04_21;

import java.util.Scanner;

public class GeneratePolindrome {
	
	static String output="";
	static String getPolindromeList(int num) {
		int x, r, rev=0, sum;
		x=num;
		output = output + x ;
		while(num > 0) {
			r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		if(rev == x)
			return output;
		output = output + "," + rev + ",";
		sum = x + rev;
		return getPolindromeList(sum);
	}
	static boolean check(int num) {
		if((num < 100) || (num >= 1000)) {
			System.out.println("Error");
			return false;
		}
		else
			return true;
				
	}
	public static void main(String[] args) {
		int num = 165;
		if(check(num))
		 System.out.println(getPolindromeList(num));
	}

}
