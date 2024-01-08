package main;

public class Hemokinesie extends Card {
    private static final String cardName = "Hemokinesie";
    private static final int cardCost = 1;
    private static final int damageAmount = 15;
    private static final int healthLoss = 2;

    public Hemokinesie(){
        super(cardName, cardCost);
    }

    public void applyEffect(Character target){
        super.applyEffect(target);

        target.takeDamage(damageAmount);

        if (target instanceof Hero) {
            Hero hero = (Hero) target ;
            hero.setCurrentHealth(hero.getcurrentHealth()-healthLoss);
            System.out.println("Vous perdez"+ healthLoss + "points de vies");
        }

        if (target instanceof Monsters) {
            Monsters enemy = (Monsters) target;
            enemy.takeDamage(damageAmount);
            System.out.println("Vous avez infligé"+ damageAmount+ "point de vie");
        }
    }
}
