package main;

public class VulnerableStatus extends Status {
    public VulnerableStatus(int points){
        super("Vulnerable", points);
    }

    public void onApply(Character character){

    }

    public void onRemove(Character character){
        
    }
}
