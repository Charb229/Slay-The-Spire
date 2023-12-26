package main;

public class AttackCard extends Card {
    private int damage;

    public AttackCard(int damage , int cost , String name){
        super(name,cost);
        this.damage = damage;
    }

    public void applyEffect(Character target){
        System.out.println("Playing" + getName()+ "card....");
        int totalDamage = calculateTotalDamage(target);
        apply.Damage(totalDamage, target);
    }

    private void applyDamage (Character target , int totalDamage){
        
    }


    private int calculateTotalDamage(Character target){

    }
}
