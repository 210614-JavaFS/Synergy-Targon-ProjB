package fixtures.rooms;

import fixtures.objects.Toilet;

public class Bathroom extends Room {
		
		Toilet toilet = new Toilet();
		
		public Bathroom() {
			super("The Bathroom", "White dirty bathroom", "As you enter the bathroom "+
					"you can see the lights are flikering and the paint on the walls are peeling " +
					"off. The floor seems to be missing tiles and a foul odor is in the air.");		
		}
		
		
		
	}

