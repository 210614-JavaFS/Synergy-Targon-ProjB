package fixtures.rooms;

import fixtures.objects.TV;

public class LoungeRoom extends Room {
	
	//creates TV obje
	private static TV tv = new TV();


	public LoungeRoom() {
		super("LoungeRoom",
			"A cozy-looking, but unfinished living room.",
			"A chalky smell enters your nostrils as you walk across the heated marble floors into the room. " 
			    + "\n"
		   +"Overhead you can see an empty emerald chandelier swaying rhythmically."
		   +"\n"
		   + "Running your hands across the rough paint job on the walls, you spot a " + tv.getName() + "in the far back "
		   + "next to a kitchen to the east. "
		   +"\n"
		   + tv.getShortDescription() + "\n"
		   + "Opposite to the kitchen you spot stairs going down to the basement."    
		   +"\n"
			+ "You let out a sigh as you crouch down next to the translucent window being showered with snowdrops.");
		
		
	}
	
	public void interactWith (String tvInteraction) {
		
		System.out.println("A very fancy looking " + tvInteraction);
		
		if (tvInteraction.equals("tv")) {
			System.out.println(LoungeRoom.tv.getLongDescription());
			LoungeRoom.tv.interactWith();
		}
	}
	

}