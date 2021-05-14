package assignment2_21_04_21;


public class Adder {
	public static int getSum(int a, int b) {
		return (a+b);
	}
	static boolean validate(int num) {
		if(num > 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			if(validate(a) && (validate(b)) && (args.length == 2)) {
				System.out.println(getSum(a, b));
			}
			else
				System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
