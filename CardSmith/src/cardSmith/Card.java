package cardSmith;

/**
 *
 * @author Robert
 */
//Card class
public class Card {

    private final String name;
    //number of cards available of this element. ex 50 air
    private int nOf;

    //constructor
    public Card(String name, int nOf) {
        this.name = name;
        this.nOf = nOf;
    }

    //adds n to nOf
    public void addMore(int n) {
        this.nOf += n;
    }

    //subtracts n from nOf if it doesn't go below zero
    public boolean use(int n) {
        if (this.nOf - n >= 0) {
            this.nOf -= n;
            return true;
        }
        return false;
    }

    //returns name
    public String getName() {
        return name;
    }

    //returns nOf
    public int getnOf() {
        return nOf;
    }

    //toString method
    @Override
    public String toString() {
        return "" + this.name + "  -  " + this.nOf;
    }

}
