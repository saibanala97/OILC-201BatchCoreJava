package assignment_7;

import java.util.Scanner;

public class Polindrome {
    static String  findPolindrome(int num) {
    	String result = " ";
        int x = num, r ,sum = 0;
        while(num > 0) {
            r = num % 10;
            sum = sum * 10 + r;
            num = num / 10;
        }
        if(sum == x) {
           result = x + " is a Palindrome ";
        }
        else {
        	 result = x + " is a not Palindrome ";
        }
		return result;
    }
    
    public static void main(String[] args) {
      
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number :");
            System.out.println(findPolindrome(sc.nextInt()));
        }
       
    
}

