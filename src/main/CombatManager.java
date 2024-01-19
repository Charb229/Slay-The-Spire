package main;

import java.util.Scanner;

public class CombatManager {

    public static void startCombat(Hero hero, Monsters enemy, Scanner scanner) {
        System.out.println("Le combat commence");

        while (hero.isAlive() && enemy.isAlive()) {
            displayCombatStatut(hero, enemy);
            heroTurn(hero, enemy, scanner);

            if (enemy.isAlive()) {
                enemyTurn(hero, enemy);
            }
        }
        displayCombatResult(hero, enemy);
    }

    private static void heroTurn(Hero hero, Monsters enemy, Scanner scanner) {
        // Afficher les options des joueurs
        System.out.println("Votre tour : Choisir une action");
        System.out.println("1. Attaquer");
        System.out.println("2. Defendre");

        int combatMode = scanner.nextInt(); // Choix du mode de combat : Attaque ou Défense

        // Faire une première pioche
        System.out.println("il y a " + hero.deck.getDrawCards().size() + " cartes dans la pile de pioche.");
        hero.drawCards(2);

        System.out.println("Choississez une carte à jouer (Avec leur numéro.)");
        // TODO : Proposer des cartes selon le mode de combat choisi
        hero.displayHeroHand();
        int cardChoice = scanner.nextInt();

        // Vérifier que le choix effectué est valide
        if (cardChoice >= 0 && cardChoice <= hero.getHandCards().size()) {
            hero.setSelectedCard(hero.getHandCards().get(cardChoice));
        } else {
            System.out.println("Choix de carte invalide.");
        }

        if (hero.getSelectedCard() instanceof AttackCard) {
              int damage = hero.calculateDamageWithCard(hero.getSelectedCard());
              enemy.takeDamage(damage);
              System.out.println("Vous avez infligé" + damage + "à votre ennemie");
              hero.getHandCards().remove(cardChoice);
              
             
        } else if (hero.getSelectedCard() instanceof DefenceCard) {
            System.out.println("Vous avez choisi de defendre. Bloquer un certain nombre de degats ");

        } else {

            // System.out.println("Choix invalide. Ressayez svp");
        }
    
    
    Card drawnCard = drawCard(hero);

    if(drawnCard!=null){
        System.out.println("La carte que vous avez tirée :" + drawnCard.getName());
    }else {
        System.out.println("Aucune carte tirée");
    }
}

    private static Card drawCard(Hero hero) {
        if (!hero.getDeck().getCards().isEmpty()) {

            Card drawnCard = hero.getDeck().getCards().remove(0);
            return drawnCard;

        } else {
            System.out.println("");
            return null;
        }

    }


    private static void enemyTurn(Hero hero, Monsters enemy) {

        int damage = 10;
        hero.takeDamage(damage);
        System.out.println("Le monstres vous a infliger " + damage + "dégats");
    }

    private static void displayCombatStatut(Hero hero, Monsters enemy) {
        System.out.println("Votre point de vie restant" + hero.getcurrentHealth());
        System.out.println("Point de vie du monstre" + enemy.getcurrentHealth());
        System.out.println("........");
    }

    private static void displayCombatResult(Hero hero, Monsters enemy) {

    }

}

