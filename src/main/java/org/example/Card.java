package org.example;
import java.util.List;
import java.util.Arrays;

public class Card {
    //These are instance variables.
    // when you create an instance variable of your class the system will reserve space in memory to store these items
    private String faceName;
    private String suit;

    //Constructor

    /**
     * It is called when we want to intantiate or create AN instance of our object
     * it looks like a method , but doesnot have a return type and must have the exact same name as the class
     */

    public Card(String faceNumber, String suit)
    {
        setFaceName(faceNumber);
        this.suit = suit;
    }
    public void setFaceName(String faceName)
    {
        faceName = faceName.toLowerCase();
        if (getValidFaceNames().contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + "must be in the list of" + getValidFaceNames());

    }

    public static List<String> getValidFaceNames()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }
    public static List<String> getValidSuits()
    {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }

    public String getFaceName() {
        return faceName;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();

        if(getValidSuits().contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(faceName + "must be in the list of" + getValidSuits());
    }

    public String toString()
    {
        return faceName + " of " + suit;
    }

    /**
     * This method returns the colour of the cards
     * Red = hearts or diamonds
     * Balck = spades or club
     */

    public String getColour()
    {
        if(suit.equals("hearts") || suit.equals("diamonds"))
            return "red";
        else
            return "black";

    }

    /**
     * This method will return the value of the card , assuming
     * ace is highest
     */
    public int getCardValue() {
        List<String> faceNames = getValidFaceNames();
        int indexOfCard = faceNames.indexOf(faceName);
        return indexOfCard + 2;

    }







}
