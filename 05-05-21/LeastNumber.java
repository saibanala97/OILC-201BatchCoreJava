package assignment_6;

import java.util.Scanner;

public class LeastNumber {
	static int getLeastNum(int fno , int sno) {
		int result = 0;
		if((fno > 0 && sno > 0) && fno > sno) {
			result = sno;
			
		}
		else if(fno == 0 && sno ==0) {
			result = -2;
		}
		else if(fno < 0 && sno < 0) {
			result = -1;
		}
		else {
			result = fno;
		}
		return result;
		
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println(getLeastNum(sc.nextInt() , sc.nextInt()));
		
		
		

	}

}
