package assignment2_21_04_21;

public class Factorial {
	

	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		System.out.print("factors of the given num");
		findFactorial(num);
	}
	
		
	
		
	private static void findFactorial(int n) {
		int i;
		for(i=1; i<=n; i++) {
			if(n>0 && n%i == 0) {
				
				System.out.println(" "+i);
				}
			else
				System.out.println("Error");
			
		}
		
		
	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*try {
		int num = Integer.parseInt(args[0]);
		System.out.println(findFact(num));

	}
		catch(Exception e) {
			System.out.println("Error");
		}

	private static String findFact(int num) {
		int i;
		for(i=1; i>=num; i++) {
			if(num%i == 0) {
				return " "+ i;
			}
		
			else if(num%i != 0){
				return ""+(10/0);
			}
			else
			{
				return "error";
			}
		}
		
            	return null;
	}

}
*/