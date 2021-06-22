package fixtures;

import fixtures.rooms.Room;

public abstract class Fixture {
	
		// required fields
		private String name;
		private String shortDescription;
		private String longDescription;
		
<<<<<<< HEAD
		public String GetName() {return name;}
		public String GetShortDescription() {return shortDescription;}
		public String GetLongDescription() {return longDescription;}

		public void SetName(String name) {this.name = name;}
		public void SetShortDescription(String shortDesc) {shortDescription = shortDesc;}
		public void SetLongDescription(String longDesc) {longDescription = longDesc;}
		
<<<<<<< HEAD
		public Fixture(String name, String shortDesc, String LongDesc)	{
=======
		// constructor which creates rooms/fixtures
		public Fixture(String name, String shortDesc, String longDesc)	{
>>>>>>> parent of a279591 (cathouse-v3)
=======
		public Fixture(String name, String shortDesc, String longDesc)	{
>>>>>>> d5cfc481ceaa5b478cb224a0c04ead5c1b3813e0
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