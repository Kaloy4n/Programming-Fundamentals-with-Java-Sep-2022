package arrays;

import java.util.Scanner;

public class P03SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int[] numbersArr = new int[inputArr.length];
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(inputArr[i]);
        }
//        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
        int evenSum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 0) {
                evenSum += numbersArr[i];
            }
        }
        System.out.println(evenSum);
    }
}
