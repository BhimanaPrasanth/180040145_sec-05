package Strings;

public class FirstHalf {
	public static void main(String[] args) {
		String str = "TomCat";
		
		String o;
		
		if (str.length() % 2 == 0) {
			o = str.substring(0, str.length() / 2);
		} else {
			o = null;
		}
		
		System.out.println(o);
	}

}

