package fixtures;

import fixtures.rooms.Room;

public abstract class Fixture {
	
		
		private String name;
		private String shortDescription;
		private String longDescription;
		
		
		// this is the constructor which is used for creating our custom rooms and interactive objects
		public Fixture(String name, String shortDesc, String longDesc)	{
			SetName(name);
			SetShortDescription(shortDesc);
			SetLongDescription(longDesc);
		}
		
		// getter method for name
		public String GetName() {
			return name;
		}
		
		// getter method for short description
		public String GetShortDescription() {
			return shortDescription;
		}
		
		// getter method for long description
		public String GetLongDescription() {
			return longDescription;
		}

		// setter method for name
		public void SetName(String name) {
			this.name = name;
		}
		
		// setter method for long description
		public void SetShortDescription(String shortDesc) {
			shortDescription = shortDesc;
		}
		
		// setter method for long description
		public void SetLongDescription(String longDesc) {
			longDescription = longDesc;
		}
}
		