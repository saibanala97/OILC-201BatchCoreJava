package assignment2_21_04_21;

public class EvenNumberTester {
	public static boolean isEven(int num) {
		if (num % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			if (a > b) {
				int c = a;
				a = b;
				b = c;
			}
			if ((a < 0) || (b < 0))
				System.out.println(10 / 0);
			for (int i = a; i <= b; i++) {
				if (isEven(i))
					System.out.print(i + " ");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
