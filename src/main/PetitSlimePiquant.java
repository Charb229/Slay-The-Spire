package main;

public class PetitSlimePiquant extends Monsters {

    public PetitSlimePiquant(){
        super("Petit slime piquant", 13);
    }

    @Override
    public void performAction(){
        int damage = 5;
        performAttack(damage);
    }
}
