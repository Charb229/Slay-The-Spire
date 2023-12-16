package main;

public class ResetRoom extends Room {
    @Override
    public void enter (Hero hero){
        System.out.println("Vous etes dans la chambre de repos");
        int healAmount = (int) (hero.getmaxHealth() *0.3);
        hero.setCurrentHealth(healAmount + hero.getCurrentHealth());
        System.out.println("Point Restoré" + healAmount + "Point de vie actuel" + hero.getCurrentHealth());
    }
}
