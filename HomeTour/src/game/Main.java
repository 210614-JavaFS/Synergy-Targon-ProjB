package game;

import java.util.ArrayList;
<<<<<<< HEAD
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
=======
import fixtures.rooms.Room;
import java.util.Scanner;

public class Main{
	public static final int houseSize = 1;
	public static final int numberOfRooms = 1;
	public static final int maxCommands = 5;
>>>>>>> d5cfc481ceaa5b478cb224a0c04ead5c1b3813e0
	
	public static void main(String[] args) {
		//Index 0 indicates player
<<<<<<< HEAD
<<<<<<< HEAD
		//Index >0 indicates ghost

		boolean playerAlive = true;
		String[] command;

=======
		//Index >0 indicates cats
		//This array store all cats and player instances, they share the Player class
		ArrayList<Player> movingObjects = new ArrayList<Player>();		
				
		boolean playerInHouse = true;		
		
		String[] command = new String[maxCommands];
		Scanner userInput = new Scanner("System.in");
		
>>>>>>> d5cfc481ceaa5b478cb224a0c04ead5c1b3813e0
		System.out.println("Please Enter Your Name: ");
		command = collectInput(userInput);
		
		movingObjects.add(new Player(command[0], RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Johnny", RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Wisker", RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Kitkat", RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Persian", RoomManager.getInitialRoom()));

		movingObjects.get(0).start(); 	//bring the player into the house

<<<<<<< HEAD
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
=======
>>>>>>> d5cfc481ceaa5b478cb224a0c04ead5c1b3813e0

		while (playerInHouse) { //player not leaving yet
			// life cycle of player and cats

<<<<<<< HEAD
<<<<<<< HEAD
			printRoom(movingObjects[0])
=======
			printRoom(movingObjects.get(0));
>>>>>>> parent of a279591 (cathouse-v3)
			collectInput();
=======
			printRoom(movingObjects.get(0));
			collectInput(userInput);
			parse(command, movingObjects.get(0)); //turn user command into player action
>>>>>>> d5cfc481ceaa5b478cb224a0c04ead5c1b3813e0

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
	
<<<<<<< HEAD
	private static String collectInput() {
		//need faulty input safe guard
<<<<<<< HEAD
=======
		String inputBuffer = "";
		return inputBuffer;
>>>>>>> parent of a279591 (cathouse-v3)
=======
	private static String[] collectInput(Scanner userInput) {
		String uneditInput = "";
		String[] editInput = new String[maxCommands];
		int headIndex = 0, editInputIndex = 0, inputLength = 0;
		
		if (userInput.hasNext()) {
			 uneditInput = userInput.nextLine().toString().toLowerCase();
		}
		
		inputLength = uneditInput.length();
		for (int i=0; i < inputLength; i++)
			if (uneditInput.charAt(i) == ' ') {
				editInput[editInputIndex] = new String(uneditInput.substring(headIndex, i-1));
				while (uneditInput.charAt(i) == ' ')
					i++;
				headIndex = i;
				editInputIndex++;
				if (editInputIndex > maxCommands)
					break;
			}
			else if (i == inputLength-1) {
				editInput[editInputIndex] = new String(uneditInput.substring(headIndex, i-1));
			}
		
		return editInput;
>>>>>>> d5cfc481ceaa5b478cb224a0c04ead5c1b3813e0
	}
	
	private static void parse(String[] command, Player player) {
		
	}
 }
}