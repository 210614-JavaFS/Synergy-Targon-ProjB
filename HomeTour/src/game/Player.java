package game;

import java.util.concurrent.Semaphore;

import fixtures.rooms.Room;

public class Player extends Thread {
	private String name;
	private static int ghostNumber = 0;
	Room currentRoom;
	
	public Player(String name, Room placingRoom) {
		this.name = name;
		this.currentRoom = placingRoom;
		Player.ghostNumber ++;
	}
	

	
	public void start() { // Create a player

	}

	public void start(boolean isAGhost) { // Create a ghost

	}

	

	public void run() { // Player action
		
	}

	public void run(boolean isAGhost) { // Ghost action
		
	}

}