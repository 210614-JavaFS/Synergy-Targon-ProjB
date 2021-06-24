package fixtures.rooms;

import fixtures.objects.CatTree;
import fixtures.objects.CatLitterBox;

public class Basement extends Room {

	private CatTree catTree;
	private CatLitterBox catLitterBox;
	
	public Basement() {
		super("Basement",
				"Your cats' basement",
				"Above earth is your cats' home and under earth is your cats habitat. \n"
				+ "You walk down the carpeted steps of the stairs and entering the basement. \n"
				+ "You come into a nicely decorated basement.  Climbing path, scratching posts and small hideouts hanging on the wall. \n"
				+ "Bashing your face is the smell of cat litter. " + "You are suffocating from your own laziness.\n");
		catTree = new CatTree();
		catLitterBox = new CatLitterBox();
	}
	
	public void interactWith(String whatToInteract) {

		if (whatToInteract.equals("cat tree")) {
			this.catTree.interactWith();
		}
		else if (whatToInteract.equals("litter")) {
			setLitter();
		}
		else
			this.catLitterBox.interactWith();
	}
	
	public void setLitter() {
		this.catLitterBox.setLitter();
	}
}
