package assignment_1;

/*
 * Write a program EvenFinderjava In this program accept an integer as a command line argument and return the String “true” if the integer is an even number or the String “false” if it is odd. 
 * If an error input like a non-numerical input is passed as an argument or for any other error return the string “Error”. 
 * Note: Please do not use Conditional or Looping statements to solve the given problem.package assignment_1;
 */

public class EvenFinderjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(evenFinderjava(n));

		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	private static String evenFinderjava(int n) {
		return "" + (n % 2 == 0);

	}

}
