package game;

import java.util.ArrayList;
import fixtures.rooms.Room;
import java.util.Scanner;

public class Main{
	public static final int houseSize = 1;
	public static final int numberOfRooms = 1;
	public static final int maxCommands = 5;
	
	public static void main(String[] args) {
		//Index 0 indicates player
		//Index >0 indicates cats
		//This array store all cats and player instances, they share the Player class
		ArrayList<Player> movingObjects = new ArrayList<Player>();		
				

		//This flag save the result from players action
		//this is the end game condition
		boolean playerInHouse = true;		
		
		//this string arrary store the players command
		//up to "maxCommands" amount of commands can be enter in console
		String[] command = new String[maxCommands];
		Scanner userInput = new Scanner(System.in);

		//game start
		System.out.println("Please Enter Your Name: ");
		command = collectInput(userInput);

		//populate the house with player and cats, these are threads
		//Player constructor takes a name and a Room
		movingObjects.add(new Player(command[0], RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Johnny", RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Wisker", RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Kitkat", RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Persian", RoomManager.getInitialRoom()));

		
		for (int i=0; i<5; i++)
			movingObjects.get(i).start(); 	//bring the player and cats into the house

		//player action start
		while (playerInHouse) { //player not leaving yet

			//print player surrounding description
			printRoom(movingObjects);

			//prompt for input and collect
			System.out.println("What you want to do next: ");			
			collectInput(userInput);

			//execute input command as player taking action
			playerInHouse = parse(command, movingObjects);

			for (Player movingObjectsIterator: movingObjects) {
			//action result for player and cats

			}
		}

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
		
	}

	
	/*****************************************************
	 * This method parse the input command and turn them
	 * into actions
	 * 
	 *****************************************************/
	private static boolean parse(String[] command, ArrayList<Player> movingObjects) {
		return false;
	}
}