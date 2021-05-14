package assignment_4;


public class Sum {

	public static void main(String[] args) {
		int sum = 0 , read;
		for(int i = 0; i < args.length; i++) {
			read = Integer.parseInt(args[i]);
			sum = sum + read;
		}
		System.out.println("sum : " + sum);
	}

}
