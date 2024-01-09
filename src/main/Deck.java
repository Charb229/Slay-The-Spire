package main;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    public static Object getCards;

    private List<Card> drawPile; //pioche

    private List<Card> discardPile; //defausse

    private List<Card> exilePile; //defausse

    private List<Card> cards; //defausse


    public Deck(){
        this.drawPile = new ArrayList<>();
        this.discardPile = new ArrayList<>();
        this.exilePile = new ArrayList<>();
        this.cards = new ArrayList<>();

        shuffleDrawPile();
    }
// methode pour remuer les carte de façon aleatoire 

    public void shuffleDrawPile(){
        Collections.shuffle(drawPile, new Random());
    }

    public List<Card> getCards(){
        return cards;
    }


    public void reshuffleDiscardPile(){
        Collections.shuffle(discardPile, new Random());
        drawPile.addAll(discardPile);
        discardPile.clear();
    }

    public void exilePile(List<Card> cards){
        exilePile.addAll(cards);
    }
    
    // methode permettant de piocher une carte

    public List<Card> drawCards(int numcards) {
        List<Card> drawnCards = new ArrayList<>();
            for(int i=0 ; i< numcards ; i++ ){
                if (drawPile.isEmpty()) {
                    reshuffleDiscardPile();;
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

    public void add(Card card) {
        drawPile.add(card);
    }

    public List<Card> getDiscardPile(){
        return discardPile;
    }
}
