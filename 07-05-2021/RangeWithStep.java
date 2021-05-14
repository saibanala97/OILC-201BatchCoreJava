package assignment_7;

import java.util.Scanner;

public class RangeWithStep {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Range(Two Values) and a step value");
		
		System.out.println(getNumbersInRanges(s.nextInt(),s.nextInt(),s.nextInt()));
		
	}

	private static String getNumbersInRanges(int start, int end, int step) 
	{
		String res="";
		
		if(start<0 || end<0) {
			res= ""+-1;
		}
		else if(start==end) {
			res=""+-2;
		}
		else if(start>end) {
			res=""+-3;
		}
		else {
			int i=start+1;
			while(i<end) {
				res+=i+" ";
				i+=step;
			}
		}
		return res;
	}

}
