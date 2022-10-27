package DataTypesandVariables.Exercises;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //@, #, %, r, 3, :, ;, ~
        char symbol = 'D';
        System.out.println((int) symbol);
        int code = 97;
        System.out.println((char) code);

        char symbol2 = scanner.nextLine().charAt(0);

    }
}
