package main;

import java.util.Scanner;

public class BossRoom extends Room {
    @Override

    public void enter(Hero hero, Scanner scanner){
        System.out.println("Entrer dans la salle de boss");
    }

}
