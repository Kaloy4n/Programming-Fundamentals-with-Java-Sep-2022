package arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

/* Write a program to find all the top integers in an array.
A top integer is an integer that is bigger than all the elements to its right.
 */

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            //the element at the last index is always top as there are no more numbers on thr right-hand side of it
            if(index == numbers.length - 1) {
                System.out.print(currentNumber + " ");
                break;
            }
            //go through all elements after the current reading or at an index + 1 position
            boolean isTop = false; //
            for (int i = index + 1; i <= numbers.length - 1; i++) { //обходя всички числа след моето
                int nextNumber = numbers[i];
                if (currentNumber > nextNumber) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            //check if my number is a Top number
            if (isTop) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}


