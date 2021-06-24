package game;

import java.util.ArrayList;
import fixtures.rooms.Room;

public class Player extends Thread {
	private String name;
	private static int catNumber;
	private static boolean gameContinue;
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

		Player.gameContinue = true;
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
		while (gameContinue) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (this.currentRoom.getName() == "Outside") Player.gameContinue = false;
		}
	}

	public void run(boolean isACat) { // Cat action
		int randomAction;
		while (Player.gameContinue) {
			randomAction = (int)Math.random()*100;
			randomAction = randomAction % 3;

			// 0 on the move, 1 sleeping, 2 playing
			switch (randomAction) {
				case 0:
					randomAction = (int)Math.random()*100;
					randomAction = randomAction % 4;
					
					while (randomAction > 0) {
						for (Room targetRoom: this.currentRoom.exits)
							if (targetRoom != null) {
								if (randomAction > 0) {
									randomAction--;
								}
								else {
									this.currentRoom = targetRoom;
									System.out.println("Your cat " + this.name + "is walking. ");
								}							
							}
					}
					break;

				case 1:
					System.out.println(this.name + "is sleeping.");
					try {
						wait();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;

				default:
					if (this.currentRoom.GetName() == "Basement")
						randomAction = (int)Math.random()*100;
					if (randomAction > 80) {
						System.out.println(this.name + " is using the litter box.");
					}
					else {
						System.out.println(this.name + " is playing with toys.");
					}
			}
			
			try {
				Thread.sleep((long)Math.random()*500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}