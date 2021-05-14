package assignment_1;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);

			System.out.println(add(a, b, c));
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	private static String add(int a, int b, int c) {

		if (a > 0 && b > 0 && c > 0) {
			int res = ((a / 10) + 1) * 10 + ((b / 10) + 1) * 10 + ((c / 10) + 1) * 10;

			return "" + res;

		} else {
			return "" + ("Error");
		}

	}

}
