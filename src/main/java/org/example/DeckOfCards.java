package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;
    public DeckOfCards()
    {
        deck = new ArrayList<>();
        List<String> suits = Card.getValidSuits();
        List<String> faceNames = Card.getValidFaceNames();

        for(int i = 0; i<suits.size(); i++)
        {
            for(String faceName : faceNames)
                //System.out.println(faceName + " of " +  suits.get(i));
                deck.add(new Card(faceName, suits.get(i)));
        }

    }

    /**
     * Another method for dealing with the top card
     * @return
     */

    public Card dealTopCard()
    {
        if(deck.size()>0)
            return deck.remove(0);
        else
            return null;
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }
}


