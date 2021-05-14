package assignment_7;

/*7)Wap to check whethe the given number is strong number or not
145 -> 1! + 4!+5! */

import java.util.Scanner;


public class Strong_Num {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		
		System.out.println(isStrongNum(s.nextInt()));
	}

	private static String isStrongNum(int num) 
	{
		String res="";
		int rem,res1=0,temp=num;
		while(num>0) {
			rem=num%10;
			res1+=fact(rem);
			num=num/10;
		}
		if(res1==temp) {
			res="Strong NUmber";
		}
		else {
			res="Not a Strong Number";
		}
		return res;
	}

	private static int fact(int rem) 
	{
		int fact=1;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
