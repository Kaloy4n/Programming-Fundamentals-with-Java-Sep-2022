package DataTypesandVariables;

import java.util.Scanner;

public class P02PoundToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float pound = Float.parseFloat(scanner.next());
        float dollars = pound * 1.36f;
        System.out.printf("%.3f", dollars);
    }
}
