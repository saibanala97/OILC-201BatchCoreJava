package assignment_3;

import java.util.Scanner;

 

public class RussianMultiplication {

 

    public static void main(String[] args) {
        int n1, n2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first Number");
        n1 = s.nextInt();
        System.out.println("Enter second number");
        n2 = s.nextInt();

 

        System.out.println(getProduct(n1, n2));
    }

 
 
    private static String getProduct(int n1, int n2) {
        int product = 0;
        if (n1 > 0 && n2 > 0) {
            if (n1 % 2 != 0) {
                product = product + n2;
            }
            while (n1 != 1) {
                n1 = n1 / 2;
                n2 = n2 * 2;
                if (n1 % 2 != 0) {
                    product = product + n2;
                }

 

            }
            return "" + product;
        } else
            return "" + -1;

 

    }
}