package Project;

import java.util.ArrayList;

public class Weapon {
	public String displayRandomWeapon() {
		ArrayList<String> weapon = new ArrayList<String>();
		weapon.add("stun");
		weapon.add("heat");
		weapon.add("kill");
		weapon.add("disintegrate");
		weapon.add("ERROR:     Warning: This Star Fleet issued Phaser has not been activated, please see the manual and follow the setup steps");
		
		
		
		int index = (int)(Math.random() * weapon.size());
		String randomWeapon = weapon.get(index);
		return randomWeapon;
	}
}
