package assignment_1;

public class SignFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int num = Integer.parseInt(args[0]);
			System.out.println(find(num));
		}

		catch (Exception e) {
			System.out.println("Error");
		}

	}

	private static String find(int num) {
		if (num > 0) {
			return ("Positive number");
		} else if (num < 0) {
			return ("Negative Number");
		}

		else {

			return ("Zero");
		}
	}

}
