package assignment_4;


public class WishJava {

	public static void main(String[] args) {
		if (args[0].equalsIgnoreCase("AM")) {
			System.out.println("Good Morning " + args[1]);
		}
		else if(args[0].equalsIgnoreCase("PM")) {
			System.out.println("Good Evening " + args[1]);
		}
		else {
			System.out.println("First Argument Should be either AM or PM");
		}
	}

}
