package fixtures.objects;

import fixtures.Fixture;

public class Boxes extends Fixture implements Interactive{
	
	public Boxes() {
		super("Lots of boxes", "Many old cardboards boxes laying on the grund", 
				"Across the ground there lay dozens of cardboard boxes stacked upon each other, filled with the memories of whoever lived here before.");
	}
	
	

	public void interactWith() {

		System.out.println("You open the box on the ground in fron of you");
		this.setLongDescription("Inside of the cardboard box is old clothes and other items, filled with memories of the previous owners.");
		
	}

}
