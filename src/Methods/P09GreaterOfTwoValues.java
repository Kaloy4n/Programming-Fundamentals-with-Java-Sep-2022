package Methods;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNum, secondNum));
                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstSymbol, secondSymbol));
                break;
            case "string":
                String firstStr = scanner.nextLine();
                String secondStr = scanner.nextLine();
                System.out.println(getMax(firstStr, secondStr));
                break;
        }
    }
    static int getMax(int firstNum, int secondNum) {
        if(firstNum > secondNum) {
            return firstNum;
        } else {
            return secondNum;
        }
    }

    static char getMax(char firstSymbol, char secondSymbol) {
        if(firstSymbol > secondSymbol) {
            return firstSymbol;
        } else {
            return secondSymbol;
        }
    }

    static String getMax(String firstStr, String secondStr) {
        if(firstStr.compareTo(secondStr) >= 0) {
            return firstStr;
        } else {
            return secondStr;
        }
    }
}


