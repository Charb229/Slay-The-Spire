package main;

public abstract class Status  {
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



    public abstract void onApply(Character character);

    public abstract void onRemove(Character character);
    
}
