package Exercises2;
import java.util.Scanner;
public class GenderInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String gender=sc.nextLine();
		int age=sc.nextInt();
		if(gender.equalsIgnoreCase("Female")) {
			if(age>=1&&age<=58)
				System.out.println("Interest=8.2%");
			else if(age>58&&age<=128)
				System.out.println("Interest=7.6%");
		}
		else {
			if(age>=1&&age<=60)
				System.out.println("Interest=9.2%");
			else if(age>60&&age<=120)
				System.out.println("Interest=8.3%");
			
		}
		}
	

}
