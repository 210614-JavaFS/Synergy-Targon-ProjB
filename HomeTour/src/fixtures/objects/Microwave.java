package fixtures.objects;

import fixtures.Fixture;

public class Microwave extends Fixture implements Interactive{
	
	public Microwave() {
		super();
		this.name = "Microwave";
		this.shortDescription = "A rusty worn out microwave on a beautiful marble island";
		this.longDescription = "The rusted microwave looks as though it hasn't been used in over half a decade. It" + " is currently turned off";
	}
	
	public void interactWith() {
		System.out.println("You put your ramen in the microwave and try to cook it for 2 minutes");
		this.longDescription =  "The rusted microwave looks as though it hasn't been used in over half a decade. It" + "is still turned off but has your ramen in it... cold.";
	}

}
