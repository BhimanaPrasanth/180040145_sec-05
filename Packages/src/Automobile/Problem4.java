package Automobile;

import Automobile.fourwheeler.Ford;
import Automobile.fourwheeler.Logan;

public class Problem4 {

	public static void main(String[] args) {
		Logan logan = new Logan("Mahindra Logan", "AP16F2222", "Bob Marley", 220, 1);
		logan.getModelName();
		logan.getOwnerName();
		logan.getRegistrationNumber();
		logan.getSpeed();
		System.out.println("Has GPS? " + logan.gps());
		
		System.out.println();
		
		Ford ford = new Ford("Ford Figo", "AP16F4444", "Alice", 300, 1);
		ford.getModelName();
		ford.getOwnerName();
		ford.getRegistrationNumber();
		ford.getSpeed();
		System.out.println("Has AC? " + ford.tempControl());
		

	}

}
