import java.util.Collections;
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class DeckOfCards {



    // creates and returns a full standard deck of playing cards
    public Card[] DeckOfCards(){

        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
        //System.out.println(cards[1]);
        return cards;
    }
    // creates a deck of card objects without a suit or value
    public Card[] DeckOfCards(int numberOfCards){
        // creates a new card array of the specified dimension
        Card[] subCards = new Card[numberOfCards];

        // populates the array with card objects using the default constructor
        for(int i = 0; i<numberOfCards;i++){
            subCards[i] = new Card();
        }

        // returns the sub array of cards for use elsewhere
        return subCards;
    }


    // outputs a random hand of the specified number of cards
    public Card[] dealAHand(int cardCount){
        // full deck of cards
        Card[] deckCards = DeckOfCards();
        // sub-deck of cards
        Card[] handCards = DeckOfCards(cardCount);
        // randomizes the order of the full deck of cards
        shuffleDeck(deckCards);
        // deals the shuffled deck into the hand
        for(int i = 0; i<cardCount; i++){
            handCards[i] = deckCards[i];
            System.out.println("Card " + (i+1) + ": " + handCards[i]);
        }
        // returns the sub-deck of dealt cards
        return handCards;
    }

    // shuffles the sent in array of cards into a random order
    public Card[] shuffleDeck(Card[] deck){
        Collections.shuffle(Arrays.asList(deck));
        return deck;
    }

    // creates an array of suits from a card array
    public int[] suitDistribution(Card[] cards){
        int clubs = 0, spades = 0, diamonds = 0, hearts = 0;

        // iterates through the array
        for(int i = 0; i<cards.length;i++){
            switch(cards[i].getIntSuitValue()){
                case 1:
                    clubs++;
                    break;
                case 2:
                    spades++;
                    break;
                case 3:
                    diamonds++;
                    break;
                case 4:
                    hearts++;
                    break;
            }
        }

        // creates a single array that can be output to another method
        int[] suitSummary = {clubs, spades, diamonds, hearts};
        return suitSummary;
    }
    // checks if there is five cards of the same suit in a given card array
    public boolean hasFlush(Card[] cards){
        // evaluates the suit distribution in the given hand
        int[] suits = suitDistribution(cards);
        // iterates through the suits and checks if there is a suit with 5
        for(int i = 0;i<suits.length;i++){
            if(suits[i]==5){
                return true;
            }
        }
        // only will reach here if there is not a set of 5
        return false;
    }

    // outputs the total face value of an array of cards input using face cards = 10
    public int handScore(Card[] cards){
        int totalScore = 0;

        // iterates through the card array
        for(int i = 0; i<cards.length;i++){

            // adds the value of the card to a running total
            switch(cards[i].getIntValue()){
                case 1: totalScore += 1;
                    break;
                case 2: totalScore += 2;
                    break;
                case 3: totalScore += 3;
                    break;
                case 4: totalScore += 4;
                    break;
                case 5: totalScore += 5;
                    break;
                case 6: totalScore += 6;
                    break;
                case 7: totalScore += 7;
                    break;
                case 8: totalScore += 8;
                    break;
                case 9: totalScore += 9;
                    break;
                case 10: case 11: case 12: case 13:
                    totalScore += 10;
                    break;

            }
        }

        return totalScore;
    }
    // outputs a basic graph of the suit distribution of the input card array
    public void printSuitHist(int[] suits){
        System.out.println("Histogram of suits in given hand:");
        // formats clubs line
        System.out.printf("%-13s","Clubs");
        for(int i = 0; i<suits[0];i++){
            System.out.print("*");
        }
        System.out.println();

        // formats spades line
        System.out.printf("%-13s","Spades");
        for(int i = 0; i<suits[1];i++){
            System.out.print("*");
        }
        System.out.println();
        //formats diamonds line
        System.out.printf("%-13s","Diamonds");
        for(int i = 0; i<suits[2];i++){
            System.out.print("*");
        }
        System.out.println();
        // formats hearts line
        System.out.printf("%-13s","Hearts");
        for(int i = 0; i<suits[3];i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
