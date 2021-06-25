package fixtures.rooms;

import fixtures.objects.Boxes;

public class Attic extends Room{
	
	Boxes box = new Boxes();
	
	//Brendan's room, everything can change because it's early
	
	public Attic() {
		super("Attic",
				"A lonely and open attic",
				"The dust in the air of the attic takes your breath away " 
				+ "As you step up the ladder behind you from the garage, " 
				+ "You see a large stacking of cardboard boxes, tinted with age.");
	 }
	
	public void interactWith(String boxInteraction) {
		System.out.println("Old boxes littered across the ground.");
		if(boxInteraction.equals("box")) {
			box.interactWith();
		}
	}
	
}