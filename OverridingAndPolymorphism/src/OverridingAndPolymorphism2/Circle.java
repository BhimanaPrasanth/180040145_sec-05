package OverridingAndPolymorphism2;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}

	@Override
	public void erase() {
		System.out.println("Erasing circle");
	}
	

}
