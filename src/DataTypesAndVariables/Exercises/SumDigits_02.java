package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        //1. data input
        // stop when num is <= 0
        // continue till num > 0
        // repeat

        // 1. take the last digit of a number -> % 10
        // 2. sum the number
        // 3. remove the last num -> / 10
        // print the result
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
//        int number = Integer.parseInt(scanner.nextLine());
//        while (number > 0) {
//            int lastDigit = number % 10; //get the last num
//            sum += lastDigit;
//            number = number / 10 ; //remove the last digit
//        }

        for (int number = Integer.parseInt(scanner.nextLine()); number > 0; number = number / 10) {
            int lastDigit = number % 10; // store the last digit
            sum += lastDigit;
        }
        System.out.println(sum);
    }
}
