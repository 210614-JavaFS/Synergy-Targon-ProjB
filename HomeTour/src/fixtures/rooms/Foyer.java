package fixtures.rooms;

import fixtures.objects.Candle;

public class Foyer extends Room {

	private Candle candle;
	
	// fletcher's room
	public Foyer() {
		super("Foyer",
				"A small foyer ",
				"As you open the rotting door and step inside you enter a small decaying lobby\n"
				+ "The once white walls now a dark grey, with cracks and tears from weathering\n"
				+ "In front of you stands a small table, with single unlit candle and some matches next to it");
		candle = new Candle();
	}
	
	public void interactWith(String whatToInteract) {
		System.out.println("here here " +whatToInteract);
		if (whatToInteract.equals("candle")) {
			candle.interactWith();
		}
		
	}
}
