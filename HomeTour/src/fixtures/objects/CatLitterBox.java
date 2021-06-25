package fixtures.objects;

import fixtures.Fixture;

public class CatLitterBox extends Fixture implements Interactive {
	private boolean litter;
	
	public CatLitterBox() {
		super("litter boxes",
				"Line up toilets for your small masters.", 
				"Love thy neighbour as thyself, but even thyself flush toilets right?\n"
				+ "Why can't the little ones learn to go to toilet and flush them?\n"
				+ "You smile as you say to yourself, what a sweet burden.");
		setLitter();
	}
	
	public void interactWith () {
		if (litter) {
			System.out.println("You patiently dug out the clumping cat litter.");
			litter = false;
		}
		else
			System.out.println("You refill the sand in the litter box.");
	}
	
	public void setLitter() {
		litter = true;
	}	
}