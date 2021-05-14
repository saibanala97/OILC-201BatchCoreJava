package assignment2_21_04_21;


public class Prime {
	public static boolean isPrime(int num) {
		for(int i = 2;i < num;i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			if(num <= 0)
				System.out.println(10 / 0);
			System.out.println(isPrime(num));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
