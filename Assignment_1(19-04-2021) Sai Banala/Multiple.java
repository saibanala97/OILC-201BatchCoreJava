package assignment_1;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		
		int res = ((num/100)+1)*100;
		
		/*
		 
		  or
		 
		 int res = ((num+99)/100)*100;
		 
		 */
		 
		
		System.out.println(res);

	}

}
