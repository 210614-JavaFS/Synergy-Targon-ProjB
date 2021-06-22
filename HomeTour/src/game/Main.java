package game;

import java.util.ArrayList;
import fixtures.rooms.Room;
import fixtures.rooms.Basement;

public class Main{
	public static final int houseSize = 1;
	
	public static void main(String[] args) {
		//Index 0 indicates player
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

		while (playerInHouse) { //player not leaving yet
			// life cycle of player and cats

			printRoom(movingObjects.get(0));
			collectInput();

			for (Player movingObjectsIterator: movingObjects) {
			// player and cats doing chores
				
			}
		}
		
		// kill all threads
		for (Player movingObjectsIterator: movingObjects)
			try {
				movingObjectsIterator.join();				
			}
			catch (InterruptedException intEcept) {
				break;
			}
 	}
	
	private static void printRoom(Player player) {
		
	}
	
	private static String collectInput() {
		//need faulty input safe guard
		String inputBuffer = "";
		return inputBuffer;
	}
	
	private static void parse(String[] command, Player player) {
		
	}
}