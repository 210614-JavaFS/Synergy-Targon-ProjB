package game;

import fixtures.rooms.Room;

public class Cats extends Thread {
	private static int catNumber;
	private static boolean gameContinue;

	private String name;
	private String catActions;
	Room currentRoom;

	public Cats(String name, Room placingRoom) {
		super(name);
		this.name = name;
		this.currentRoom = placingRoom;
		
		catActions = new String("Your cat " + this.name + " is welcoming you by the front gate.");
		Cats.gameContinue = true;
		Cats.catNumber ++;
	}
	

	public void terminating() {
		Cats.gameContinue = false;
	}

	public String getCatActions() {
		return catActions;
	}
	
	public void run() { // Player action

		int randomAction;
		while (Cats.gameContinue) {
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
									catActions = new String("Your cat " + this.name + "is walking towards " + targetRoom + " .");
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
						randomAction = (int)(Math.random()*100);
					if (randomAction > 80) {
						catActions = new String(this.name + " is using the litter box.");
					}
					else {
						catActions = new String(this.name + " is playing with toys.");
					}
			}
			
			try {
				Thread.sleep(10000 + (int)(Math.random()*10000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
