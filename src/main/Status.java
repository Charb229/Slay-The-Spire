package main;

public class Status implements Effect {
    private String name;
    private int points;

    public Status(String name , int points){
        this.name = name;
        this.points = points;
    }

    public String getName(){
        return this.name;
    }

    public int getPoints(){
        return this.points;
    }

    public void decrementPoints() {
        points--;
    }
    @Override
    public void applyEffect(Character character){
        System.out.println(character.getName()+ "a été affecté par "+ this.name + "status.");
    }
}
