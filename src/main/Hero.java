package main;

public class Hero {

	private int maxHealth;
	private	int currentHealth;
	private Deck deck ;
	private int energy;
	
	
	public Hero(int maxHealth) {
		this.maxHealth = maxHealth ;
		this.currentHealth = maxHealth;
		this.deck = new Deck(); // on initialise le deck avec des cartes 
		this.energy = 0;
	}
	
	public int getmaxHealth(){
		return maxHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public Deck getDeck() {
		return deck;
	}

	public int getEnergy(){
		return energy;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public void setEnergy(int energy){
		this.energy=energy;
	}

	public boolean isAlive() {
		return currentHealth > 0;
	}

}
