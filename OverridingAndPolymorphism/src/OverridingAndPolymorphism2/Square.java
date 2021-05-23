package OverridingAndPolymorphism2;

public class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing square");
	}

	@Override
	public void erase() {
		System.out.println("Erasing square");
	}
	

}
