package Methods.Exercises;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. input data -> 2 integers
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        //2. find factorial of 1st num
        long fact1 = calculateFactorial(number1);

        //3. find factorial of 2nd num
        long fact2 = calculateFactorial(number2);

        //4. factorial of 1st num / factorial of 2nd num = decimal
        double divisionResult = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", divisionResult);
    }

    //method that finds a factorial (long) of given num and returns it

    public static long calculateFactorial(int number) {
        //5! = 1 * 2 * 3 * 4 * 5
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
