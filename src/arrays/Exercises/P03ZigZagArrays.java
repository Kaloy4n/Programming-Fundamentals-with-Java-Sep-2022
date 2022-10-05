package arrays.Exercises;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        String [] firstArr = new String[rows];
        String [] secondArr = new String[rows];

        // even numbers row (2, 4, 6, 8, ...)
        // -> 1st number goes to 2nd array whereas 2nd num goes to 1st array

        // odd numbers row (1, 3, 5, 7, ...)
        // -> 1st num goes to 1st array whereas 2nd num goes to 2nd array

        for (int row = 1; row <= rows; row++) {
            //" 1 5".split(" ") -> ["1", "5"]
            String [] numbers = scanner.nextLine().split(" ");
            String firstNumber = numbers[0];
            String secondNumber = numbers[1];

            if (row % 2 == 0) {
                firstArr[row - 1] = secondNumber;
                secondArr[row - 1] = firstNumber;
            } else {
                firstArr[row - 1] = firstNumber;
                secondArr[row - 1] = secondNumber;
            }
        }
        // printing Arrays:
        //1. for by index position
        //2. foreach by elements
        //3. String.join !!! only for String arrays !!!

        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
