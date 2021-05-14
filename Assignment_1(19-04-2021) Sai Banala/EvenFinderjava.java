package assignment_1;

public class EvenFinderjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(n%2==0);
		}
		catch(Exception e) {
			System.out.println("Error");
		}

	}

}
