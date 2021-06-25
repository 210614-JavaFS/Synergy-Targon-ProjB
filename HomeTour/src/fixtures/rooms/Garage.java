package fixtures.rooms;


import fixtures.objects.Lawnmower;

public class Garage extends Room {
	private static Lawnmower lawnmower = new Lawnmower();
	
	private Lawnmower lawnmow;
	
	public Garage() {
		super("Garage",
				"A cluttered garage",
				"The storage location for the houses cars and many of its tools. \n"
				+ "You step into the garage where the floor beneath you is rough and stacks of items take up your vision."
				+ " To your west stands the staircase up to a mysterious attic. \n"
				+ "The foyer is to your east. It is the entry to the house. \n"
				+ "Far off you see what appears to be a " + lawnmower.getName() + ". \n"
				+ lawnmower.getLongDescription() + "\n");
				
			
		lawnmower = new Lawnmower();
		


	
	
	}
	
	public void interactWith(String interactLawnmower) {

		System.out.println("Vroom!:");
		
		if (interactLawnmower.equals("lawnmower")) {
			lawnmower.interactWith();
		}
		
	}
	
}



