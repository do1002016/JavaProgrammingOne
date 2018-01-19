package Chapter6;
import java.util.Scanner;
/**
 * Displays substrings and passwords
 *
 * @author Dihlan Ortega
 */
public class C6_18{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static final int PASSWORD_REQUIRED_LENGTH = 8; // password required length

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "■ A password must have at least eight characters.\n" +
                "■ A password consists of only letters and digits.\n" +
                "■ A password must contain at least two digits \n" +
                "Enter a password meeting the requirements above: ");
        String s = input.nextLine();

        if (isValidPassword(s)) {
            System.out.println("Password is VALID: " + s);
        } else {
            System.out.println("NOT VALID PASSWORD: " + s);
        }

    }

    public static boolean isValidPassword(String password) {

        if (password.length() < PASSWORD_REQUIRED_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (isNumeric(ch)) numCount++;
            else if (isLetter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean isNumeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }


}
