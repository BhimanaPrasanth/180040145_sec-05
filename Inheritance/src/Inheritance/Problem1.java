package Inheritance;
class Animal {
	
	public void eat () {
		System.out.println("Animal is eating");
	}
	
	public void sleep () {
		System.out.println("Animal is sleeping");
	}
}
class Bird extends Animal{

	@Override
	public void eat() {
		System.out.println("Bird is eating");
	}

	@Override
	public void sleep() {
		System.out.println("Bird is sleeping");
	}
	public void fly() {
		System.out.println("Bird is flying");
		
	}
	
}
public class Problem1 {
	public static void main(String[] args) {
		Animal an=new Animal();
		an.eat();
		an.sleep();
		
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
