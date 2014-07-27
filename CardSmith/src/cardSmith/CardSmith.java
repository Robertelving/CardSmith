package cardSmith;

import java.util.ArrayList;

/**
 *
 * @author Robert
 */
public class CardSmith {

    //holds all available Elements for comparison
    private final Elements aElements;
    
    //holds all current cards
    private final CardHolder cHolder;

    //constructor
    public CardSmith() {
        this.aElements = new Elements();
        this.cHolder = new CardHolder();
    }

    //returns arraylist of cards in hand
    public ArrayList<Card> getCardHolderCards() {
        return this.cHolder.getcHolder();
    }

    //calls save in CardHolder
    void save() {
        this.cHolder.save();
    }

    //calls useCard in CardHolder
    public boolean useCard(Card c, int n){
        return this.cHolder.useCard(c, n);
    }
}
