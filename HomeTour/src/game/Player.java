package game;

import java.util.concurrent.Semaphore;

import fixtures.rooms.Room;

public class Player extends Thread {
	private String name;
	private static int catNumber = 0;
	Room currentRoom;
	
	public Player(String name, Room placingRoom) {
		this.name = name;
		this.currentRoom = placingRoom;
		Player.catNumber ++;
	}
	

	
	public void start() { // Create a player
		
	}

	public void start(boolean isACat) { // Create a cat johnny, whiskers, kitkat, persian.

	}

	

	public void run() { // Player action
		
	}

	public void run(boolean isACat) { // Cat action
		
	}
}