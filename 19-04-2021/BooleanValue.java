package assignment_1;

public class BooleanValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = new String[args.length];
		Boolean[] b = new Boolean[s.length];
		try {
			for (int i = 0; i < s.length; i++) {
				s[i] = args[i];
				if ((s[i].equals("true")) || (s[i].equals("false"))) {
					b[i] = Boolean.parseBoolean(s[i]);
				} else
					System.out.println(10 / 0);
			}
			int count = 0;
			for (int i = 0; i < s.length; i++) {
				if (b[i]) {
					count++;
				}
			}
			if (count >= 2)
				System.out.println("true");
			else
				System.out.println("false");
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
