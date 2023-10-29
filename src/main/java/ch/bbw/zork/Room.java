package ch.bbw.zork;/** * Author:  Michael Kolling, Version: 1.1, Date: August 2000 * refactoring: Rinaldo Lanza, September 2020 */import java.util.ArrayList;import java.util.HashMap;import java.util.List;import java.util.stream.Collectors;import java.util.HashMap;public class Room {	private boolean searched;	private String description;	private HashMap<String, Room> exits;	private int roomId;	public Room(String description, int roomId) {		this.description = description;		this.exits = new HashMap<>();		this.roomId = roomId;	}	private static int nextRoomId = 1;	private int generateRoomId() {		int generatedId = nextRoomId;		nextRoomId++;		return generatedId;	}	public void setExits(Room north, Room east, Room south, Room west) {		exits.put("north ↑", north);		exits.put("east →", east);		exits.put("south ↓", south);		exits.put("west ←", west);	}	public String shortDescription() {		return description;	}	public String longDescription() {		StringBuilder stringBuilder = new StringBuilder("You are in " + description + ".\n");		stringBuilder.append(exitString());		return stringBuilder.toString();	}	private String exitString() {		return "Exits:" + String.join(" ", exits.keySet());	}	public Room nextRoom(String direction) {		return exits.get(direction);	}	public  int getRoomId(){		return roomId;	}	public void setRoomId(int roomId){		this.roomId = roomId;	}	public boolean isSearched() {		return searched;	}	public void setSearched(boolean searched) {		this.searched = searched;	}	public String getDescription() {		return description;	}	public void setDescription(String description) {		this.description = description;	}	public HashMap<String, Room> getExits() {		return exits;	}	public void setExits(HashMap<String, Room> exits) {		this.exits = exits;	}	public int getNextRoomId() {		return nextRoomId;	}	public void setNextRoomId(int nextRoomId) {		this.nextRoomId = nextRoomId;	}}