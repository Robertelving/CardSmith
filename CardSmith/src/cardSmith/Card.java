package cardSmith;

/**
 *
 * @author Robert
 */
public class Card {

    private final String name;
    private int nOf;

    public Card(String name, int nOf) {
        this.name = name;
        this.nOf = nOf;
    }

    public void addMore(int n) {
        this.nOf += n;
    }

    public boolean use(int n) {
        if (this.nOf - n >= 0) {
            this.nOf -= n;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getnOf() {
        return nOf;
    }

    @Override
    public String toString() {
        return "" + this.name + "  -  " + this.nOf;
    }

}
