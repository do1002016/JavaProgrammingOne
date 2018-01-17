package chapter3;

import java.util.Scanner;

/**
 * program displays if it is less than or equal to then if it is improper or
 * proper then to displays the letter grade
 *
 * @author Dihlan Ortega
 */

public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first digit: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number");
        double number2 = input.nextDouble();

        if (number1 < number2) {
            System.out.println("The first number is less than the second");
        }
        if (number1 > number2) {
            System.out.println("The first number is greater than the second");
        }
        if (number1 == number2) {
            System.out.println("The first number is equal to  the second");
        }
        if (number1 <= number2) {
            System.out.println("The first number is less than or equal to the second");
        }
        if (number1 != number2) {
            System.out.println("The first number is not equal to the second");
        }

        if (number2 == 0) {
            System.out.println("Cannot divide by zero");
        } else if (number1 / number2 < 1) {
            System.out.println("proper fraction");
        } else {
            System.out.println("inproper fraction");
        }

        if (number1 >= 90) {
            System.out.println("A");
        } else if (number1 >= 80) {
            System.out.println("B");
        } else if (number1 >= 70) {
            System.out.println("C");
        } else if (number1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        System.out.println("in range");

    }
}
