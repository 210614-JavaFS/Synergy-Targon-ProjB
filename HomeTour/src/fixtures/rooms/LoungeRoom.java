package fixtures.rooms;

import fixtures.objects.TV;

public class LoungeRoom extends Room {
	
	//creates TV object
	private TV tv = new TV();


	public LoungeRoom() {
		super("LoungeRoom",
			"A cozy-looking, but unfinished living room.",
			"A chalky smell enters your nostrils as you walk across the heated marble floors into the room. " 
			    + "\n"
		   +"Overhead you can see an empty emerald chandelier swaying rhythmically."
		   +"\n"
		   + "Running your hands across the rough paint job on the walls, you spot a TV in the far back "
		   + "next to a kitchen to the east. "
		   +"\n"
		   + "Opposite to the kitchen you spot stairs going down to the basement."    
		   +"\n"
			+ "You let out a sigh as you crouch down next to the translucent window being showered with snowdrops.");

			
		tv = new TV();
		
	}
	
	public void interactWith (String tvInteraction) {
		
		System.out.println(" " + tvInteraction);
		
		if (tvInteraction.equals("tv")) {
			tv.interactWith();
		}
		
	}
}