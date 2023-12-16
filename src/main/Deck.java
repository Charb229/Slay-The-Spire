package main;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private List<Card> drawPile;
    private List<Card> discardPile;

    public Deck(){
        this.drawPile = new ArrayList<>();
        this.discardPile = new ArrayList<>();

        shuffleDrawPile();
    }

    public void shuffleDrawPile(){
        Collections.shuffle(drawPile, new Random());
    }

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
}
