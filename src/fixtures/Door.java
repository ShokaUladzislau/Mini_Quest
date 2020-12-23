package fixtures;

public class Door extends Fixture {
	
	private Room[] rooms; // North = exits[0] | East = exits[1] | South = exits[2] | West = exits[3] | 
	
	public boolean isClosed = true;
	
	public Door (String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.rooms = new Room[4]; // size is your choice
	}
	
	public Room[] getRooms() {
		
		return rooms;
		
	}
	
	public Room getRoom(Room externalRoom) {
		
		for (Room room : rooms) {
			
			if (room != externalRoom) {
				return room;
			}
		}
		return null;
	}

}
