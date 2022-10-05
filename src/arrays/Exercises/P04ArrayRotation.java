package arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rotations =Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= rotations ; rotation++) {
            //1. get the 1st element
            int firstElement = numbers[0];
            //2. shift all elements to the left by 1
            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }
            //3. get the element at the 1st position/index and move it to the last index
            numbers[numbers.length - 1] = firstElement;
            }
        //4. print the array
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
