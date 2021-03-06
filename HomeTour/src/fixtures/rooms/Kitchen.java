package fixtures.rooms;

import fixtures.objects.Microwave;

public class Kitchen extends Room {
	
	//added my object to my room
	Microwave mic = new Microwave();
	
	
	//Creates the kitchen
	public Kitchen() {
		super("Kitchen",
				"an immaculate, all-white kitchen",
				"Blinded by the pearly white cabinetry and sterling silevr appliances. In the north among a beautiful marble island is an out of place microwave"
				+ "\n"
						+ "To the south is dirty white bathroom, with a pungent odor coming from it... someone must have forgot to flush the toilet!"
				+ "\n"
						+ "To the west is a cozy-looking lounge room with an outdated televison. ");
		
	}
	
	//Allows player to interact with microwave
	public void interactWith(String micInteraction) {
		System.out.println("It looks as though it'll work.");
		if(micInteraction.equals("microwave")) {
			mic.interactWith();
		}
	}
	
}
