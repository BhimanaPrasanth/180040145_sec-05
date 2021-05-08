package Exercises;
import java.util.Scanner;
public class UpperLower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		int t;

		if(c>='a'&&c<='z') {
		System.out.println("c+->");
		t=(int)c;
		c=(char)(t-32);
		System.out.println(c);
	}
	else
	{
		System.out.println("c+->");
		t=(int)c;
		c=(char)(t+32);
		System.out.println(c);
	}
		
	}
}
