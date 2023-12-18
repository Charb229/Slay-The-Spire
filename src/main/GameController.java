package main;

import java.util.List;

public class GameController {
    public void playGame(Hero hero) {
        List<Room> rooms = RoomGenerator.generateRooms();
        for(Room room : rooms){
            room.enter(hero);
            if(!hero.isAlive()){
                System.out.println("Partie terminée : Vous avez été vaincu");
                break;
            }
        }

        if (hero.isAlive()) {
            System.out.println("Felicitation Vous avez vaincu le monstre final et avez gagné la partie");
        }
    }
}
