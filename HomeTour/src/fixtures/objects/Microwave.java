package fixtures.objects;

import fixtures.Fixture;

public class Microwave extends Fixture implements Interactive{
	
	//Crates the microwave
	public Microwave() {
		super("Microwave",
				"A rusty worn out microwave on a beautiful marble island",
				"The rusted microwave looks as though it hasn't been used in over half a decade."
				+ "It is currently turned off");
	}
	
	//Makes the microwave interactable
	public void interactWith() {
		System.out.println("You put your ramen in the microwave and try to cook it for 2 minutes... nothing happens");
		this.setLongDescription("The rusted microwave looks as though it hasn't been used in over half a century. It" + "is still turned off but has your ramen in it... cold.");
	}

}
