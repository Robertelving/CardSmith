package cardSmith;

import java.util.ArrayList;

/**
 *
 * @author Robert
 */
class CardHolder {

    //holds cards player has available
    private ArrayList<Card> cHolder;

    //constructor
    public CardHolder() {
        cHolder = new ArrayList();
        loadCards();
    }

    //loads from save.txt
    private void loadCards() {
        ArrayList<String> tmp = FileHandling.readFromfile("save");
        for (String string : tmp) {
            String[] tmpString = string.split(",");
            cHolder.add(new Card(tmpString[0], Integer.parseInt(tmpString[1])));
        }
    }

    //returns cHolder
    public ArrayList<Card> getcHolder() {
        return cHolder;
    }

    //saves to save.txt
    public void save() {
        ArrayList<String> tmpAL = new ArrayList();
        for (Card card : cHolder) {
            tmpAL.add(card.getName() + "," + card.getnOf());
        }
        FileHandling.writeToFile("save", tmpAL);
    }

    //cals use in Card
    public boolean useCard(Card c, int n) {
        return c.use(n);
    }
}
