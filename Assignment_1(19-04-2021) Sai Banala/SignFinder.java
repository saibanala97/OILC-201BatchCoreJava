package assignment_1;

public class SignFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int num = Integer.parseInt(args[0]);
			if(num>0 ) {
				System.out.println("Positive number");
			}
			else if(num<0) {
				System.out.println("NAgative Number");
			}
			
			
			else  {
			
			System.out.println("Zero");
			}
			}
			
			
			catch(Exception e){
				System.out.println("Error");
			}

	}

}
