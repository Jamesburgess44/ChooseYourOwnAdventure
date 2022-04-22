package Project;
import java.util.Scanner;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Array to hold the random values
		String[] adventure = {"No selection made", "No selection made", "No selection made"};
		Weapon weapon = new Weapon();
		Settings setting = new Settings();
		Villain villain = new Villain();
		boolean isSelecting = true;
		
		
		while (isSelecting = true) {
		print("What would you like to do?");
		print("Press 1 to choose a setting");
		print("Press 2 to choose a weapon");
		print("Press 3 to choose a villain");
		print("Press 4 to go on an adventure!");
		String response = input("please make a selection");
		switch(response) {
		case "1":
			String randomSetting = setting.displayRandomSetting();
			print("Chief O'Brien will go to " + randomSetting);
			print("");
			adventure[0] = randomSetting;
			break;
		case "2":
			String randomWeapon = weapon.displayRandomWeapon();
			print("Chief O'Brien will set his phaser to " + randomWeapon);
			print("");
			adventure[1] = randomWeapon;
			break;
		case "3":
			String randomVillain = villain.displayRandomVillain();
			print("Chief O'Brien will fight " + randomVillain);
			print("");
			adventure[2] = randomVillain;
			break;
		case "4":
				if (adventure[0] == "No selection made" || adventure[1] == "No selection made" || adventure[2] == "No selection made" ) {
					print("You have not made all of the needed selections");
					break;
				}
				print("Chief O'Brien heads to the " + adventure[0] + "he reaches for his phaser and sets it to " + adventure[1] + "he fires hitting " + adventure[2] + "O'Brien saves the day!");
				isSelecting = false;
			break;
		default:
			print("Invalid selection, try again");
			print("");
			break;
		}}}

	private static void print(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}
	@SuppressWarnings("resource")
	private static String input(String message) {
		print(message);
		Scanner sc = new Scanner(System.in);
		String response = sc.nextLine();
		return response;
	}
	}
