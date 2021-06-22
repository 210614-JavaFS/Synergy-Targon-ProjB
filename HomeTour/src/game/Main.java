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
				
		boolean playerInHouse = true;		
		
		String[] command = new String[maxCommands];
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please Enter Your Name: ");
		command = collectInput(userInput);
		
		movingObjects.add(new Player(command[0], RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Johnny", RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Wisker", RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Kitkat", RoomManager.getInitialRoom()));
		movingObjects.add(new Player("Persian", RoomManager.getInitialRoom()));

		for (int i=0; i<5; i++)
			movingObjects.get(i).start(); 	//bring the player and cats into the house

		while (playerInHouse) { //player not leaving yet
			// life cycle of player and cats
			printRoom(movingObjects);
			collectInput(userInput);
			parse(command, movingObjects); //turn user command into player action

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
		userInput.close();			
 	}
	
	private static String[] collectInput(Scanner userInput) {
		String uneditInput = "";
		String[] editInput = new String[maxCommands];
		int headIndex = 0, editInputIndex = 0, inputLength = 0;

		if (userInput.hasNext())
			uneditInput = userInput.nextLine().toString().toLowerCase();
		inputLength = uneditInput.length();

		for (int i=0; i < inputLength; i++)
			if (uneditInput.charAt(i) == ' ') {
				editInput[editInputIndex] = new String(uneditInput.substring(headIndex, i));
				
				while ((uneditInput.charAt(i) == ' ') && (i < inputLength))
					i++;
				headIndex = i;

				editInputIndex++;
				if (editInputIndex > maxCommands)
					break;
			}
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
	private static void parse(String[] command, ArrayList<Player> movingObjects) {
		
	}
}