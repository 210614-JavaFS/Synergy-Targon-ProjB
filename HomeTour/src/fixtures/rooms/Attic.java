package fixtures.rooms;

import fixtures.objects.Boxes;

public class Attic extends Room{
	
	Boxes box = new Boxes();
	
	//Brendan's room, everything can change because it's early
	
	public Attic() {
		super("Attic",
				"A lonely and open attic",
				"The dust in the air of the attic takes your breath away" 
				+ "As you step up the ladder behind you from the foyer, " 
				+ "You see a large stacking of cardboard boxes, tinted with age.");
	 }
}