package fixtures.rooms;

//import fixtures.objects.Interactive;
import fixtures.objects.Lawnmower;

public class Garage extends Room {
	
	private Lawnmower lawnmower;
	
	public Garage() {
		super("Garage",
				"A cluttered garage",
				"The storage location for the houses cars and many of its tools. \n"
				+ "You step into the garage, where the floor beneath you is rough and stacks of items take up your vision. \n"
				+ "You push your way through a pile of rusty tools, brushing past used tires, where a rake sits at the top of the staircase leading to the basement. \n"
				+ "Through the windows, you notice the overgrown grass out front, when the sight of the old lawnmower below you catches your eye.");
			
		lawnmower = new Lawnmower();
		


	
	
	}
	
	public void interactWith(String whatToInteract) {

		System.out.println("Vroom!: " + whatToInteract);
		
		if (whatToInteract.equals("lawnmower")) {
			lawnmower.interactWith();
		}
		
	}
	
}


	

