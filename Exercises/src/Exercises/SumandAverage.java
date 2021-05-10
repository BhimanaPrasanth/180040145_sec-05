package Exercises2;

public class SumandAverage {
	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5};
		int sum=0;
		float avg=0.0f;
		for(int ele:a)
			sum=sum+ele;
		avg=(float)sum/a.length;
		System.out.println(sum+" "+avg);
	}

}
