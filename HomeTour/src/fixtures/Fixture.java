package fixtures;

import fixtures.rooms.Room;

public abstract class Fixture {
		private String name;
		private String shortDescription;
		private String longDescription;
		
		public String GetName() {return name;}
		public String GetShortDescription() {return shortDescription;}
		public String GetLongDescription() {return longDescription;}

		public void SetName(String name) {Fixture.name = name;}
		public void SetShortDescription(String shortDesc) {shortDescription = shortDesc;}
		public void SetLongDescription(String longDesc) {longDescription = longDesc;}
		
		public Fixture(String name, String shortDesc, String LongDesc)	{
			SetName(name);
			SetShortDescription(shortDesc);
			SetlongDescription(longDesc);
		}
}