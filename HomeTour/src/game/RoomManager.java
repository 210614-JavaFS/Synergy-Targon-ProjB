package game;

import fixtures.rooms.Room;

/***********************
 This class populates the house
 with rooms.  Every group member
 should register their room in here.
************************/
public class RoomManager {
	private static Room[] rooms;
	private static Room initialRoom;
	
	public RoomManager (int numberOfRooms) {
		RoomManager.rooms = new Room[numberOfRooms];
	}
	
	public static Room getInitialRoom() {
		return initialRoom;
	}
	
	public static void init() {			
		//creating the house, put your rooms instantiation here
		Basement basement = new Basement();	
		
		
		//put rooms into house, assign your rooms to an index in here
		rooms[0] = basement;

		//starting room, should be be change to foyer once done constructing
		RoomManager.initialRoom = basement;
	}
}
