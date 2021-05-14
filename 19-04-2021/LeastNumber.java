package assignment_1;

public class LeastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);

			System.out.println(lNum(a, b, c));

		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	private static String lNum(int a, int b, int c) {
		if (a < b && a < c)
			return (a + " is less than " + b + "," + c);
		else if (b < a && b < c)
			return (b + " is less than " + a + "," + c);
		else
			return (c + " is less than " + a + "," + b);

	}

}
