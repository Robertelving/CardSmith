package cardSmith;

import java.util.ArrayList;

/**
 *
 * @author Robert
 */
public class CardSmith {

    private final Elements aElements;
    private final CardHolder cHolder;

    public CardSmith() {

        this.aElements = new Elements();
        this.cHolder = new CardHolder();

    }

    public ArrayList<Card> getCardHolderCards() {
        return this.cHolder.getcHolder();
    }

    void save() {
        this.cHolder.save();
    }

    public boolean useCard(Card c, int n){
    
        return this.cHolder.useCard(c, n);
    
    }
}
