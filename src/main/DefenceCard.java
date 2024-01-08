package main;

public class DefenceCard extends Card {
    private static final String cardName = "DefenceCard";
    private static final int cardCost= 1;
    private static final int blockAmount= 5;

    public DefenceCard(){
        super(cardName, cardCost);
    }

    public void applyEffect(Character target){
        super.applyEffect(target);
        target.gainBlock(blockAmount);
        System.out.println("Vous avez gagné" + blockAmount + "points de blocage");
    }


}
