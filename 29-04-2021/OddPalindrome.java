package assignment_3;

/*
 If the numbers are not in this range OR if startNum is greater than endnum, then return the String “error”. · 
 If there are no palindromes in between the given numbers return and empty string. ·
  The numbers in the output string must be separated by a comma as shown. 
 Input: 100, 200 
 output: 101,111,121,131,141,151,161,171,181,191
 */

import java.util.Scanner;

 

public class OddPalindrome {

 

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