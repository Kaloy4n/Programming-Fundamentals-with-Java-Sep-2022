package Methods.Exercises;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleCharacters(text);
    }

     static void printMiddleCharacters (String text) {
        if (text.length() % 2 != 0) {
            int indexAtMiddleChar = text.length() / 2;
            System.out.println(text.charAt(indexAtMiddleChar));
        } else {
            int indexAtLeftmostMiddleChar = text.length() / 2 - 1;
            int indexAtRightmostMiddleChar = text.length() / 2;
            System.out.println("" + text.charAt(indexAtLeftmostMiddleChar) + text.charAt(indexAtRightmostMiddleChar));
        }
    }
}
