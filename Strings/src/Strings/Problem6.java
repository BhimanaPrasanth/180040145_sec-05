package Strings;

public class Problem6 {
	public static void main(String[] args) {
		String a="hi";
		String b="hello";
		String o;
		if(a.length()<b.length()) 
			o=a+b+a;
		else 
			o=b+a+b;
		System.out.println(o);
		
		
		
	}

}
