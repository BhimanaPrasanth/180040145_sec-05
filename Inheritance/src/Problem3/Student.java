package Problem3;

public class Student extends Person {
	private int stuid;
	public Student(String n,int byear,int sid){
		super(n,byear);
		stuid=sid;
	}
	public String toString() {
		return "Student [stuid=" + stuid + "]";
	}

}
