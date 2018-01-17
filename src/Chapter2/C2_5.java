package chapter2;

import java.util.Scanner;

/**
 * Program to display subtotal of gratuity rate
 *
 * @author Dihlan Ortega
 */

public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create new Scanner object.

// the subtotal and the gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate ");

        double subtotal = input.nextDouble();

        double gratuityRate = input.nextDouble();

// Calculate gratuity and tot
        double gratuity = subtotal * (gratuityRate / 100);

        double total = subtotal + gratuity;

// Display results
        System.out.println("The gratuity is $" + gratuity
                + " and total is $" + total);

    }

}
