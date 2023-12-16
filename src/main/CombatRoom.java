package main;

public class CombatRoom extends Room{
    @Override
    public void enter(Hero hero){
        System.out.println("Entrer dans la salle de combat");
        hero.setEnergy(hero.getEnergy());
        hero.getDeck().shuffleDrawPile();
        hero.drawcards(5);
    }

}
