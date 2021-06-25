package fixtures.objects;

import fixtures.Fixture;

public class Boxes extends Fixture implements Interactive{
	
	public Boxes() {
		super("Lots of boxes ", "Many old cardboards boxes laying on the ground ", 
				"Across the ground there lay dozens of cardboard boxes stacked upon each other, filled with the memories of whoever lived here before.");
	}
	
	

	public void interactWith() {

		System.out.println("You open the box on the ground in front of you ");
		this.setLongDescription("You can now see inside of the cardboard box whici is full of old clothes and other items, charged with memories of the previous owners.");
		
	}

}
