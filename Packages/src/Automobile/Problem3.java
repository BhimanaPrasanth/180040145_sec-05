package Automobile;
import Automobile.Honda;
import Automobile.twowheeler.Hero;

public class Problem3 {

	public static void main(String[] args) {
		Hero hero = new Hero("Glamour 125", "AP16A9999", "Vin Diesel", 85);
		hero.getModelName();
		hero.getOwnerName();
		hero.getRegistrationNumber();
		hero.getSpeed();
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda City", "AP09P7777", "Raja Ramesh", 110);
		honda.getModelName();
		honda.getOwnerName();
		honda.getRegistrationNumber();
		honda.getSpeed();
		honda.cdplayer();

	}
}
