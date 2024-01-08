package main;

public class GourdinCard extends Card {
    private static final String cardName= "Gourdin";
    private static final int cardCost = 3;
    private static final int damageAmount = 32;

    public GourdinCard(){
        super(cardName, cardCost);
    }

    public void applyEffect(Character target){
        super.applyEffect(target);

        if (target instanceof Monsters) {
            Monsters enemy = (Monsters) target;
            enemy.takeDamage(damageAmount);
            System.out.println("Vous avez infligé" + damageAmount+ " dégats");
        }
    }

    @Override
    public int getDamage(){
        return damageAmount;
    }
}
