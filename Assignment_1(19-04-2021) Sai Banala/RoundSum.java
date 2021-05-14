package assignment_1;

public class RoundSum {

	public static void main(String[] args) {
		int[] a=new int[args.length];
		int x=0;
		try {
			for(int i=0;i<a.length;i++) {
				a[i]=Integer.parseInt(args[i]);
				if(a[i]<0)
					System.out.println(10/0);
				if(a[i]!=0) {
					int r=a[i]%10;
					if(r>=5) {
						a[i]=(a[i]/10+1)*10;
					}
					else if((r<5)&&(r>0)) {
						a[i]=(a[i]/10)*10;
					}
				}
				x=x+a[i];
			}
		System.out.println(x);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
}
}
