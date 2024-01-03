package main;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Character {

	List <Card> deck ;
	private int energy;
	private List<Effect> statusEffects;
	private Room currentRoom;
	
	
	public Hero(String name, int maxHealth ,int energy , List <Card> deck ) {
		super(name, maxHealth);
		this.deck = deck; // on initialise le deck avec des cartes 
		this.energy = 0;
		this.statusEffects = new ArrayList<>();
		initializeDefaultDeck();
		this.currentRoom = null;
	}


	public void changeRoom(Room newRoom){
		setCurrentRoom(newRoom);
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}


	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}


	public List <Card> getDeck() {
		return deck;
	}

	public void setDeck(List <Card> deck){
		this.deck= deck;
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
		System.out.println(getName()+ "attaque avec un energy et la carte et inflige"+ damage + " dégat à" + target.getName() );
	}

	private Card chooseCardToPlay(){
		return deck.get(0);
	}

	private int calculateDamageWithEnergyAndCard (int energy, Card card){

		return energy * 2+card.getDamage();
	}

}
