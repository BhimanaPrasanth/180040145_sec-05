package ClassesAndObjects;
class Cal {
	public static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
	
	public static double powerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}
}


public class Calculator {
	public static void main(String[] args) {
		System.out.println(Cal.powerInt(12, 2));
		System.out.println(Cal.powerDouble(1.5, 2));
	}


}
