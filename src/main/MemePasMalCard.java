package main;

public class MemePasMalCard extends Card {
    private static final String cardName="Meme Pas Mal Card";
    private static final int cardCost = 1;
    private static final int blockAmount = 8 ;
    private static final int draw_card = 1;
    
    
    public  MemePasMalCard(){
        super(cardName,cardCost);
    }
    
    public void applyEffect(Character target){
        super.applyEffect(target);
        target.gainBlock(blockAmount);
        System.out.println("Vous avez gagné"+ blockAmount + "points de dégats");

        if(target instanceof Hero){
            Hero hero = (Hero) target;
            hero.drawCards(draw_card);
            System.out.println("Vous venez de tirer"+ draw_card+ "cartes");
        }
    }

    
}
