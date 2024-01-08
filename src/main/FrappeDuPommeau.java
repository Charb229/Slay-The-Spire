package main;

public class FrappeDuPommeau extends Card {
    private static final String cardName = "";
    private static final int cardCost = 1;
    private static final int damageAmount = 9;
    private static final int draw_card = 1;

    public FrappeDuPommeau(){
        super(cardName, cardCost);
    }

    public void applyEffect(Character target){
        super.applyEffect(target);

        //Inflige 9 dégats 

        target.takeDamage(damageAmount);
        System.out.println("Vous avez infligé" + damageAmount + " dégats");

        if(target instanceof Hero){
            Hero hero =(Hero) target;
            hero.drawCards(draw_card);
            System.out.println("Vous venez de tirer"+draw_card+ "cartes");
        }
    }
}
