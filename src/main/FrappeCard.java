package main;

public class FrappeCard extends Card {
    private static final String cardName = "Frappe Card";
    private static final int cardCost = 1;
    private static final int damageAmount = 6;

    public FrappeCard(){
        super(cardName, cardCost);
    }

    @Override
    public void applyEffect(Character target){
        super.applyEffect(target);
        target.takeDamage(damageAmount);
        System.out.println("Vous avez ingligé"+ damageAmount + " dégats à votre ennemy");
    }

    public int getDamage(){
        return damageAmount;
    }
}
