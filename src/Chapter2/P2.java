package chapter2;

import java.util.Scanner;

/**
 * Displays the price of a meal, drink,and dessert
 *
 * @author Dihlan Ortega
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the meal");
        double meal = input.nextDouble();
        System.out.print("Enter the price of the dessert");
        double dessert = input.nextDouble();
        System.out.print("Enter the price of the drink");
        double drink = input.nextDouble();
        double subtotal = meal + drink + dessert;
        double tax = subtotal * 0.10;
        double tip = (subtotal + tax) * 0.15;
        double total = subtotal + tax + tip;
        System.out.println("The subtotal is : $" + subtotal);
        System.out.println("The ntax is: $" + tax);
        System.out.println("The tip is: $" + tip);
        System.out.println("The total is: $" + total);
    }
}
