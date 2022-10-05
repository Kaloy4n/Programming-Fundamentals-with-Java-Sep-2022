package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingListOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2 8 30 25 40 72 -2 44 56
//        String values = scanner.nextLine();
//        String[] valuesArr = values.split(" ");
//        int[] numbersArr = new int[valuesArr.length];
//        for (int i = 0; i <= valuesArr.length - 1; i++) {
//            numbersArr[i] = Integer.parseInt(valuesArr[i]);
//            System.out.println(numbersArr[i]);
//        }
//    }
//}

        String lineInput = scanner.nextLine();
        int[] numbersArr = Arrays.
                stream(lineInput.split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbersArr.length; i++) {
            System.out.printf("%d -> %d%n", i, numbersArr[i]);
        }
    }
}