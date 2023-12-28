package main;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Character {

	private Deck deck ;
	private int energy;
	private List<Effect> statusEffects;
	
	
	public Hero(String name, int maxHealth ,int energy) {
		super(name, maxHealth);
		this.deck = new Deck(); // on initialise le deck avec des cartes 
		this.energy = 0;
		this.statusEffects = new ArrayList<>();
		initializeDefaultDeck();
	}
	

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck){
		this.deck=deck;
	}

	public int getEnergy(){
		return energy;
	}


	public void setEnergy(int energy){
		this.energy=energy;
	}
	//Methodes pour gerer les Status

	public void applyStatusEffects(){
		for(Effect effect : statusEffects){
			effect.applyEffect(this);
		}
	}

	public void addStatusEffects(Effect effect){
		statusEffects.add(effect);
	}

	public void removeStatusEffects(Effect effect){
		statusEffects.remove(effect);
	}

	public List<Effect> getStatuses(){
		return statusEffects;
	}

	//On recrit la methode takedamage pour tenir compte des effects de status

	public void takeDamage(int damage){
		applyStatusEffects(); // Ici on applique les effects des status au hero bien avant de prendre les degats
		super.takeDamage(damage); // Juste un appel de la methode de la classe mere
	}

	public void initializeDefaultDeck(){

	}


	public void useSpecialAbility(){

	}

	public void attackWithEnergyAndCard(Character target,int energy){
		Card selectedCard = chooseCardToPlay();
		int damage =  calculateDamageWithEnergyAndCard(energy, selectedCard);
		target.takeDamage(damage);
		System.out.println(getName()+ "attaque avec un energy et la carte et inflige"+ damage + " dégat à" + targer.getName );
	}

	private Card chooseCardToPlay(){
		return deck.get(0);
	}

	private int calculateDamageWithEnergyAndCard (int energy, Card card){

		return energy * 2+card.getDamage();
	}

}
