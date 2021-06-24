package game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import fixtures.rooms.*;
import game.RoomManager;

public class Main{
	public static final int numberOfRooms = 8;
	public static final int maxCommands = 5;
	
	private static HashSet<String> lightMoveAction = new HashSet<String>();
	private static HashSet<String> fastMoveAction = new HashSet<String>();
	private static HashSet<String> lightInteractAction = new HashSet<String>();
//	private static HashSet<String> heavyInteractAction = new HashSet<String>();
	private static HashSet<String> direction = new HashSet<String>();
	
	public static void main(String[] args) throws InterruptedException {
		//Index 0 indicates player
		//Index >0 indicates cats
		//This array store all cats and player instances, they share the Player class
		ArrayList<Player> movingObjects = new ArrayList<Player>();		
		
		// initialize the set of slow moving actions
		lightMoveAction.add("go");
		lightMoveAction.add("walk");
		lightMoveAction.add("pace");
		lightMoveAction.add("stalk");

		// initialize the set of fast moving actions
		fastMoveAction.add("dash");
		fastMoveAction.add("jump");
		fastMoveAction.add("run");
		fastMoveAction.add("hop");
		fastMoveAction.add("leap");

		// initialize the set of light interactions
		lightInteractAction.add("touch");
		lightInteractAction.add("pat");
		lightInteractAction.add("pet");
		lightInteractAction.add("caress");


		// initialize the set of heavy interactions, not implemented
//		heavyInteractAction.add("smash");
//		heavyInteractAction.add("kick");
//		heavyInteractAction.add("punch");

		// initialize the set of moving directions
		direction.add("south");
		direction.add("north");
		direction.add("east");
		direction.add("west");
		direction.add("up");
		direction.add("down");
		
		
		//This flag save the result from players action
		//this is the end game condition
		boolean playerInHouse = true;
		
		//this string array store the players command
		//up to "maxCommands" amount of commands can be enter in console
		String[] command = new String[maxCommands];
		Scanner userInput = new Scanner(System.in);

		
		//game start
		RoomManager.init(numberOfRooms);
		System.out.println("Please Enter Your Name: ");
		command = collectInput(userInput);

		//populate the house with player and cats, these are threads
		//Player constructor takes a name and a Room
		movingObjects.add(new Player(command[0], RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Johnny", RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Whisker", RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Kitkat", RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Persian", RoomManager.getInitialRoom()));

		
		for (int i=0; i<5; i++)
			movingObjects.get(i).start(); 	//bring the player and cats into the house

		//player action start
		while (playerInHouse) { //player not leaving yet

			//print player surrounding description
			printRoom(movingObjects);

			//prompt for input and collect
			System.out.println("What do you want to do next: ");			
			command = collectInput(userInput);

			//execute input command as player taking action
			playerInHouse = parse(command, movingObjects);

			for (Player movingObjectsIterator: movingObjects) {
				//action result for player and cats
				System.out.println(movingObjectsIterator.getCatActions());
			}

		}

		for (Player movingObjectsIterator: movingObjects)
			movingObjectsIterator.terminating();

		// kill all threads
		for (Player movingObjectsIterator: movingObjects)
			if (movingObjectsIterator.isAlive()) {
				try {
					movingObjectsIterator.join();				
				}
				catch (InterruptedException intEcept) {
					break;
				}				
			}
		userInput.close();			
 	}

	
/**************************************************
 * 	This method colllect input from user
 * @param a Scanner object, the console panel
 * @return String array with each individual word separated
 *************************************************/
	private static String[] collectInput(Scanner userInput) {
		String uneditInput = "";
		String[] editInput = new String[maxCommands];
		int headIndex = 0, editInputIndex = 0, inputLength = 0;

		//pause program and wait for user input
		if (userInput.hasNext())
			uneditInput = userInput.nextLine().toString().toLowerCase();
		inputLength = uneditInput.length();

		//check each individual char in the input string
		for (int i=0; i < inputLength; i++)
			//separate each word between spaces
			if (uneditInput.charAt(i) == ' ') {
				editInput[editInputIndex] = new String(uneditInput.substring(headIndex, i));

				//skip extra spaces entered by user
				while ((uneditInput.charAt(i) == ' ') && (i < inputLength))
					i++;
				
				headIndex = i;

				editInputIndex++;
				//stop recording words if reach the maximum allowed words
				if (editInputIndex > maxCommands)
					break;
			}
			//copy the last word
			else if (i == inputLength-1) {
				editInput[editInputIndex] = new String(uneditInput.substring(headIndex, inputLength));
			}
		
		return editInput;
	}
	
