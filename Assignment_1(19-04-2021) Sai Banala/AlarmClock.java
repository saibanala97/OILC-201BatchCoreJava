package assignment_1;

public class AlarmClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			int n=Integer.parseInt(args[0]);
			if((n<0)||(n>6))
				System.out.println(10/0);
			String s=args[1];
			boolean b=true;
			if(s.equals("true")||s.equals("false"))
				b=Boolean.parseBoolean(s);
			else
				System.out.println(10/0);
			if((n==0)||(n==6)){
				if(b)
					System.out.println("off");
				else
					System.out.println("10:00");
			}
			else if((n>0)&&(n<6)) {
				if(b) {
					System.out.println("10:00");
				}
				else
					System.out.println("7:00");
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}

	}

}
