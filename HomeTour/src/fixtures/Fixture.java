package fixtures;

import fixtures.rooms.Room;

public abstract class Fixture {
	
		
		private String name;
		private String shortDescription;
		private String longDescription;
		
		
		// this is the constructor which is used for creating our custom rooms and interactive objects
		public Fixture(String name, String shortDesc, String longDesc)	{
			setName(name);
			setShortDescription(shortDesc);
			setLongDescription(longDesc);
		}
		
		// getter method for name
		public String getName() {
			return name;
		}
		
		// getter method for short description
		public String getShortDescription() {
			return shortDescription;
		}
		
		// getter method for long description
		public String getLongDescription() {
			return longDescription;
		}

		// setter method for name
		public void setName(String name) {
			this.name = name;
		}
		
		// setter method for long description
		public void setShortDescription(String shortDesc) {
			shortDescription = shortDesc;
		}
		
		// setter method for long description
		public void setLongDescription(String longDesc) {
			longDescription = longDesc;
		}
}
//writing this so i have modifications that can be committed feel free to delete
		