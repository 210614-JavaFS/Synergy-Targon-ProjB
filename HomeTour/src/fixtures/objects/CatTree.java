package fixtures.objects;

import fixtures.Fixture;

public class CatTree extends Fixture implements Interactive {
	public CatTree() {
		super("cat tree",
				"A six foot tall cat tree sits in the corner.", 
				"Perch, lookout tower, dangling toys, you spent a forturne to please your cute masters. \n"
				+ "The shadowy little private apartments are always full of surprises. "
				+ "Sometimes are gentle sniffing and licking, sometimes a playfull bite, but if its a scratch, they mean business.");
	}
	
	public void interactWith() {
			System.out.println("This is cat tree.");
	}	
}