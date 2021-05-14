package assignment_5;

public class BiggestOf_5_Vales {

		public static void main(String[] args) {
			if(args.length != 5) {
				System.out.println("Please pass 5 arguments");
				return;
			}
			
			try {
				int bigNum = Integer.parseInt(args[0]);
				int nextNum = Integer.parseInt(args[1]);
				
				if(bigNum < nextNum) {
					bigNum = nextNum;
				}
				
				nextNum = Integer.parseInt(args[2]);
				
				if(bigNum < nextNum) {
					bigNum = nextNum;
				}
				
				nextNum = Integer.parseInt(args[3]);
				
				if(bigNum < nextNum) {
					bigNum = nextNum;
				}
				
				nextNum = Integer.parseInt(args[4]);
				
				if(bigNum < nextNum) {
					bigNum = nextNum;
				}
				
				System.out.println("Biggest Number is: "+ bigNum);
			}
			catch(NumberFormatException ne) {
				System.out.println("Please enter Integer values only");
			}
			
		}
	}
