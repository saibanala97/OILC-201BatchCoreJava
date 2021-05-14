package assignment2_21_04_21;

public class FizzBizz {

	 

    public static void main(String[] args) {
        try {
            System.out.println(getOutputString(Integer.parseInt(args[0])));
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

 

    private static String getOutputString(int n) 
    {
    	if(n>0) {   
        if (n % 3 == 0 && n % 5 == 0)
            return "FIZZBIZZ";
        else if (n % 5 == 0)
            return "BIZZ";
        else if (n % 3 == 0)
            return "FIZZ";
        else
        	return "" + n;
    	}
    	return ""+10/0;
    }

 

}