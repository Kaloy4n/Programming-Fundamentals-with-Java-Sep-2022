package dataTypesandVariables.exercise;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. read input data - count of symbols;
        // 1.1. for each symbol we insert a value
        // 1.2 we convert the value into ASCII code
        // 1.3 sum the ASCII code numbers

        int sum = 0; //sum of the ASCII decimal codes
        int numOfSymbols = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= numOfSymbols; count++) {
            char value = scanner.nextLine().charAt(0);
            sum += (int) value; // int + char results automatically in ASCII code for the char so we can skip (int) cast
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
