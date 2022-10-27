package DataTypesAndVariables.MoreExercises;

import java.math.BigDecimal;
import java.util.Scanner;

/* P02 From Left to the Right
You will receive a number representing how many lines we will get as input.
On the next N lines, you will receive a string with 2 numbers separated by a single space.
You need to compare them.
If the left number is greater than the right number, you need to print the sum of all digits in the left number, otherwise, print the sum of all digits in the right number.
 */

public class P02FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= inputRotations; i++) {

            BigDecimal leftNum, rightNum;
            leftNum = new BigDecimal(scanner.next());
            rightNum = new BigDecimal(scanner.next());

            if (leftNum.compareTo(rightNum) > 0) {
                int sumLeft = 0;
                leftNum = leftNum.abs();
                while (leftNum.longValue() > 0) {
                    long lastDigit = leftNum.longValue() % 10;
                    sumLeft += lastDigit;
                    leftNum = leftNum.divide(BigDecimal.valueOf(10));
                }
                System.out.println(sumLeft);
            } else {
                int sumRight = 0;
                rightNum = rightNum.abs();
                while (rightNum.longValue() > 0) {
                    long lastDigit = rightNum.longValue() % 10;
                    sumRight += lastDigit;
                    rightNum = rightNum.divide(BigDecimal.valueOf(10));
                }
                System.out.println(sumRight);
            }
        }
    }
}