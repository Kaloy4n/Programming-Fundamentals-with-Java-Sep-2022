package Methods.Exercises;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input data is 3 whole numbers on new rows
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        // (number1 + number2) - number3
        int sumOfNumbers = sumOf2(number1, number2);
        int subtractOfNumbers = subtract2(sumOfNumbers, number3);
        System.out.println(subtractOfNumbers);
    }

    // method which accepts 2 integers and returns the sum of these
    public static int sumOf2 (int n1, int n2) {
        return n1 + n2;
    }

    // method which accepts 2 integers and returns the difference
    public static int subtract2 (int n1, int n2) {
        return n1 - n2;
    }
}
