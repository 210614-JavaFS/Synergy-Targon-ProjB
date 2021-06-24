package fixtures.rooms;

import fixtures.objects.Candle;

public class Foyer extends Room {

	private Candle candle;
	
	// fletcher's room
	public Foyer() {
		super("Foyer",
				"A small foyer ",
				"As you open the rotting door and step inside you enter a small decaying lobby"
				+ "To your left you see a concrete floor leading to a garage"
				+ "To your right you see a spacious tile file leading to a bathroom"
				+ "Straight ahead you can see a small candle"
				+ "Behind you is the door to the house");
		
		candle = new Candle();
	}
	
	public void interactWith(String whatToInteract) {
		System.out.println("here here " +whatToInteract);
		if (whatToInteract.equals("candle")) {
			candle.interactWith();
		}
		
	}
	
}
