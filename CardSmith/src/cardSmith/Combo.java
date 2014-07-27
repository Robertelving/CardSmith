package cardSmith;

import java.util.ArrayList;

/**
 *
 * @author Robert
 */
public class Combo {

    private final String item1, item2, item3, item4, item5, item6, item7, item8, item9;
    ArrayList<String> resultSet = null;

    public Combo(String item1, String item2, String item3, String item4, String item5, String item6, String item7, String item8, String item9, ArrayList<String> rs) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.item6 = item6;
        this.item7 = item7;
        this.item8 = item8;
        this.item9 = item9;
        this.resultSet = rs;
    }

}
