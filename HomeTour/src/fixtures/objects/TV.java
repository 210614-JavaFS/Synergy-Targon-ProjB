package fixtures.objects;

import fixtures.Fixture;

public class TV extends Fixture implements Interactive {
	public TV() {
		super("TV",
				"An outdated black TV. It is strangely satisfying to look at.",
				"The screen is gray and cracked. Despite its rough look, this \n"
				+ "TV model type is only made in Japan. "
				+ "It is known for its lightweight and emaculate architecture. \n"
				+ "Produced in the late 2010s by **** designer. "
				+"\n"
				+"The TV is turned on despite the crack and is emitting static noise");
	}
	
	//nothing
	public void interactWith() {
		System.out.println("You hit the TV with a heavy tap turning it off. \n"
	+ "The TV is warm to the touch. May need some repairs as it"
				+ " seems to be on its last legs.");
		
	}
}


