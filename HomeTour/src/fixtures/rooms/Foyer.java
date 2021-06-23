package fixtures.rooms;

import fixtures.objects.Candle;

public class Foyer extends Room {

	Candle candle = new Candle();
	
	// need to add interactive object and exit directions
	
	// fletcher's room
	public Foyer() {
		super("Foyer",
				"A small foyer ",
				"As you open the rotting door and step inside you enter a small decaying lobby"
				+ "To your left you see a concrete floor leading to a garage"
				+ "To your right you see a spacious tile file leading to a bathroom"
				+ "Straight ahead you can see a small candle"
				+ "Behind you is the door to the house");
		
		//this.exits[room_num] = 
	}	
}
