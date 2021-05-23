package Problem3;

public class Teacher extends Person {
	private int salary;
	private String subject;
	public Teacher(String n,int byear,int s,String sub) {
		super(n,byear);
		salary=s;
		subject=sub;
	}
	public String toString() {
		return "Teacher [salary=" + salary + ", subject=" + subject + "]";
	}

}
