package main;

public class Character {
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int block; //Point de blocage

    public Character(String name, int maxHealth){
        this.name=name;
        this.maxHealth = maxHealth;
        this.currentHealth=maxHealth;
        this.block=0;
    }
    
    public String getName(){
        return name;
    }
    public int maxHealth(){
        return maxHealth;
    }




}