package fixtures.rooms;

import fixtures.Fixture;

public class Room extends Fixture {
	
		// array which holds the adjacent rooms to the room you're currently in
		// You might decide that a room in a particular direction always uses a certain index, e.g. 
		// a north exit always goes in index 0, an east exit always goes in index 1, etc.
		// If so, then the size of this array depends on how many directions you want to support.
		public Room[] exits;
		
		public Room(String name, String shortDesc, String longDesc)	{
			super(name, shortDesc, longDesc);
			this.exits = new Room[9];
		}
		
		
		public void setExits() { //add the available exits
			
		}
		
		public Room[] getExits() { //Return all exits, need to check empty *.isNull() in roomModifier
			return exits;
		}
		
		public Room getExits(String direction) { //Return a single exit by direction
			switch (direction) {
				case "north":
					return exits[8];
				case "south":
					return exits[2];
				default:
					return null;
			}
		}
}