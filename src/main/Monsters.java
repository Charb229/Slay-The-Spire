package main;

public class Monsters extends Character {
    
    public Monsters(String name , int maxHealth){
        super(name, maxHealth);
    }

    public void performAttack(int damage){
        takeDamage(damage);
        System.out.println(getName()+ "inflige"+ damage + "dégats !");
    }

    public void performAction(){

    }

    public void gainBlock(int block){
        if (block > 0) {
            setBlock(getblock() + block);
            System.out.println(getName() + "gagne" + block + "points de blocage.");
        }
    }

    public void gainStrenght(int strenght){
        if (strenght > 0) {
            setStrenght(getStrenght()+strenght);
            System.out.println(getName()+ "gagne"+ strenght+ "points de force.");
        }
    }

    public int calculateDamage() {
        return 0;
    }
}
