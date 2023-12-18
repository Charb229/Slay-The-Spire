package main;

public class Status {
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

}
