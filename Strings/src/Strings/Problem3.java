package Strings;

public class Problem3 {
	public static void main(String[] args) {
		String str = "Wipro";
		int n = str.length();
		
		String r = "";
		
		if (n < 2) 
			r = str;
		else 
			r = str.substring(0, 2);
		
		String o = "";
		
		for (int i = 0; i < n; i++) {
			o += r;
		}
		
		System.out.println(o);

	}

}

