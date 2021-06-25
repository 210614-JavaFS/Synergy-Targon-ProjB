package fixtures.rooms;

import fixtures.objects.CatTree;
import fixtures.objects.CatLitterBox;

public class Basement extends Room {

	private static CatTree catTree = new CatTree();
	private static CatLitterBox catLitterBox = new CatLitterBox();
	
	public Basement() {
		super("Basement",
				"Your cats' basement",
				"Above earth is your cats' home and under earth is your cats habitat. \n"
				+ "You walk down the carpeted steps of the stairs and entering the basement. \n"
				+ "You come into a nicely decorated basement. \n"
				+ "Climbing path, scratching posts and small hideouts hanging on the wall. \n"
				+ "Bashing your face is the smell of cat litter. \n" 
				+ "You are suffocating from your own laziness.\n"
				+ "You notice there is a " + catTree.getName() + ". \n"
				+ catTree.getShortDescription() + "\n"
				+ "Also there are " + catLitterBox.getName() + ". \n"
				+ catLitterBox.getShortDescription() + "\n");
	}
	
	public void interactWith(String whatToInteract) {

		if (whatToInteract.equals("cat tree")) {
			System.out.println(Basement.catTree.getLongDescription());
			Basement.catTree.interactWith();
		}
		else if (whatToInteract.equals("litter")) {
			setLitter();
		}
		else if (whatToInteract.equals("litter boxes")){
			System.out.println(Basement.catLitterBox.getLongDescription());
			Basement.catLitterBox.interactWith();
		}
	}
	
	public void setLitter() {
		Basement.catLitterBox.setLitter();
	}
}
