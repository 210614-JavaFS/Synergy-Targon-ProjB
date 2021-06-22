package game;

import fixtures.rooms.Basement;
import fixtures.rooms.Room;

/***********************
 This class populates the house
 with rooms.  Every group member
 should register their room in here.
************************/
public class RoomManager {
<<<<<<< HEAD
<<<<<<< HEAD
	Room StartingRoom;
	Room[] rooms;
=======
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
>>>>>>> d5cfc481ceaa5b478cb224a0c04ead5c1b3813e0

		
<<<<<<< HEAD
=======
//	Room StartingRoom;
//	Room[] rooms;

	public void init() {		
>>>>>>> parent of a279591 (cathouse-v3)
=======
		//starting room, should be be change to foyer once done constructing
		RoomManager.initialRoom = basement;
>>>>>>> d5cfc481ceaa5b478cb224a0c04ead5c1b3813e0
	}
}
