package main;

public class FaiblesseStatuts extends Status {
    
    public FaiblesseStatuts(int duration){
        super("Faiblesse", duration);
    }

    @Override
    public void onApply(Character character){
        //Logique spécifique lorsque le statut faiblesse est appliqué
        character.reduceDamage(0.75);
    }

    @Override
    public void onRemove(Character character){
        character.resetDamage();
    }
}
