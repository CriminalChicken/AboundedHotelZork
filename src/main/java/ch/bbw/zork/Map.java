package ch.bbw.zork;

import java.util.HashMap;

public class Map {
    private HashMap<String, Room> rooms;

    public Map() {
        rooms = new HashMap<>();
    }

    public void addRoom(String roomName, Room room) {
        rooms.put(roomName, room);
    }

    public Room getRoom(String roomName) {
        return rooms.get(roomName);
    }

}
