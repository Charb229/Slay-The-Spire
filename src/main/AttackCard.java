package main;

public class AttackCard extends Card {
    private int damage;

    public AttackCard(int damage , int cost , String name){
        super(name,cost);
        this.damage = damage;
    }

    public void applyEffect(Character target){
        System.out.println("Playing" + getName()+ "card....");
        super.applyEffect(target);
        int totalDamage = calculateTotalDamage(target);
        target.takeDamage(totalDamage);
        applyDamage(target, totalDamage);
        System.out.println("Vous avez infligé"+ totalDamage + "dégat à l'ennemie");
    }

    private void applyDamage(Character target , int totalDamage){
        target.takeDamage(totalDamage);
        System.out.println();
    }


    private int calculateTotalDamage(Character target){
        return damage;
    }
}
