/**
 * @author Arturo Santiago-Rivera
 * @version 0.1.180522 22 May 2018
 */

// class import
import java.util.Scanner;

public class CharFaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner for input
        Scanner scnr = new Scanner(System.in);

        // variable declaration / initialize
        char userChar = '-';

        while (userChar != 'q') {
            // print face
            System.out.println();
            System.out.println(" " + userChar + " " + userChar);
            System.out.println("  " + userChar);
            System.out.println("" + userChar + userChar + userChar + userChar + userChar);
            System.out.println();

            // prompt and confirm user input
            System.out.print("Enter a character ('q' to quit): ");
            userChar = scnr.next().charAt(0);
        }

        // exit script
        System.out.println();
        System.out.println("*** Good Bye!!! ***");
        System.out.println();

        // close scanner
        scnr.close();
    }
}
