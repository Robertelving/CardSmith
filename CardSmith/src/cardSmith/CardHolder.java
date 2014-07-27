package cardSmith;

import java.util.ArrayList;

/**
 *
 * @author Robert
 */
class CardHolder {

    private ArrayList<Card> cHolder;

    public CardHolder() {
        cHolder = new ArrayList();
        loadCards();
    }

    private void loadCards() {
        ArrayList<String> tmp = FileHandling.readFromfile("save");
        for (String string : tmp) {
            String[] tmpString = string.split(",");
            cHolder.add(new Card(tmpString[0], Integer.parseInt(tmpString[1])));
        }
    }

    public ArrayList<Card> getcHolder() {
        return cHolder;
    }

    public void save() {
        ArrayList<String> tmpAL = new ArrayList();
        for (Card card : cHolder) {
            tmpAL.add(card.getName() + "," + card.getnOf());
        }
        FileHandling.writeToFile("save", tmpAL);
    }

    public boolean useCard(Card c, int n) {
        return c.use(n);
    }
}
