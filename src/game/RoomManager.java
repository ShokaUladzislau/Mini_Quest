package game;

import fixtures.Door;
import fixtures.Fixture;
import fixtures.Room;

public class RoomManager {
	
	Room startingRoom;
	Fixture[] fixtures;
	
	public void init() {
		fixtures = new Fixture[10];
		
		
	    Room foyer = new Room(
			"The Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the east, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a big room, where you can see a piano."
			+ "\n"
			+ "			╔═╦═╗\n" + 
			"			║ ║ ║\n" + 
			"			╠═╬═╣\n" + 
			"			║x║ ║\n" + 
			"			╚═╩═╝");
			this.fixtures[0] = foyer;
	        this.startingRoom = foyer;
	        
	    Room livingRoom = new Room(
	    	"The Living room ",
			"A big living room ",
			"A living room is a room in a home. The living room in a home is shared by the people living in the home. "
			+ "In the living room they talk with each other and their guests and do other things such as reading or watching television. "
			+ "The furniture can include a piano, couch, chairs, tables, lamps, a television, curtains and pictures."
			+ "To the south you see a exit to the foyer. "
			+ "To the east you see a exit to the bathroom. "
			+ "\n"
			+ "			╔═╦═╗\n" + 
			"			║x║ ║\n" + 
			"			╠═╬═╣\n" + 
			"			║ ║ ║\n" + 
			"			╚═╩═╝");
			this.fixtures[1] = livingRoom;
			
		Room diningRoom = new Room(
			"The Dining room. ",
			"the room in which they cook and eat food. ",
			"A room in which meals are eaten, as in a home or hotel, especially the room in which the major or more formal meals are eaten."
			+ " The furniture usually includes a dining table, chairs, and sideboard."
			+ " To the west you see a exit to the foyer. "
			+ " To the north you see a exit to the bathroom. "
			+ "\n"
			+ "			╔═╦═╗\n" + 
			"			║ ║ ║\n" + 
			"			╠═╬═╣\n" + 
			"			║ ║x║\n" + 
			"			╚═╩═╝");
			this.fixtures[2] = diningRoom;
			
		Room bathRoom = new Room(
			"The Bathroom. ",
			"A bathroom is a room for personal hygiene. ",
			"A bathroom is a room for personal hygiene activities, generally containing a toilet, "
			+ "a sink (basin) and either a bathtub, a shower, or both. In some countries, "
			+ "the toilet is usually included in the bathroom, whereas other cultures consider this insanitary or "
			+ "impractical, and give that fixture a room of its own. "
			+ "To the south you see a exit to the diningroom. "
			+ "To the west you see a exit to the livingroom. "
			+ "\n"
			+ "			╔═╦═╗\n" + 
			"			║ ║x║\n" + 
			"			╠═╬═╣\n" + 
			"			║ ║ ║\n" + 
			"			╚═╩═╝");
		
		
		
		
		Door foyerToLivingRoomDoor = new Door(
				"Door from foyer to living room",
				"Wooden door from foyer to living room",
				"Wonderful door without anything");
		
		Door foyerToDiningRoomDoor = new Door(
				"Door from foyer to dining room",
				"Wooden door from foyer to dining room",
				"Wonderful door without anything");
		
		Door bathRoomToLivingRoomDoor = new Door(
				"Door from bathroom to living room",
				"Wooden door from bathroom to living room",
				"Wonderful door without anything");
		
		Door bathRoomToDiningRoomDoor = new Door(
				"Door from bathroom to dining room",
				"Wooden door from bathroom to dining room",
				"Wonderful door without anything");
		
		this.fixtures[4] = foyerToLivingRoomDoor;
		this.fixtures[5] = foyerToDiningRoomDoor;
		this.fixtures[6] = bathRoomToLivingRoomDoor;
		this.fixtures[7] = bathRoomToDiningRoomDoor;
		
			
		Room[] foyerToLivingRoomDoorExits = foyerToLivingRoomDoor.getRooms();
		foyerToLivingRoomDoorExits[0] = foyer;
		foyerToLivingRoomDoorExits[1] = livingRoom;	
		
		Room[] foyerToDiningRoomDoorExits = foyerToDiningRoomDoor.getRooms();
		foyerToDiningRoomDoorExits[0] = foyer;
		foyerToDiningRoomDoorExits[1] = diningRoom;	
		
		Room[] bathRoomToLivingRoomDoorExits = bathRoomToLivingRoomDoor.getRooms();
		bathRoomToLivingRoomDoorExits[0] = bathRoom;
		bathRoomToLivingRoomDoorExits[1] = livingRoom;	
		
		Room[] bathRoomToDiningRoomDoorExits = bathRoomToDiningRoomDoor.getRooms();
		bathRoomToDiningRoomDoorExits[0] = bathRoom;
		bathRoomToDiningRoomDoorExits[1] = diningRoom;	
			

	       
		Door[] foyerExits = foyer.getExits();
		foyerExits[0] = foyerToLivingRoomDoor;
		foyerExits[1] = foyerToDiningRoomDoor;
			
		Door[] livingRoomExits = livingRoom.getExits();
		livingRoomExits[2] = foyerToLivingRoomDoor;
		livingRoomExits[1] = bathRoomToLivingRoomDoor;
			
		Door[] diningRoomExits = diningRoom.getExits();
		diningRoomExits[3] = foyerToDiningRoomDoor;
		diningRoomExits[0] = bathRoomToDiningRoomDoor;
			
		Door[] bathRoomExits = bathRoom.getExits();
		bathRoomExits[2] = bathRoomToDiningRoomDoor;
		bathRoomExits[3] = bathRoomToLivingRoomDoor;
			
			
		
		
	}

}
