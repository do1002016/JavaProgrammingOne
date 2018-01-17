package Chapter5;

import java.util.Scanner;

/**
 * program displays a series of votes
 *
 * @author DihlanOrtega
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        int yes = 0;
        int no = 0;
        String vote;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Y for Yes Enter N for No Enter Q to quit");
        vote = input.next().toLowerCase();

        while (!vote.equals("q")) {
            switch (vote) {
                case "y":
                    ++yes;
                    break;
                case "n":
                    ++no;
                    break;
                default:
                    System.out.println("INVALID CODE!! Enter Y, N, or Q");
                    break;

            }
            System.out.println("Enter Y for Yes N for No and Q for to quit");
            vote = input.next().toLowerCase();
        }
        System.out.println("Yes votes = " + yes);
        System.out.println("Enter No votes = " + no);
    }

}
