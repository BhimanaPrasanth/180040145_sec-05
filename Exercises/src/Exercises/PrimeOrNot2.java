package Exercises;
import java.util.Scanner;
public class PrimeOrNot2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter int number: ");
		int n=sc.nextInt();
		int c=0;
		if(n==0||n==1)
			System.out.println(n+" is neither prime nor composite");
		else {
			for(int i=1;i<=n;i++) {
				if(n%i==0)
					c++;
			}
		}
		if(c==2)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
			
	}

}
