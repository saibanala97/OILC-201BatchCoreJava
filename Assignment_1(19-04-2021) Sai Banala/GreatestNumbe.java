package assignment_1;

public class GreatestNumbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
	     int c = Integer.parseInt(args[2]);
		try {
			if(a>b && a>c)
				System.out.println(a + " is greater than " +b +"," + c);
			else if(b>a && b>c)
				System.out.println(b + "is greaer than " + a + "," +c);
			else
				System.out.println(c + "is greater than " + a + "," + b);
					
		}
		catch(Exception e) {
			System.out.println("Error");
		}

	}

}
