package assignment_1;

public class DigitChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = Integer.parseInt(args[0]);
		int fno = num%10;  //fno = 58%10 ==> fno = 5
		int sno =num/10;   //sno = 58/10 ==> sno = 8
		int diff = fno-sno;   // diff = 5+8 ==> sum = 13
		System.out.println("diff of two digits= " +diff);

}
}
