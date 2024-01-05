package main;

//import java.io.IOException;
import java.util.Scanner;

//import librairies.StdDraw;


public class Main {
	
	public static void main(String[] args) {
		//try{
			//Jeu jeu= new Jeu();
			//jeu.initialDisplay();
			//StdDraw.show();  //StdDraw est utilise en mode buffer pour fluidifier l'affichage: utiliser StdDraw.show() pour afficher ce qui est dans le buffer
			//while (!jeu.isOver()) {
				//jeu.update();
 			//}

		//} catch (Exception e) {
		//	System.out.println("Erreur lors de l'execution du jeu : " + e.getMessage());
		//}

		Scanner scanner =new Scanner(System.in);

		Hero hero = new Hero("Player", 70, 0, null);
		Monsters enemy = new Monsters("Enemy", 50);

		displayCombatStatut(hero, enemy);

		CombatManager.startCombat(hero, enemy, scanner);

		scanner.close();


	}

	private static void displayCombatStatut(Hero hero, Monsters enemy) {
		System.out.println("............. Information initiales.............");
		System.out.println("Votre personnage" + hero.getName()+ ", PV"+ hero.getcurrentHealth());
		System.out.println("Monstre enemie : " + enemy.getName() + " , PV" + enemy.getcurrentHealth()  );
		System.out.println("............................................");
	}
	
} 
