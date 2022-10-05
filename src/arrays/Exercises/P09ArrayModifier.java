package arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        // valid command for execution
        while (!command.equals("end")) {

            // I. "swap {index1} {index2}
            // -> get 1st element at index 1 which serves as index num for elements in the numbers Array
            // -> get 2nd element at index 2 which serves as index num for elements in the numbers Array
            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                //1. get the element from numbers Array at the 1st index
                int element1 = numbers[index1];
                //2. get the element from numbers Array at the 2nd index
                int element2 = numbers[index2];
                //3. swap
                numbers[index1] = element2;
                numbers[index2] = element1;
            }
            // 2. "multiply {index1} {index2}
            else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                //1. get the element from numbers Array at the 1st index
                int element1 = numbers[index1];
                //2. get the element from numbers Array at the 2nd index
                int element2 = numbers[index2];
                //3. multiply the elements 1 and 2
                int product = element1 * element2;
                numbers[index1] = product;
                // 3. command = "decrease"
            } else if (command.equals("decrease")) {
                for (int i = 0; i <= numbers.length - 1; i++) {
                    numbers[i]--;
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            if (i != numbers.length - 1) {
                //while index is not the last one
                System.out.print(currentNumber + ", ");
            } else {
                // when the index equals the last position
                System.out.print(currentNumber);
            }
        }
    }
}