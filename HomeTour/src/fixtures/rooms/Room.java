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
			this.exits = new Room[4];
		}
		
		//we need a second parameter which is a room object
		
		
		public void setExits(String direction, Room exits) { //add the available exits
			switch (direction) {
				case "north":
					this.exits[0] = exits;
					break;
				case "south":
					this.exits[1] = exits;
					break;
				case "east":
					this.exits[2] = exits;
					break;
				case "west":
					this.exits[3] = exits;
					break;
				default:
					break;
			}
		}
		
		public Room[] getExits() { //Return all exits, need to check empty *.isNull() in roomModifier
			return exits;
		}
		
		public Room getExits(String direction) { //Return a single exit by direction
			switch (direction) {
				case "north":
					return exits[0];
				case "south":
					return exits[1];
				case "east":
					return exits[2];
				case "west":
					return exits[3];
				default:
					return null;
			}
		}
}
