package fixtures.objects;

import fixtures.Fixture;

public class Lawnmower extends Fixture implements Interactive{
	
	public Lawnmower() {
		super("Lawnmower",
				"A rusty lawnmower sitting in the corner",
				"The lawnmower is old and rusty from years of use. It is sitting in the most cluttered corner of the garage amongst power tools and old oil containers."
				+ "The lawnmower appears to be off, though the strange vibrations make it seem otherwise."
				+ "Pulling the cord should start it.");
			
		
		
	}
	
	public void interactWith() {
		System.out.println("You started the old lawnmower. The blade beneath spins!");
		this.setLongDescription("The lawnmower is on, the scraggly overgrown grass outside is ready to be cut.");
	}

}