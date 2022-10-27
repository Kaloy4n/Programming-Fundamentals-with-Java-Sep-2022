package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        //1. get a num from the Array of numbers -> iterate through all numbers thereafter
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            //iterate through all numbers thereafter
            for (int nextIndex = index + 1; nextIndex <= numbers.length - 1; nextIndex++) {
                int nextNumber = numbers[nextIndex];
                //Print the 2 numbers if their sum equals the magic Sum
                if (currentNumber + nextNumber == magicSum) {
                    System.out.println((currentNumber + " " + nextNumber));
                }
            }
        }
    }
}