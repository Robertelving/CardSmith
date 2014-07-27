package cardSmith;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Robert Elving
 */
public class FileHandling {

    //Read from specified file and returns in ArrayList<String>
    public static ArrayList<String> readFromfile(String name) {

        ArrayList<String> a1 = new ArrayList<>();
        Scanner scan = null;
        try {
            scan = new Scanner(new File(name + ".txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
        while (scan.hasNext()) {
            String str = scan.nextLine();
            a1.add(str);
        }
        scan.close();

        return a1;
    }

    //write to specified file and returns in ArrayList<String>
    public static void writeToFile(String name, ArrayList<String> a1) {

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(name + ".txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Error opening file");
        }
        for (int i = 0; i < a1.size(); i++) {
            pw.println(a1.get(i));
        }
        pw.close();

    }

    /*  public void resetGame() {
     try {
     FileInputStream fis = new FileInputStream("nbproject/private/LOAD/loadElements.txt");
     FileOutputStream fos = new FileOutputStream("elements.txt");
     encrypt(key, fis, fos);
     } catch (Throwable e) {
     }

     try {
     FileInputStream fis = new FileInputStream("nbproject/private/LOAD/MCS-Load-File.txt");
     FileOutputStream fos = new FileOutputStream("combinations.txt");
     encrypt(key, fis, fos);
     } catch (Throwable e) {
     }
     }*/
}
