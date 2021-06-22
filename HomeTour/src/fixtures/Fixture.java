package fixtures;

import fixtures.rooms.Room;

public abstract class Fixture {
	
		// required fields
		private String name;
		private String shortDescription;
		private String longDescription;
		
		// constructor which creates rooms/fixtures
		public Fixture(String name, String shortDesc, String longDesc)	{
			SetName(name);
			SetShortDescription(shortDesc);
			SetLongDescription(longDesc);
		}
		
		
		// get the name of a room/fixture
		public String GetName() {
			return name;
		}
		
		// get the short description of a room/fixture
		public String GetShortDescription() {
			return shortDescription;
		}
		
		// get the short description of a room/fixture
		public String GetLongDescription() {
			return longDescription;
		}

		
		
		// set the name of a room/fixture
		public void SetName(String name) {
			this.name = name;
		}
		
		// set the short description of a room/fixture
		public void SetShortDescription(String shortDesc) {
			shortDescription = shortDesc;
		}
		
		// set the long description of a room/fixture
		public void SetLongDescription(String longDesc) {
			longDescription = longDesc;
		}
		
}
