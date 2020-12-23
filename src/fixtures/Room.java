package fixtures;

public class Room extends Fixture {
	
	private Door[] exits; // North = exits[0] | East = exits[1] | South = exits[2] | West = exits[3] | 

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Door[4]; // size is your choice
	}
		
	public Door[] getExits() {
		
		return exits;
		
	}
		
	public Door getExit(String direction) {

		
		switch (direction) {
		case "north": {
			
			return exits[0];
		} 
		case "east": {
			
			return exits[1];
		} 
		case "south": {
			
			return exits[2];
		} 
		case "west": {
			
			return exits[3];
		}
		default:
			System.out.println("invalid direction");
			return null;
		}
		
	}

}
