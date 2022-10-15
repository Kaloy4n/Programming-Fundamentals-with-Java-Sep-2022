package Methods.Exercises;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            //1. sum of its digits can be divisible by 8
            //2. it must contain at least one odd digit

            if (isSumOfDigitsDivisibleBy8(number) && isContainingOddDigit(number)) {
                System.out.println(number);
            }
        }
    }
    // method, which checks if sum of its digits is divisible by 8
    // true if the sum is divisible by 8
    // false if the sum is not divisible by 8
    public static boolean isSumOfDigitsDivisibleBy8 (int number) {
        //1. sum its digits
        int sumDigits = 0;
        while (number > 0) {
            // get the last digit
            int lastDigit = number % 10;
            // sum of the last digit
            sumDigits += lastDigit;
            // remove the last digit
            number /= 10;
        }
        //2. check if the sum is divisible by 8
        return sumDigits % 8 == 0;
    }

    // method, which checks if the sum contains at least one odd digit
    // true if it finds at least one odd digit
    // false if it doesn't find any one of the digits to be an odd digit

    public static boolean isContainingOddDigit (int number) {

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number /= 10;
            }
        }
        return false;
    }
}
