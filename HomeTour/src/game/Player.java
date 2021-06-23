package game;

import java.util.ArrayList;

import fixtures.rooms.Room;

public class Player extends Thread {
	private String name;
	private static int catNumber;
	private boolean isACat;
	private Thread threadID;
	Room currentRoom;
	
	
	public Player(String name, Room placingRoom) {
		this.name = name;
		this.currentRoom = placingRoom;

		//cat identifier
		if (catNumber > 0)
			this.isACat = true;
		else
			this.isACat = false;

		Player.catNumber ++;
	}
	

	
	public void start() { // Create a player
		this.threadID = new Thread(this); 
		
		if (isACat)
			run(isACat);
		else
			run();
	}

	public void run() { // Player action
		System.out.println("I'm "+ this.name);
	}

	public void run(boolean isACat) { // Cat action
		System.out.println("Your cat " + this.name + "is walking ");
	}
}