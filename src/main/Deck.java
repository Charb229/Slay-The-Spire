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

    

}
