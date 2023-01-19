package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {

        Card card1 = new Card("8", "time");
        System.out.println(card1.toString());

        System.out.println(card1 + "colour: " + card1.getColour());
        System.out.println(card1 + "colour: " + card1.getCardValue());

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        System.out.println(deck);

        ArrayList<Card> hand1 = new ArrayList<>();
        ArrayList<Card> hand2 = new ArrayList<>();

        for(int i=1 ; i <=5; i++)
        {
            hand1.add(deck.dealTopCard());
            hand2.add(deck.dealTopCard());


        }


    }
}