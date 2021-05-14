package assignment2_21_04_21;

public class ListFactors {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			if (num < 0)
				System.out.println(10 / 0);
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					System.out.print(i + " ");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
