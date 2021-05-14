/*
 * Write a program GreatestNumber.java, which accepts two numbers as command line arguments and prints the greatest number of the two. 
 * If the input is not a number, print “Error”.package assignment_1;
 */
package assignment_1;

public class GreatestNumbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		try {
			System.out.println(large(a, b, c));
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	private static String large(int a, int b, int c) {
		if (a > b && a > c)
			return (a + " is greater than " + b + "," + c);
		else if (b > a && b > c)
			return (b + "is greaer than " + a + "," + c);
		else
			return (c + "is greater than " + a + "," + b);

		// return null;
	}

}
