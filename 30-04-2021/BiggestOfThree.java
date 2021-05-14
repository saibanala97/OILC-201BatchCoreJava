package assignment_5;

public class BiggestOfThree {


	public static void main(String[] args) 
	{
		if(args.length!=3)
		{
			System.out.println(" Please Enter 3 Integer Values");
			return;
		}
		else
		{
			try
			{
				int bignum=Integer.parseInt(args[0]);
				int nextnum=Integer.parseInt(args[1]);
				
				if(bignum<nextnum) {
				bignum=nextnum;
				}
				
				nextnum=Integer.parseInt(args[2]);
				if(bignum<nextnum) {
				bignum=nextnum;
				}
				
				System.out.println("Largest Of Three Values:"+ bignum);
			}
			catch(NumberFormatException e) {
				System.out.println("Please Enter only Numbers");
			}
		}
	}

}



