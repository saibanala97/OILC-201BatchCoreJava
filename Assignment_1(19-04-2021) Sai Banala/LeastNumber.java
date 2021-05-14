package assignment_1;

public class LeastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
		     int c = Integer.parseInt(args[2]);
		     
			if(a<b && a<c)
				System.out.println(a + " is less than " +b +"," + c);
			else if(b<a && b<c)
				System.out.println(b + " is less than " + a + "," +c);
			else
				System.out.println(c + " is less than " + a + "," + b);
					
		}
		catch(Exception e) {
			System.out.println("Error");
		}

	}

}