	/*****************************************************
     * This method print the surrounding for the player
	 * 
	 *****************************************************/
	private static void printRoom(ArrayList<Player> movingObjects) {
		Room[] allExits = movingObjects.get(0).currentRoom.getExits();
		System.out.println("You are in the " + movingObjects.get(0).currentRoom.getName() + ". \n"
							+ "You look all around you.");
		for (Room exits: allExits)
			if (exits != null) {
				System.out.println("You can see a door leading to the " + exits.getName() + ".");
			}
		System.out.println("You notice there is a " + "object");
	}
	
	/*****************************************************
	 * This method parse the input command and turn them
	 * into actions
	 * 
	 *****************************************************/	
	public static boolean parse(String[] command, ArrayList<Player> movingObjects) {
		if (lightMoveAction.contains(command[0])) {
			if (direction.contains(command[1])) {
				if (movingObjects.get(0).currentRoom.getExits(command[1]) == null)	{
					System.out.println("You " + command[0] + " into the wall.");
				}
				else {
					System.out.println("You " + command[0] + " towards " + movingObjects.get(0).currentRoom.getExits(command[1]).getName() + ".");

					//leaving house
					if (movingObjects.get(0).currentRoom.getExits(command[1]).getName().equals("outside")) return false;
					else {
						//moving to another room
						movingObjects.get(0).currentRoom = movingObjects.get(0).currentRoom.getExits(command[1]);
						}
					}
			}	
			else if (direction.contains(command[2])) {
				if (movingObjects.get(0).currentRoom.getExits(command[2]) == null)	{
					System.out.println("You " + command[0] + "into the wall.");
				}
				else {
					System.out.println("You " + command[0] + " towards " + movingObjects.get(0).currentRoom.getExits(command[2]).getName() + ".");

					//leaving house
					if (movingObjects.get(0).currentRoom.getExits(command[1]).getName().equals("outside")) return false;
					else {
						//moving to another room
						movingObjects.get(0).currentRoom = movingObjects.get(0).currentRoom.getExits(command[1]);
					}
				}
			}
			else {
				System.out.println("You take a deeeeeep breath, and are rethinking what you want to do.");
			}
		}
		else if (fastMoveAction.contains(command[0])) {
			if (direction.contains(command[1])) {
				if (movingObjects.get(0).currentRoom.getExits(command[1]) == null)	{
					System.out.println("You " + command[0] + "into the wall.");
				}
				else {
					System.out.println("You " + command[0] + " towards " + movingObjects.get(0).currentRoom.getExits(command[1]).getName() + ".");
					//leaving house
					if (movingObjects.get(0).currentRoom.getExits(command[1]).getName().equals("outside")) return false;
					else {
						//moving to another room
						movingObjects.get(0).currentRoom = movingObjects.get(0).currentRoom.getExits(command[1]);
					}
				}
			}
			else if (direction.contains(command[2])) {
				if (movingObjects.get(0).currentRoom.getExits(command[2]) == null)	{
					System.out.println("You " + command[0] + "into the wall.");
				}
				else { 
					System.out.println("You " + command[0] + " towards " + movingObjects.get(0).currentRoom.getExits(command[2]).getName() + ".");
					//leaving house
					if (movingObjects.get(0).currentRoom.getExits(command[1]).getName().equals("outside")) return false;
					else {
						//moving to another room
						movingObjects.get(0).currentRoom = movingObjects.get(0).currentRoom.getExits(command[1]);
					}
				}
			}
			else {
				System.out.println("You take a deeeeeep breath, and are rethinking what you want to do.");
			     }
			}			
		else if (lightInteractAction.contains(command[0])) {
			for (int commandIndex = 2; commandIndex < maxCommands; commandIndex++) {
				if (command[commandIndex] != null)
					command[1] = command[1] + ' ' + command[commandIndex];
			}
			int commandIndex = command[1].length() -1;
			while (command[1].charAt(commandIndex) == ' ') commandIndex--;
			command[1] = command[1].substring(0, commandIndex+1);
			
			System.out.println("You " + command[0] + " the " + command[1]);
			movingObjects.get(0).currentRoom.interactWith(command[1]);
// find a way to put room.interact in there : )
		}
//		else if (heavyInteractAction.contains(command[0])) {
// not implemented			
//		}
		else {
			System.out.println("You take a deeeeeep breath, and are rethinking what you want to do.");
		}
		
		return true;
	}
}
