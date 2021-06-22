package fixtures.objects;

import fixtures.Fixture;

public class BasementObjects extends Fixture implements Interactive {
	public BasementObjects(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	public void interactWith () {
	}
	
}