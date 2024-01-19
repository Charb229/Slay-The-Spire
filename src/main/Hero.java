package main;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Character {

	public Deck deck;
	private int energy;
	private List<Effect> statusEffects;
	private Room currentRoom;
	private List<Card> handCards;
	private Card selectedCard;

	public void setSelectedCard(Card selectedCard) {
		this.selectedCard = selectedCard;
	}

	public Card getSelectedCard() {
		return selectedCard;
	}

	public Hero(String name, int maxHealth, int energy, Deck deck) {
		super(name, maxHealth);
		this.deck = (deck != null) ? deck : new Deck(); // On initialise
		this.energy = 0;
		this.statusEffects = new ArrayList<>();
		this.currentRoom = null;
		this.handCards = new ArrayList<>();

		initializeDefaultDeck();
	}

	public void changeRoom(Room newRoom) {
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

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	// Methodes pour gerer les Status

	public void applyStatusEffects() {
		for (Effect effect : statusEffects) {
			effect.applyEffect(this);
		}
	}

	public void addStatusEffects(Effect effect) {
		statusEffects.add(effect);
	}

	public void removeStatusEffects(Effect effect) {
		statusEffects.remove(effect);
	}

	public List<Effect> getStatuses() {
		return statusEffects;
	}

	// On recrit la methode takedamage pour tenir compte des effects de status

	public void takeDamage(int damage) {
		applyStatusEffects(); // Ici on applique les effects des status au hero bien avant de prendre les
								// degats
		super.takeDamage(damage); // Juste un appel de la methode de la classe mere
	}

	public void initializeDefaultDeck() {
		deck.addToDraw(new FrappeCard());
		deck.addToDraw(new DefenceCard());
	}

	public List<Card> getHandCards() {
		return handCards;
	}

	public void useSpecialAbility() {

	}

	public void attackWithEnergyAndCard(Character target, int energy) {
		drawCards(5);
		selectedCard = chooseCardToPlay();
		int damage = calculateDamageWithEnergyAndCard(energy, selectedCard);
		target.takeDamage(damage);
		deck.getDiscardPile().add(selectedCard);
		System.out.println(
				getName() + "attaque avec un energy et la carte et inflige" + damage + " dégat à" + target.getName());
	}

	private Card chooseCardToPlay() {
		return handCards.get(0);
	}

	private int calculateDamageWithEnergyAndCard(int energy, Card card) {

		return energy * 2 + card.getDamage();
	}

	public void drawCards(int numCards) {
		handCards.addAll(this.deck.drawCards(numCards));
		System.out.println("Vous avez tiré les cartes suivantes :\n");
		for (Card card : handCards) {
			System.out.println(card.getName() + "\t");
		}
	}

	public void displayHeroHand() {
		System.out.println("Liste des cartes disponibles : \n");
		int i = 0;
		for (Card card : handCards) {
			System.out.println( i + ":- " + card.getName() + ": " + card.getCost() + "\t");
			i++;
		}
		System.out.println("\n");
	}

	public int calculateDamageWithCard(Card card) {
		return card.getDamage() + getStrenght();

	}

}
