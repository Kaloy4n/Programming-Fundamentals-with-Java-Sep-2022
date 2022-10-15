package Methods.Exercises;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passAttempt = scanner.nextLine();

        if (!lengthCheck(passAttempt)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!lettersAndDigitsCheck(passAttempt)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!minDigitsCheck(passAttempt)) {
            System.out.println("Password must have at least 2 digits");
        };

        if (lengthCheck(passAttempt) == true && lettersAndDigitsCheck(passAttempt) == true && minDigitsCheck(passAttempt) == true) {
            System.out.println("Password is valid");
        }
    }

    static boolean lengthCheck(String input) {
         return input.length() >= 6 && input.length() <= 10;
    }

    static boolean lettersAndDigitsCheck(String input) {
        if (input.isEmpty()) {
            return false;
        }
        for (char symbol : input.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    static boolean minDigitsCheck(String input){
        byte count = 0;
        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        if (count < 2) {
            return false;
        }
        return true;
    }
}
