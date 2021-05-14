package assignment_1;

public class Rounder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		
		int num = Integer.parseInt(args[0]);
		
		if(num%2!=0) {
			System.out.println(num);
		}
		else if(num<0) {
			System.out.println("Error");
		}

		else {
			int res = ((num/10)+1)*10;
			System.out.println(res);
			
		}
		}
		catch(Exception e) {
			System.out.println("Error");
		}

	}

}
