package Project;
import java.util.ArrayList;

public class Settings {
	public String displayRandomSetting() {
		ArrayList<String> settings = new ArrayList<String>();
		settings.add("The Promenade");
		settings.add("Quark's Bar");
		settings.add("The Infirmary");
		settings.add("The Replimat");
		settings.add("The Bajoran Temple");
		settings.add("Garak's Clothing shop");
		settings.add("Odo's Office");
		settings.add("The Holosweets");
		
		int index = (int)(Math.random() * settings.size());
		String randomSetting = settings.get(index);
		return randomSetting;
	}
}
