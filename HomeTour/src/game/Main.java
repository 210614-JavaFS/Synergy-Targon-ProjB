package game;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Iterator;
import java.util.concurrent.*;

public class Main{
=======
import fixtures.rooms.Room;
import fixtures.rooms.Basement;

public class Main{
	public static final int houseSize = 1;
>>>>>>> parent of a279591 (cathouse-v3)
	
	public static void main(String[] args) {
		ArrayList<Player> movingObjects = new ArrayList<Player>();
		//Index 0 indicates player
<<<<<<< HEAD
		//Index >0 indicates ghost

		boolean playerAlive = true;
		String[] command;

		System.out.println("Please Enter Your Name: ");
		collectInput();
		parse(command, player); //why take a player?
		
		movingObjects.add(new Player(playerName, initRoom));

		movingObjects[0].start(); 	//bring the player back to life 
=======
		//Index >0 indicates cats
		ArrayList<Player> movingObjects = new ArrayList<Player>();		

		
		//creating the house, create your rooms here
		Basement hongsRoom = new Basement();
		

		//starting room, should be foyer
		Room initRoom = hongsRoom;

		
		boolean playerInHouse = true;
		
		String[] command = null;

		System.out.println("Please Enter Your Name: ");
		collectInput();
		
		movingObjects.add(new Player(command[0], initRoom));

		movingObjects.get(0).start(); 	//bring the player back to life 

		parse(command, movingObjects.get(0)); //why take a player?
>>>>>>> parent of a279591 (cathouse-v3)

		while (playerAlive) { //player not dead
			// life cycle of player and ghosts

<<<<<<< HEAD
			printRoom(movingObjects[0])
=======
			printRoom(movingObjects.get(0));
>>>>>>> parent of a279591 (cathouse-v3)
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
<<<<<<< HEAD
=======
		String inputBuffer = "";
		return inputBuffer;
>>>>>>> parent of a279591 (cathouse-v3)
	}
	
	private static void parse(String[] command, Player player) {
		
	}
 }
}