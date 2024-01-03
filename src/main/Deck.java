package main;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private List<Card> drawPile; //pioche

    private List<Card> discardPile; //defausse

    public Deck(List<Card> initialCards){
        this.drawPile = new ArrayList<>(initialCards);
        this.discardPile = new ArrayList<>();

        shuffleDrawPile();
    }
// methode pour remuer les carte de façon aleatoire 

    public void shuffleDrawPile(){
        Collections.shuffle(drawPile, new Random());
    }
    // methode permettant de piocher une carte

    public List<Card> drawCards(int numcards) {
        List<Card> drawnCards = new ArrayList<>();
            for(int i=0 ; i< numcards ; i++ ){
                if (drawPile.isEmpty()) {
                    shuffleDrawPile();
                }
                Card drawnCard = drawPile.remove(0);
                drawnCards.add(drawnCard);
            }
        return drawnCards;
    }

    public void discard (List<Card> cards){
        discardPile.addAll(cards);
    }

    public Card get(int i) {
        return drawPile.get(i);
    }

    public Card remove(int i) {
        return drawPile.remove(i);
    }
}
