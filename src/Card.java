public class Card {

    // variable declaration
    private enum Suit {none, Clubs, Spades, Diamonds, Hearts};
    private Suit suit = Suit.none;
    private enum Value {none, Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King};
    private Value value = Value.none;

    private int currentSuit;
    /*
    1 = clubs
    2 = spades
    3 = diamonds
    4 = hearts
     */
    private int intValue;
    /*
    1-13 for Ace- King
     */
    // default constructor for no value
    public Card(){
        suit = Suit.none;
        value = Value.none;
    }
    // constructor for making a specific card
    public Card(int number, int suitAssign){
        this.intValue = number;
        this.currentSuit = suitAssign;

        // Converts integer values to enumerated data
        switch (intValue){
            case 1: this.value = Value.Ace;
                break;
            case 2: this.value = Value.Two;
                break;
            case 3: this.value = Value.Three;
                break;
            case 4: this.value = Value.Four;
                break;
            case 5: this.value = Value.Five;
                break;
            case 6: this.value = Value.Six;
                break;
            case 7: this.value = Value.Seven;
                break;
            case 8: this.value = Value.Eight;
                break;
            case 9: this.value = Value.Nine;
                break;
            case 10: this.value = Value.Ten;
                break;
            case 11: this.value = Value.Jack;
                break;
            case 12: this.value = Value.Queen;
                break;
            case 13: this.value = Value.King;
                break;
        }
        switch(currentSuit){
            case 1: suit = Suit.Clubs;
                break;
            case 2: suit = Suit.Spades;
                break;
            case 3: suit = Suit.Diamonds;
                break;
            case 4: suit = Suit.Hearts;
                break;
        }
    }

    // returns the ordinal of the suit for comparison


    public void setCard(int newValue, int newSuit){
        if(newSuit >=1 && newSuit<=4) {
            switch (newSuit) {
                case 1:
                    suit = Suit.Clubs;
                    break;
                case 2:
                    suit = Suit.Spades;
                    break;
                case 3:
                    suit = Suit.Diamonds;
                    break;
                case 4:
                    suit = Suit.Hearts;
                    break;
            }
        }
        if (newValue >= 1 && newValue <=13){
            switch (newValue){
                case 1: this.value = Value.Ace;
                    break;
                case 2: this.value = Value.Two;
                    break;
                case 3: this.value = Value.Three;
                    break;
                case 4: this.value = Value.Four;
                    break;
                case 5: this.value = Value.Five;
                    break;
                case 6: this.value = Value.Six;
                    break;
                case 7: this.value = Value.Seven;
                    break;
                case 8: this.value = Value.Eight;
                    break;
                case 9: this.value = Value.Nine;
                    break;
                case 10: this.value = Value.Ten;
                    break;
                case 11: this.value = Value.Jack;
                    break;
                case 12: this.value = Value.Queen;
                    break;
                case 13: this.value = Value.King;
                    break;
            }
        }
    }
    public void setCurrentSuitValue(int newSuitValue){
        switch(newSuitValue){
            case 1: suit = Suit.Clubs;
                break;
            case 2: suit = Suit.Spades;
                break;
            case 3: suit = Suit.Diamonds;
                break;
            case 4: suit = Suit.Hearts;
                break;
        }

    }

    public String getCurrentSuit(){
        return suit.name();
    }

    public int getIntSuitValue(){
        return suit.ordinal();
    }
    public int getIntValue(){
        return value.ordinal();
    }

    public void setValue(int newValue){
        if (newValue >= 1 && newValue <=13){
            switch (newValue){
                case 1: this.value = Value.Ace;
                    break;
                case 2: this.value = Value.Two;
                    break;
                case 3: this.value = Value.Three;
                    break;
                case 4: this.value = Value.Four;
                    break;
                case 5: this.value = Value.Five;
                    break;
                case 6: this.value = Value.Six;
                    break;
                case 7: this.value = Value.Seven;
                    break;
                case 8: this.value = Value.Eight;
                    break;
                case 9: this.value = Value.Nine;
                    break;
                case 10: this.value = Value.Ten;
                    break;
                case 11: this.value = Value.Jack;
                    break;
                case 12: this.value = Value.Queen;
                    break;
                case 13: this.value = Value.King;
                    break;
            }
        }
    }


    public String toString(){
        return value + " of " + suit;
    }

}
