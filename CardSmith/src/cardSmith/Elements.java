package cardSmith;

import java.util.ArrayList;

/**
 *
 * @author Robert
 */
public class Elements {

    //holds all possible elements
    private static ArrayList<String> elements = null;

    //loads all possible elements from elements.txt
    public Elements() {
        Elements.elements = FileHandling.readFromfile("elements");
    }

    
    /**
     *prints out all possible elements.  For debugging purposes only
     * @return
     */
    @Override
    public String toString() {
        String tmp = "";
        for (int i = 0; i < Elements.elements.size(); i++) {
            if (i != Elements.elements.size() - 1) {
                tmp += Elements.elements.get(i) + "\n";
            } else {
                tmp += Elements.elements.get(i);
            }
        }
        return tmp;
    }

    //checks if element exist in collection
    public static boolean elementExists(String element){
    
        return Elements.elements.contains(element);
    
    }
    
    //main test class
//    public static void main(String[] args) {
//        Elements e = new Elements();
//        System.out.println(e.toString());
//        System.out.println(e.elementExists("Water"));
//    }

}
