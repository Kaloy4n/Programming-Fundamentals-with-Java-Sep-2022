package Methods.Exercises;

import java.util.Scanner;

public class P01SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. input data is 3 whole numbers on new rows
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int smallestNumber = printSmallestNumber(number1, number2, number3);
        System.out.println(smallestNumber);
    }

    // method who prints the smallest of 3 whole numbers
    public static int printSmallestNumber (int n1, int n2, int n3) {
        //1st is the smallest
        if(n1 <= n2 && n1 <= n3) {
            return n1;
        }
        // check if 2nd is the smallest
        else if (n2 <= n1 && n2 <= n3) {
            return n2;
        }
        // check if 3rd is the smallest
        else if (n3 <= n1 && n3 <= n2) {
            return n3;
        }
        return 0;
    }
}
