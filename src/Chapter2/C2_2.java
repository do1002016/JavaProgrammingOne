package chapter2;

import java.util.Scanner;

/**
 * program to display length of a cylinder
 *
 * @author Dihlan Ortega
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

// Create a Scanner object
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159265359;

// Prompt user to enter the radius and length of a cylinder
        System.out.print("12");

        double radius = input.nextDouble();

        double length = input.nextDouble();

// Comput the area and volume
        double area = radius * radius * PI;

        double volume = area * length;

// Display results
        System.out.println("The area is " + area);

        System.out.println("The volume is " + volume);

    }

}
