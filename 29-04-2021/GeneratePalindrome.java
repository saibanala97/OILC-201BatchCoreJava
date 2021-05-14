package assignment_3;

import java.util.Scanner;



public class GeneratePalindrome {

 

    public static void main(String[] args)
    {
        int startnum,endnum;
        Scanner s=new Scanner(System.in);
        System.out.println("enter start number:");
        startnum=s.nextInt();
        System.out.println("enter end Number:");
        endnum=s.nextInt();
        
        try {
            if((startnum>=100||endnum<=999)&&(startnum<endnum))
                System.out.println(getOddPalindromeList(startnum,endnum));
            else
                System.out.println(10/0);
        }
        catch(Exception e) {
            System.out.println("Error");
        }
    }

 

    private static String getOddPalindromeList(int startnum, int endnum) 
    {
        String str="";
        for(int i=startnum;i<=endnum;i++) 
        {
            if(i%2!=0)  
            {
                if(isPalindrome(i)) 
                {
                    str=str+i+",";
                }
            }
        }
        return str;
    }

 

    private static boolean isPalindrome(int i) 
    {
        if(i%10==i/100)
            return true;
        else
            return false;
    }

 

}