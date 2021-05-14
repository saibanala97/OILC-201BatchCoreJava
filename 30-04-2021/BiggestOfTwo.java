package assignment_5;


public class BiggestOfTwo {
	public static void main(String[] args)
	{

		if(args.length!=2) {
			System.out.println(" Please Enter 2 Integer Values");
			return;
		}
		else {
			try {
				int num1=Integer.parseInt(args[0]);
				int num2=Integer.parseInt(args[1]);
				int big;
				
				if(num1>num2)
				{
					big=num1;
				}
				else {
					big=num2;
				}
				
				System.out.println("Largest Of Two Values:"+big);

				}
			catch(NumberFormatException e) {
				System.out.println("Enter Numbers Only");
			}
		}
	}
}
