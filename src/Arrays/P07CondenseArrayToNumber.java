package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/* A program to read an array of integers and condense them by summing adjacent couples of elements until a single integer is obtained.
For example, if we have 3 elements {2, 10, 3}, we sum the first two and the second two elements and obtain {2+10, 10+3} = {12, 13},
, then we sum again all adjacent elements and obtain {12+13} = {25}.
if input is a single number then it's already condensed to a single number.
*/

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] condensedArr = new int[numbersArr.length - 1];

        for (int i = numbersArr.length - 1; i >= 0; i--) {
            if (numbersArr.length == 1) {
                break;
            }
            if (i == 0) {
                int[] condensedShorter = new int[condensedArr.length - 1];
                i = numbersArr.length - 1;
                numbersArr = condensedArr;
                condensedArr = condensedShorter;
            } else {
                condensedArr[i - 1] = numbersArr[i - 1] + numbersArr[i];
            }
        }
        System.out.println(numbersArr[0]);
    }
}