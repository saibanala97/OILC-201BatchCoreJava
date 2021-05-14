package assignment2_21_04_21;


public class Factorial_2 {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			if(num < 0)
				System.out.println(10 / 0);
			for(int i = num - 1;i > 0;i--) {
				num = num * i;
			}
			System.out.println(num);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
