package chapter4;

import java.util.Scanner;

/**
 * Displays the name of bidders,and the numbers the amount they are given
 *
 * @author Dihlan Ortega
 */

public class P4 {

    public static void main(String[] args) {
        /**
         * Main Method
         *
         * @param args arguments from command line prompt
         */

        Scanner input = new Scanner(System.in);

        //Bidders
        System.out.print("Enter the name of the 1st bidder:");
        String bidder1 = input.next();
        System.out.print("Enter the name of the 2nd bidder");
        String bidder2 = input.next();

        //Enter hours for bidder1 and bidder2
        System.out.print("Enter the hours " + bidder1 + "will require:");
        int hours1 = input.nextInt();
        System.out.print("Enter the numbers of hours" + bidder2 + "will require");
        int hours2 = input.nextInt();

        System.out.print("Enter the amount" + bidder1 + "Charges per hour:");
        double money1 = input.nextDouble();
        System.out.print("Enter the amount" + bidder2 + "Charge per hour:");
        double money2 = input.nextDouble();

        //Calculation
        double cost1 = hours1 * money1;
        double cost2 = hours2 * money2;
        if (cost1 < cost2) {
            System.out.printf("The first winner is %s with a total cost of $%.2f", bidder1, cost1);
        }
        if (cost2 < cost1) {
            System.out.printf("The first winner is %s wuth a total cost of $%.2f", bidder2, cost2);
        }
        //hours
        if (cost1 == cost2 && hours1 < hours2) {
            System.out.printf("The winner is %s with a total of cost of $%.2f and with %d hours", bidder1, cost1, hours1);
        }
        if (cost2 == cost1 && hours2 < hours1) {
            System.out.printf("The winner is %s with a total of cost of $%.2f and with  %d hours", bidder2, cost2, hours2);
        }
        //everything is equal
        if (cost1 == cost2 && hours1 == hours2) {
            System.out.printf("Both %s and %s have identical bids.", bidder1, bidder2);
            System.out.printf("\nTheir bids were $%.2f", cost1);
            System.out.printf("\nThere equal in hours, with %s and %s and %s having %d hours.", bidder1, bidder2, hours2);
        }

    }
}
