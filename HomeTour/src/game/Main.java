package game;

import java.util.ArrayList;
import fixtures.rooms.Room;
import fixtures.rooms.HongsRoom;

public class Main{
	public static final int houseSize = 1;
	
	public static void main(String[] args) {
		//Index 0 indicates player
		//Index >0 indicates kids
		ArrayList<Player> movingObjects = new ArrayList<Player>();		

		
		//creating the house, create your rooms here
		HongsRoom hongsRoom = new HongsRoom();
		

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
			// life cycle of player and ghosts

			printRoom(movingObjects.get(0));
			collectInput();

			for (Player movingObjectsIterator: movingObjects) {
			// player and ghost doing chores
				
			}
		}
		
		// kill all ghosts and player
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