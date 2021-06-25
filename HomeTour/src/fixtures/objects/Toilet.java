package fixtures.objects;

import fixtures.Fixture;

public class Toilet extends Fixture implements Interactive{
	
	public Toilet() {
		super("Toilet",
				"A marble toilet",
				"The toilet seems like it hasn't been cleaned in ages. "
				+ "There is a crack along its side and missing the toilet seat");
	}
	
	public void interactWith() {
		System.out.println("You flushed the toilet and now it's clogged!");
		this.setLongDescription("The uncleansed toilet now has the bowl filled with a strange fluid." 
		+ "It is now clogged and we don't want to mess with it.");
	}

}