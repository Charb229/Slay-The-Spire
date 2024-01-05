package main;

import java.util.Scanner;

public class BossRoom extends Room {
    @Override

    public void enter(Hero hero, Scanner scanner){
        System.out.println("Entrer dans la salle de boss");

        BossFinal boss = new BossFinal("BossFinal", 50); // Un exemple de Boss

        System.out.println("Vous rencontrer le boss finale");

        CombatManager.startCombat(hero, boss, scanner);

        if(hero.isAlive()){
            System.out.println("Felicitation vous avez battu le boss final");
        }else{
           System.out.println("Desolé mais vous avez été vaincu"); 
        }

    }

}
