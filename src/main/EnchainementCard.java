package main;

public class EnchainementCard extends Card {
    private static final String cardName = "Enchainement";
    private static final int cardCost = 1 ;
    private static final int damageAmount = 8;

    public EnchainementCard(){
        super(cardName, cardCost);
    }

    public void applyEffect(Character target){
        super.applyEffect(target);
        target.takeDamage(damageAmount);
    }

    public int getDamage(){
        return damageAmount;
    }
}
