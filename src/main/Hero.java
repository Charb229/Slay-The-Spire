package main;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Character {

	public Deck deck ;
	private int energy;
	private List<Effect> statusEffects;
	private Room currentRoom;
	private List<Card> hand;
	
	public Hero(String name, int maxHealth ,int energy , Deck deck ) {
		super(name, maxHealth);
		this.deck = (deck != null) ? deck : new Deck();  //On initialise
		this.energy = 0;
		this.statusEffects = new ArrayList<>();
		this.currentRoom = null;
		this.hand = new ArrayList<>();
		initializeDefaultDeck();

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


	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck){
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
		FrappeCard frappeCard = new FrappeCard();
		deck.add(frappeCard);
		DefenceCard defenceCard = new DefenceCard();
		deck.add(defenceCard);
	}

	public List<Card> getHand(){
		return hand;
	}

	public void useSpecialAbility(){

	}

	public void attackWithEnergyAndCard(Character target,int energy){
		drawCards(5);
		Card selectedCard = chooseCardToPlay();
		int damage =  calculateDamageWithEnergyAndCard(energy, selectedCard);
		target.takeDamage(damage);
		System.out.println(getName()+ "attaque avec un energy et la carte et inflige"+ damage + " dégat à" + target.getName() );
	}

	private Card chooseCardToPlay(){
		return hand.get(0);
	}

	private int calculateDamageWithEnergyAndCard (int energy, Card card){

		return energy * 2+card.getDamage();
	}


	public void drawCards(int numCards) {
		List<Card> drawnCards = deck.drawCards(numCards);
		hand.addAll(drawnCards);
		System.out.println("Vous avez tiré les cartes suivantes");
		for(Card card : drawnCards){
			System.out.println(card.getName());
		}
	}

	public void displayHeroHand(){
		System.out.println("Les carte dans votre main");
		for(int i=0 ; i<hand.size();i++){
			System.out.println(i+"."+hand.get(i).getName());
		}
	}

	public int calculateDamageWithCard(Card card) {
		return card.getDamage() +getStrenght() ;
		
	}

}
