package main;

import java.util.Scanner;

public class CombatRoom extends Room{
    @Override
    public void enter(Hero hero, Scanner scanner){
        System.out.println("Entrer dans la salle de combat");
        hero.setEnergy(hero.getEnergy());
        hero.getDeck().shuffleDrawPile();
        hero.getDeck().drawCards(5);
    }

}
