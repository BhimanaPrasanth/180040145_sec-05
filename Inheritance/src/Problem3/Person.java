package Problem3;

public class Person {
	private String name;
	private int birthyear;
	public Person(String n,int byear) {
		name=n;
		birthyear=byear;
	}
	public String toString() {
		return "Person [name=" + name + ", birthyear=" + birthyear + "]";
	}

}
