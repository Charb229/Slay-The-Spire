package main;

public class Card {
    private String name ;
    private int cost;

    public Card( String name , int cost) {
        this.name =name;
        this.cost = cost;
    }

    public String getName(){
        return name;
    }

    public int getCost(){
        return cost;
    }

    public void applyEffect(Character target){

        System.out.println(name);
    }
}
