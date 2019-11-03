/*
Cole Lamothe - 100711084
 */


import java.util.Random;

public class Main {

    public static void main(String[] args){
        // creates a new deck object
        DeckOfCards deck = new DeckOfCards();

        // output of assignment requirements
        System.out.println("Full shuffled deck: ");
        System.out.println();
        deck.dealAHand(52); // uses the deal a hand method to output the entire deck shuffled
        System.out.println();
        System.out.println("Hand of five cards: ");
        Card[] hand = deck.dealAHand(5); // ensures the lower methods are all using the same hand
        deck.printSuitHist(deck.suitDistribution(hand));
        System.out.println("Hand score: " + deck.handScore(hand));
        System.out.println("This hand has a flush: " + deck.hasFlush(hand));


    }


}
