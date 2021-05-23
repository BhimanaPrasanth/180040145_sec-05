package Problem3;

public class CollegeStudent extends Student {
	private String collName;
	private String Year;
	public CollegeStudent(int sid,String cn,String y,String n,int byear) {
		super(n,byear,sid);
		collName=cn;
		Year=y;
	}
	public String toString() {
		return "CollegeStudent [collName=" + collName + ", Year=" + Year + "]";
	}

}
