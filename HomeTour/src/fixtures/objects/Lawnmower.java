package fixtures.objects;

import fixtures.Fixture;

public class Lawnmower extends Fixture implements Interactive{
	
	public Lawnmower() {
		super("Lawnmower",
				"A rusty lawnmower sitting in the corner",
				"The lawnmower is old and rusty from years of use. It is sitting in the most cluttered corner of the garage amongst power tools and old oil containers."
				+ "It is off at the moment");
	}
	
	public void interactWith() {
		System.out.println("Pulling the cord will power the lawnmower on.");
		this.setLongDescription("The lawnmower is on, the blade spins from beneath, the overgrown grass outside is ready to be cut.");
	}

}