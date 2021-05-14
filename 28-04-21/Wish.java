package assignment_2;

public class Wish {
	 
    public static void main(String[] args)
    {
        String res="";
        if(args[0].equalsIgnoreCase("AM")){
            res = "Good Morning: "+args[1];
        }
        else if( args[0].equalsIgnoreCase("PM")){
            res = "Good Evening: "+args[1];
        }
        else {
            res = "First argument should be Either AM or PM";
        }
        System.out.println(res);
    }
 
}
