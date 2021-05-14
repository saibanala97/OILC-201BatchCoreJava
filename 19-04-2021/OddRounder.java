package assignment_1;

public class OddRounder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int num = Integer.parseInt(args[0]);

			System.out.println(round(num));
		}

		catch (Exception e) {
			System.out.println("Error");
		}
	}

	private static String round(int num) {
		if (num > 0 && num % 2 == 0) {
			return ("Even Number");
		} else if (num < 0) {
			return ("Error");
		}

		else {
			return "" + ((num / 10) + 1) * 10;

		}
	}

}
