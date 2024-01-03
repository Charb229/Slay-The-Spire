package main;

import java.util.Scanner;

public class CombatManager {

    public static void startCombat(Hero hero , Monsters enemy , Scanner scanner){
        System.out.println("Le combat commence");

        while (hero.isAlive() && enemy.isAlive()) {
            displayCombatStatut(hero,enemy);
            heroTurn(hero,enemy,scanner);

            if ( enemy.isAlive()){
                enemyTurn(hero,enemy);
            }
        }
        displayCombatResult(hero,enemy);
    }

    private static void heroTurn(Hero hero, Monsters enemy,Scanner scanner){
        //Afficher les options des joueurs

        System.out.println("Votre tour : Choisir une action");
        System.out.println("1. Attaquer");
        System.out.println("2. Defendre");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
            int damage = hero.deck.get(0).getDamage();
            enemy.takeDamage(damage);  
            System.out.println("Vous avez infliger"+ damage + "à votre enemy");
                break;
            case 2:
            System.out.println("Vous avez choisi de defendre. Bloquer un certain nombre de degats ");
                break;
            default:
            System.out.println("Choix invalide. Ressayez svp");
                break;
        }

        Card drawnCard = drawCard(hero);
        System.out.println("La carte que vous avez tiré" + drawnCard.getName());
        
    }

    private static Card drawCard(Hero hero){
        Card drawnCard = hero.deck.remove(0);
        return drawnCard;
    }

    private static void enemyTurn(Hero hero , Monsters enemy){

        int damage = 10;
        hero.takeDamage(damage);
        System.out.println("Le monstres vous a infliger " + damage + "dégats");
    }

    private static void displayCombatStatut(Hero hero, Monsters enemy){
        System.out.println("Votre point de vie restant" + hero.getcurrentHealth());
        System.out.println("Point de vie du monstre" + enemy.getcurrentHealth() );
        System.out.println("........");
    }

    private static void displayCombatResult(Hero hero, Monsters enemy){

    }

}
