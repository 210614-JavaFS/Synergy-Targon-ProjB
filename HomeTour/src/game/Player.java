package game;

import java.util.ArrayList;
import fixtures.rooms.Room;

public class Player extends Thread {
	private String name;
	private static int catNumber;
	private static boolean gameContinue;
	private boolean isACat;
	private String catActions;
	Room currentRoom;
	
	
	public Player(String name, Room placingRoom) {
		super(name);
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
/*
	public void start() {
		Player.gameContinue = true;
		run();
	}
	*/

	public void terminating() {
		Player.gameContinue = false;
	}

	public String getCatActions() {
		return catActions;
	}
	
	public void run() { // Player action

		if (isACat) {
			int randomAction;
			while (Player.gameContinue) {
				randomAction = (int)(Math.random()*100);
				randomAction = randomAction % 3;

				// 0 on the move, 1 sleeping, 2 playing
				switch (randomAction) {
					case 0:
						randomAction = (int)(Math.random()*100);
						randomAction = randomAction % 4;
						
						while (randomAction > 0) {
							for (Room targetRoom: this.currentRoom.exits)
								if (targetRoom != null) {
									if (randomAction > 0) {
										randomAction--;
									}
									else {
										this.currentRoom = targetRoom;
										catActions = new String("Your cat " + this.name + "is walking. ");
									}							
								}
						}
						break;

					case 1:
						catActions = new String(this.name + " is sleeping.");
						Thread.onSpinWait();
						break;

					default:
						if (this.currentRoom.getName() == "Basement")
							randomAction = (int)Math.random()*100;
						if (randomAction > 80) {
							catActions = new String(this.name + " is using the litter box.");
						}
						else {
							catActions = new String(this.name + " is playing with toys.");
						}
				}
				
				try {
					Thread.sleep(10000 + (long)Math.random()*10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
/*		else {
			while (Player.gameContinue) {
				System.out.println("Player Testing." + Player.gameContinue);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}*/
	}
}
