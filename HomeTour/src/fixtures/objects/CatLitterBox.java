package fixtures.objects;

import fixtures.Fixture;

public class CatLitterBox extends Fixture implements Interactive {
	public CatLitterBox() {
		super("litter box",
				"Line up toilets for your small masters.", 
				"Love thy neighbour as thyself, but even thyself flush toilets right?\n"
				+ "Why can't the little ones learn to go to toilet and flush them?\n"
				+ "You smile as you say to yourself, what a sweet burden.");
	}
	
	public void interactWith () {
		System.out.println("This is Litter box.");
	}	
}