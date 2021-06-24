package fixtures.objects;

import fixtures.Fixture;

public class TV extends Fixture implements Interactive {
	public TV() {
		super("TV",
				"An outdated faded bronze colored TV with two protruding antennas.",
				"This TV was designed by '*** inc' in the late 1960s. The screen is gray and cracked. "
				+"The TV is turned on despite the crack and is emitting static noise");
	}
	
	
	public void interactWith() {
		System.out.println("You hit the TV with a heavy tap turnning it off.");
		this.setLongDescription("The TV is warm to the touch. May need some repairs as it"
				+ "seems to be on its last legs.");
	}
}


