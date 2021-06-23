package fixtures.objects;

import fixtures.Fixture;

public class TV extends Fixture implements Interactive {
	public TV() {
		super("TV",
				"An outdated faded bronze colored TV with two protruding antennas.",
				"This TV was designed by '*** inc' in the late 1960s. The screen is gray and cracked. "
				+"The Tv is turned on despite the crack and is emitting static noise");
	}
	
	
	public void interactWith() {
		
	}
}
