package Project;

import java.util.ArrayList;

public class Villain {
	public String displayRandomVillain() {
		ArrayList<String> villains = new ArrayList<String>();
		villains.add("Pah-Wraith Dukat");
		villains.add("Mirror Kira");
		villains.add("Jem'Hadar ");
		villains.add("Kai Winn");
		villains.add("The Breen");
		villains.add("Weyoun");
		villains.add("The Wadi");
		villains.add("Gul Dukat");
		
		int index = (int)(Math.random() * villains.size());
		String randomVillain = villains.get(index);
		return randomVillain;
	}
}
