package main;

public class Character {
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int block; //Point de blocage
    private int strenght;
    private double damageModifier = 1.0;

    public Character(String name, int maxHealth){
        this.name=name;
        this.maxHealth = maxHealth;
        this.currentHealth=maxHealth;
        this.block=0;
    }
    
    public String getName(){
        return name;
    }
    public int getmaxHealth(){
        return maxHealth;
    }

    public int getblock(){
        return block;
    }

    public int getcurrentHealth(){
        return currentHealth;
    }

    public int getStrenght(){
        return strenght;
    }

    public void setStrenght(int strenght){
        this.strenght = strenght;
    }

    public void setCurrentHealth( int currentHealth){
        this.currentHealth =currentHealth;
    }

    public void setBlock(int block){
        this.block= block;
    }

    /**
     * @param damage
     */
    public void takeDamage(int damage){
        if (block > 0){
            if (damage >= block){
                damage -= block;
                block = 0;
            }else{
                block -= damage;
                damage = 0;
            }
        }

        currentHealth -=damage;
        if (currentHealth<0) {
            currentHealth = 0; 
        }
    }
    //Methode pour attaquer un autre personnage 
    public void attack (Character target,int damage){
        target.takeDamage(damage);
    }
    //Methode pour recuperer des points de vies

    public void heal(int amount){
        currentHealth += amount;
        if (currentHealth > maxHealth) {
            currentHealth = maxHealth;
        }
    }

    //Methode pour recuperer des points de block 

    public void gainBlock(int amount){
        block += amount;
    }

    public boolean isAlive(){
        return currentHealth >0;
    }



    public void reduceDamage(double reducePercentage){
        damageModifier *= (1- reducePercentage);
    }

    public void resetDamage(){

    }

}