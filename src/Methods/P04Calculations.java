package Methods;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        switch (commandInput) {
            case "add":
                printSum(firstNumInput, secondNumInput);
                break;
            case "multiply":
                printProduct(firstNumInput, secondNumInput);
                break;
            case "subtract":
                printSubtraction(firstNumInput, secondNumInput);
                break;
            case "divide":
                printDivision(firstNumInput, secondNumInput);
                break;
        }
    }
    public static void printSum(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }
    public static void printProduct(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }
    public static void printSubtraction(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }
    public static void printDivision(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}

