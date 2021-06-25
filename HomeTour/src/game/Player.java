package game;

import java.util.ArrayList;
import fixtures.rooms.Room;

public class Player extends Thread {
	private String name;
	Room currentRoom;
	
	
	public Player(String name, Room placingRoom) {
		super(name);
		this.name = name;
		this.currentRoom = placingRoom;
	}
}