package main;

public class SaigneeCard extends Card {
    private static final String cardName= "Saignee";
    private static final int cardCost = 0;
    private static final int healthLoss = 3;
    private static final int energyGain = 2;
    

    public SaigneeCard(){
        super(cardName, cardCost);
    }

    public void applyEffect(Character target){
        super.applyEffect(target);

        if (target instanceof Hero) {
            Hero hero = (Hero) target;

            hero.setCurrentHealth(hero.getcurrentHealth() - healthLoss);
            hero.setEnergy(hero.getEnergy()+energyGain);

            System.out.println("Vous perdez"+ healthLoss+ "point de vie.");
            System.out.println("Vous gagnez" + energyGain+ "point d'energie.");

        }
    }

    public int getDamage(){
        return 0;
    }
}
