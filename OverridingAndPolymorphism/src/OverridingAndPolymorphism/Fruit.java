package OverridingAndPolymorphism;

public class Fruit {
	protected String name;
	protected String taste;
	protected int size;
	
	public Fruit() {
		name = "It";
		taste = "sweet";
		size = 0;
	}
	
	public void eat () {
		System.out.println(name + " tastes so " + taste);
	}
}

