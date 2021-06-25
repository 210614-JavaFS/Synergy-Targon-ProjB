package fixtures.rooms;

import fixtures.objects.TV;

public class LoungeRoom extends Room {
	
	//creates TV obje
	private static TV tv = new TV();


	public LoungeRoom() {
		super("LoungeRoom",
			"A cozy-looking, but unfinished living room.",
			"A chalky smell enters your nostrils as you walk across the heated marble floors across the room. " 
			    + "\n"
				+"\n"
		   +"Overhead you can see an empty emerald chandelier swaying rhythmically."
		   		+"\n"
		   + "Running your hands across the rough paint job on the walls, you spot a " + tv.getName() + " in the far back "
		   + "next to a kitchen to the east."
		   		+"\n"
		   + tv.getShortDescription() + " You can touch the tv."
		   		+ "\n"
		   		+ "\n"
		   + "To the west you spot stairs going down to the basement."    
		   +"\n"
			+ "You let out a sigh as you crouch down next to the translucent window being showered with snowdrops.");
		
		
	}
	
	public void interactWith (String tvInteraction) {
		
		System.out.println("The " + tvInteraction + " is sleek to the touch.");
		System.out.println("\n");
		System.out.println(tv.getLongDescription());
		if (tvInteraction.equals("tv")) {
			tv.interactWith();
		}
	}
	

}