package assignment_1;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int num = Integer.parseInt(args[0]);
			
		if(num%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}

	}
		catch(Exception e) {
			System.out.println("Error");
		}

	}
}
