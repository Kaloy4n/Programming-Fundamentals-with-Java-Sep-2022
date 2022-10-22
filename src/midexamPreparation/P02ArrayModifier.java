package midexamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String inputLine = scanner.nextLine();

        while(!inputLine.equals("end")) {
            String[] commandArr = inputLine.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "swap":
                    int swapIndex_1 = Integer.parseInt(commandArr[1]);
                    int swapIndex_2 = Integer.parseInt(commandArr[2]);
                    int valueAtIndex_1 = numbersArr[swapIndex_1];
                    int valueAtIndex_2 = numbersArr[swapIndex_2];

                    numbersArr[swapIndex_1] = valueAtIndex_2;
                    numbersArr[swapIndex_2] = valueAtIndex_1;
                    break;
                case "multiply":
                    int multiplyIndex_1 = Integer.parseInt(commandArr[1]);
                    int multiplyIndex_2 = Integer.parseInt(commandArr[2]);

                    int product = numbersArr[multiplyIndex_1] * numbersArr[multiplyIndex_2];
                    numbersArr[multiplyIndex_1] = product;
                    break;

                case "decrease":
                    for (int i = 0; i < numbersArr.length; i++) {
                        numbersArr[i] -= 1;
                    }
                    break;
            }
            inputLine = scanner.nextLine();
        }
        String[] resultArr = new String[numbersArr.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = String.valueOf(numbersArr[i]);
        }
        System.out.println((String.join(", ", resultArr)));

//        for (int i = 0; i < numbersArr.length; i++) {
//            if (i == numbersArr.length - 1) {
//                System.out.println(numbersArr[i]);
//            } else {
//                System.out.println(numbersArr[i] + ", ");
//            }
    }
}
