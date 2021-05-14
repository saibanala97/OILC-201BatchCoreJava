package assignment_3;

import java.util.Scanner;



public class OccurrenceCounter {

 

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int len=s.nextInt();
        int a[]=new int[len];
        try {
        System.out.println("Enter "+len+" values into Array");
        
        for(int i=0;i<len;i++) 
        {
            a[i]=s.nextInt();
        }
        
        System.out.println("Enter a number:");
        int n=s.nextInt();
        
        System.out.println("occurence count is :" + getCount(a,n));
        }
        catch(Exception e) {
            System.out.println("-1");
        }
    }

 

    private static String getCount(int[] a, int n)
    {
        int count=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==n) {
                count++;
            }
        }
        return ""+count;
    }

 

}