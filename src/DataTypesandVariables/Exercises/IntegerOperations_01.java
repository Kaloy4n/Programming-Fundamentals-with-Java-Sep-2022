package DataTypesandVariables.Exercises;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. input data
        //2. ((first + second) / third) * forth
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int forthNum = Integer.parseInt(scanner.nextLine());

        int result = ((firstNum + secondNum) / thirdNum) * forthNum;
        System.out.println(result);
    }
}
