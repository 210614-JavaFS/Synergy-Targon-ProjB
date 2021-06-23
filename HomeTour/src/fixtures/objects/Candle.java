package fixtures.objects;

import fixtures.Fixture;

public class Candle extends Fixture implements Interactive {
	
	public Candle(){
		super("Candle",
				"A small, untouched candle",
				"An unlit candle with some matches laying next to it,"
				+ "the candle seems to have never been touched");
	}
	

	public void interactWith() {
		System.out.println("Striking a match, you light the candle");
		this.SetLongDescription("The candle is alive and the wax slowly melts");
	}
	
	
}
