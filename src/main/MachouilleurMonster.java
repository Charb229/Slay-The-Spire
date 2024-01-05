package main;

import java.util.Random;

public class MachouilleurMonster extends Monsters {

    public MachouilleurMonster(){
        super("Machou", 40);
    }

    @Override

    public void performAction(){
        Random random = new Random();
        int randomChance = random.nextInt(100) + 1;

        if (randomChance <= 25) {
            System.out.println("Mosure : Inflige 11 dégats");
            performAttack(11);
        }else if(randomChance <= 55){
            System.out.println("Charge : Inflige 5 dégats et gagne 5 points de blockage");
            performAttack(7);
            gainBlock(5);
        }else {
            System.out.println("Gronder : Gagne 6 points de force et 3 point de blocage");
            gainStrenght(6);
            gainBlock(3);
        }
    }
    
}
