package game;

import java.util.Scanner;

import fixtures.Door;
import fixtures.Room;

public class Main {
		
	public static void main(String[] args) {
		
		RoomManager roommanager = new RoomManager();
		roommanager.init();
		Player player = new Player();
		player.currentRoom = roommanager.startingRoom;
		printRoom(player);

		
		
		for (;;) {
			parse(collectInput(), player);	
			printRoom(player);
		}
		
			
	}
	
	
	
		
	private static void printRoom(Player player) {
		System.out.println("Now you stay in " + player.currentRoom.name);
		System.out.println(player.currentRoom.longDescription);
	}
	
	
	

	private static String[] collectInput() {
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		String[] command = userInput.split(" ");
		
		return command;

	}
		
	
	
	
	private static void parse(String[] command, Player player) {
		
		switch (command[0]) {
		case "go": {
			
			if (command.length == 1) {
				
				
				
			} else {
				
				
				Door door = player.currentRoom.getExit(command[1]);
				
				if (door == null) {
					System.out.println("invalid direction");
					break;
				}
				
				if (door.isClosed) {
					System.out.println("Door is closed");
					break;
				}
				
				Room room = door.getRoom(player.currentRoom);
				if (room == null) {
					System.out.println("invalid room");
					break;
				}
				player.currentRoom = room;		
				
			}
			break;
		}
		
		
		
		case "open": {
			
			if (command.length == 1) {
				
				
				
			} else {
				
				Door door = player.currentRoom.getExit(command[1]);
				
				if (door == null) {
					System.out.println("invalid direction");
					break;
				}
				
				door.isClosed = false;
				System.out.println("Door is opened.");
				
			}
			break;
		}
		
		case "close": {
			
			if (command.length == 1) {
				
				
				
			} else {
				
				Door door = player.currentRoom.getExit(command[1]);
				
				if (door == null) {
					System.out.println("invalid direction");
					break;
				}
				
				door.isClosed = true;
				System.out.println("Door is closed.");
				
			}
			break;
		}
		
		
		
		default:
			System.out.println("unknown command");
		}

	}
	
	
	
	

}
