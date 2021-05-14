package assignment_1;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
	
			int a =	Integer.parseInt(args[0]);
			int b =	Integer.parseInt(args[0]);
			int c =	Integer.parseInt(args[0]);
		
		
		if(a>0 && b>0 && c>0) {
		 a = ((Integer.parseInt(args[0])/10)+1)*10;
		 b = ((Integer.parseInt(args[0])/10)+1)*10;
		 c = ((Integer.parseInt(args[0])/10)+1)*10;
		 int res = a+b+c;
		 
		 System.out.println(res);
			
			
		}
		else {
			System.out.println("Error");
		}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
	}

}
