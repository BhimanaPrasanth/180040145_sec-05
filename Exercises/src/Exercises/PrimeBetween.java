package Exercises;

public class PrimeBetween {
	public static void main(String[] args) {
		int t,i;
		for(i=10;i<=99;i++) {
			t=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					t=1;
					break;
							
				}
			}
			if(t==0)
				System.out.println(i);
		}
	}

}
