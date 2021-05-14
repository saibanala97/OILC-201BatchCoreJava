package assignment_1;

public class ThreeDPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = args[0]; //121
		
		int n = s.length(); // n = 3
		
		String a = ""; 
		
		a = a+s.charAt(n-1)+s.charAt(n-2)+s.charAt(n-3);
		
		System.out.println(s.equals(a));

	}

}
