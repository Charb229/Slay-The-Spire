package main;

import java.util.ArrayList;
import java.util.List;

public class RoomGenerator {
    public static List<Room> generateRooms() {
        List<Room> rooms = new ArrayList<>();
        //Logique des salles de combats

        rooms.add(new CombatRoom());
        rooms.add(new CombatRoom());
        rooms.add(new ResetRoom());
        rooms.add(new CombatRoom());
        rooms.add(new CombatRoom());
        rooms.add(new CombatRoom());
        rooms.add(new ResetRoom());
        rooms.add(new CombatRoom());
        rooms.add(new CombatRoom());
        rooms.add(new CombatRoom());
        rooms.add(new ResetRoom());
        rooms.add(new CombatRoom());
        rooms.add(new CombatRoom());
        rooms.add(new ResetRoom());
        rooms.add(new BossRoom());
        return rooms;

    }
}
