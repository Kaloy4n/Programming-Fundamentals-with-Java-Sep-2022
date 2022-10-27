package Arrays;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
//        for (int i = 0; i < inputArr.length / 2; i++) {
//            String oldElement = inputArr[i]; // a
//            inputArr[i] = inputArr[inputArr.length - 1 - i]; // c
//            inputArr[inputArr.length - 1 - i] = oldElement;
//        }
        String[] reversedArr = new String[inputArr.length];

        for (int i = inputArr.length - 1; i >= 0 ; i--) {
            reversedArr[inputArr.length - 1 - i] = inputArr[i];
        }
        System.out.println(String.join( " ", reversedArr));
    }
}
