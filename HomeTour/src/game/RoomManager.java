package game;

import fixtures.rooms.*;

/***********************
 This class populates the house
 with rooms.  Every group member
 should register their room in here.
************************/
public class RoomManager {


	// it looks like Room[] rooms is an array that stores Room objects
	private static Room[] rooms;
	private static Room initialRoom;

	public RoomManager (int numberOfRooms) {
		RoomManager.rooms = new Room[numberOfRooms];
	}

	public static Room getInitialRoom() {
		return initialRoom;
	}
	
	public static void init(int numberOfRooms) {
		//create slot for rooms
		RoomManager.rooms = new Room[numberOfRooms];

		//creating the house, put your rooms instantiation here
		Basement basement = new Basement();	
		Foyer foyer = new Foyer();
		Kitchen kitchen = new Kitchen();
		Attic attic = new Attic();
		Garage garage = new Garage();
		Bathroom bathroom = new Bathroom();
		LoungeRoom  lounge = new LoungeRoom();
		Outside outside = new Outside();

		//put rooms into house, assign your rooms to an index in here
		rooms[0] = foyer;
		rooms[1] = basement;
		rooms[2] = kitchen;
		rooms[3] = attic;
		rooms[4] = garage;
		rooms[5] = bathroom;
		rooms[6] = lounge;
		rooms[7] = outside;

		//put your setExits here
		rooms[0].setExits("west", garage);
		rooms[0].setExits("east", bathroom);
		rooms[0].setExits("south", outside);
		rooms[1].setExits("east", lounge);
		rooms[1].setExits("south", attic);
		rooms[2].setExits("west", lounge);
		rooms[2].setExits("south", bathroom);
		rooms[3].setExits("south", garage);
		rooms[4].setExits("north", attic);
		rooms[4].setExits("east", foyer);
		rooms[5].setExits("west", foyer);
		rooms[5].setExits("north", kitchen);
		rooms[6].setExits("west", basement);
		rooms[6].setExits("east", kitchen);


		//starting room, should be be change to foyer once done constructing
		RoomManager.initialRoom = foyer;
	}
}
