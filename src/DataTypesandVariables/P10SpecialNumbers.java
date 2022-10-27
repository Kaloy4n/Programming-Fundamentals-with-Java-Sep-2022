package DataTypesandVariables;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int currentDigit = i;
            int sumOfDigits = 0;
            while (currentDigit > 0) {
                sumOfDigits += currentDigit % 10;
                currentDigit = currentDigit / 10;
            }
            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}