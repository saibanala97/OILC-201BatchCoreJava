package assignment2_21_04_21;

public class CheckArmStrong {

	public static void main(String[] args) {
		try {
		int num = Integer.parseInt(args[0]);
		int len = args[0].length();

		System.out.println(findAmstrong(num, len));
		}
		catch(Exception e){
			System.out.println("Error");
			
		}

	}

	private static String findAmstrong(int num, int len) {
		int sum = 0;
		int temp = num;

		if (len == 4 && num > 0) {
			while (temp > 0) {
				int e = temp % 10;
				sum = sum + e * e * e * e;
				temp = temp / 10;

			}
		}
		else {
			return ""+(10/0);

		}

		if (num == sum) {
			return ("Armstrong");
		} else {

			return ("not an Armstrong");
		}

	}

}
