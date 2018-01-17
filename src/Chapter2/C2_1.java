package Chapter2;

import java.util.Scanner;

/**
 * Program t display temp in Celisius and Fehrenit
 *
 * @author Dihlan Ortega
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Degree");

        double celisus = input.nextDouble();

// Convert Celsius to Fahrenit
        double fahrenit = (9.0 / 5) * (celisus + 32);

        System.out.println("celsius" + celisus + "is"
                + fahrenit + "in fahrenit");

    }

}
