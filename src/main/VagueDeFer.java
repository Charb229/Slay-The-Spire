package main;

public class VagueDeFer extends Card {
    private static final String cardName = "Vague de Fer";
    private static final int cardCost = 1 ;
    private static final int blockAmount = 5 ;
    private static final int damageAmount = 5;

    public VagueDeFer(){
        super(cardName, cardCost);
    }

    public void applyEffect(Character target){
        super.applyEffect(target);

        //Gagne 5 points de blocage

        target.gainBlock(blockAmount);
        System.out.println("Vous avez gagné"+ blockAmount + "point de blocage");

        //Inflige 5 point de dégats

        target.takeDamage(damageAmount);
        System.out.println("Vous avez infligé"+ damageAmount + "point de dégats");

    }
}
