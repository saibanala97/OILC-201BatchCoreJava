package assignment_7;

import java.util.Scanner;

public class StarPattern_1 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a value:");

		System.out.println(createStarPattern(s.nextInt()));
	
	}

	private static String createStarPattern(int val) 
	{
		
		String res="";
		
		if(val<0) {
			res=""+-1;
		}
		else if(val==0) {
			res=""+-2;
		}
		else {
			for(int i=1;i<=val;i++) {
				for(int j=1;j<=i;j++) {
					res+=" * ";
				}
				res+="\n";
			}
		}
		return res;
		
	}

}
