package main;

public class FrappeDoubleCard extends Card {
    private static final String cardName = "Frappe Double";
    private static final int cardCost = 1 ; 
    private static final int damageAmount = 5;
    private static final int numberOfHits = 2;

    public FrappeDoubleCard(){
        super(cardName, cardCost);
    }

    public void applyEffect(Character target){
        super.applyEffect(target);

        for(int i=0 ; i <numberOfHits ;i++){
            target.takeDamage(damageAmount);
            System.out.println("Vous avez infligé"+ damageAmount + "dégats à votre enemie(hits" + (i+0) + ")" );
        }
    }

    public int getDamage(){
        return(damageAmount*numberOfHits);
    }
}
