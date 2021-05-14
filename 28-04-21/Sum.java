package assignment_2;

public class Sum {
	 
    public static void main(String[] args)
    {
        if(args.length!=4)
        {
            System.out.println("Invalid Argument \nplease Enter 4 Values");
            return;
        }
        try {
        int sum = Integer.parseInt(args[0]);
        
        int next = Integer.parseInt(args[1]);
 
        sum = sum + next;
        
        next = Integer.parseInt(args[2]);
 
        sum += next;
 
        next = Integer.parseInt(args[3]);
 
        sum += next;
 
        System.out.println(sum);
        }
        catch(Exception e) {
            System.out.println("Please enter only Numbers");
        }
    }
}
 
