package fixtures.objects;

import fixtures.Fixture;

public class CatTree extends Fixture implements Interactive {
	public CatTree(String name, String shortDesc, String longDesc) {
		super("cat tree",
				"A six foot tall cat tree sits in the corner.", 
				"Perch, lookout tower, dangling toys, you spent a forturne to please your cute masters. \n"
				+ "The shadowy little private apartments are always full of surprises. "
				+ "Sometimes a gentle licking, sometimes a playfull bite.");
	}
	
	public void interactWith () {
	}	
}