package ClassesAndObjects;
class Health {
	private String name;
	private double height;
	private double weight;
	
	public Health(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public double BMI () {
		return ( weight / ( height * height ) ) * 703;
	}
}
public class Patient {
	public static void main(String[] args) {
		Health health = new Health("Arpan Das", 177/2.54, 59*2.2);
		
		System.out.println(health.BMI());

	}


}
