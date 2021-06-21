package game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.*;

public class Main{
	
	public static void main(String[] args) {
		ArrayList<Player> movingObjects = new ArrayList<Player>();
		//Index 0 indicates player
		//Index >0 indicates ghost

		boolean playerAlive = true;
		String[] command;

		System.out.println("Please Enter Your Name: ");
		collectInput();
		parse(command, player); //why take a player?
		
		movingObjects.add(new Player(playerName, initRoom));

		movingObjects[0].start(); 	//bring the player back to life 

		while (playerAlive) { //player not dead
			// life cycle of player and ghosts

			printRoom(movingObjects[0])
			collectInput();

			for (Player movingObjectsIterator: movingObjects) {
			// player and ghost doing chores
				
			}
		}
		
		// kill all ghosts and player
		for (Player movingObjectsIterator: movingObjects)
			movingObjectsIterator.join();
 	}
	
	private static void printRoom(Player player) {
		
	}
	
	private static String collectInput() {
		//need faulty input safe guard
	}
	
	private static void parse(String[] command, Player player) {
		
	}
}