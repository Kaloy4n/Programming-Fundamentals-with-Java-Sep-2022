package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        int differenceAtIndex = 0;
        boolean areIdentical = true;

        if (firstArr.length >= secondArr.length) {
            for (int i = 0; i <= firstArr.length - 1; i++) {
            int firstNum = firstArr[i];
            int secondNum = secondArr[i];
            if (firstNum == secondNum) {
                sum += firstNum;
            } else {
                differenceAtIndex = i;
                areIdentical = false;
                break;
            }
        }
        } else {
            for (int i = 0; i < secondArr.length; i++) {
                int firstNum = firstArr[i];
                int secondNum = secondArr[i];
                if (firstNum == secondNum) {
                    sum += firstNum;
                } else {
                    differenceAtIndex = i;
                    areIdentical = false;
                    break;
                }
            }
        }
        if(areIdentical) {
        System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
        System.out.printf("Arrays are not identical. Found difference at %d index.", differenceAtIndex);
        }
    }
}
