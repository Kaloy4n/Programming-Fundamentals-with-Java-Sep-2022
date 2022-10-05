package dataTypesandVariables.Exercises;

import java.util.Scanner;

public class PrintPartAsciiTable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input data -> start ascii code; end ascii code
        // each ascii code from start to end
        // repeat each

        int startCode = Integer.parseInt(scanner.nextLine());
        int endCode = Integer.parseInt(scanner.nextLine());

        for (int code = startCode; code <= endCode; code++) {
            System.out.print((char) code + " ");
        }
    }
}
