package assignment2_21_04_21;


public class Polindrome {
    static boolean isPolindrome(int num) {
        int x = num, r ,sum = 0;
        while(num > 0) {
            r = num % 10;
            sum = sum * 10 + r;
            num = num / 10;
        }
        if(sum == x)
            return true;
        else
            return false;
    }
    static String check(boolean b) {
        if(b)
            return "true";
        else
            return "false";
    }
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            if(num < 0) {
                System.out.println(10/0);
            }
            System.out.println(check(isPolindrome(num)));
        }
        catch(Exception e) {
            System.out.println("Error");
        }
    }
}

