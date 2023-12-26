package main;

import java.util.List;
import java.util.Scanner;

public class GameController {
    private Scanner scanner;
    public GameController(){
        this.scanner= new Scanner(System.in);
    }

    public void playGame(Hero hero) {
        List<Room> rooms = RoomGenerator.generateRooms();
        for(Room room : rooms){
            room.enter(hero, scanner);
            if(!hero.isAlive()){
                System.out.println("Partie terminée : Vous avez été vaincu");
                break;
            }
        }

        if (hero.isAlive()) {
            System.out.println("Felicitation Vous avez vaincu le monstre final et avez gagné la partie");
        }

        scanner.close();
    }
}
