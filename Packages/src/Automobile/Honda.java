package Automobile;

public class Honda extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	

	public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}

	@Override
	public void getModelName() {
		System.out.println("modelName: " + modelName);
	}

	@Override
	public void getRegistrationNumber() {
		System.out.println("registrationNumber: " + registrationNumber);
	}

	@Override
	public void getOwnerName() {
		System.out.println("ownerName: " + ownerName);
	}
	
	public void getSpeed() {
		System.out.println("Speed: " + speed);
	}
	
	public void cdplayer() {
		System.out.println("Accessing CD Player.");
	}

}
