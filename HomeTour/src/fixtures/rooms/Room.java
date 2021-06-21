package fixtures.rooms;

import fixtures.Fixture;

public class Room extends Fixture {
		public Room[] exits;
		public Room(String name, String shortDesc, String longDesc)	{
			super(name, shortDesc, longDesc);
			this.exits = new Room[9];
		}
		
		public void setExits() { //add the vailable exits
			
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