package main;

import java.util.Scanner;

public class ResetRoom extends Room {
    @Override
    public void enter (Hero hero, Scanner scanner){
        System.out.println("Vous etes dans la chambre de repos");
        int healAmount = (int) (hero.getmaxHealth() *0.3);
        hero.setCurrentHealth(healAmount + hero.getcurrentHealth());
        System.out.println("Point Restoré" + healAmount + "Point de vie actuel" + hero.getcurrentHealth());
    }
}
