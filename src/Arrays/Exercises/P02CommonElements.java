package Arrays.Exercises;

import java.util.Scanner;
/*
Write a program that prints common elements in two arrays.
You have to compare the elements of the second array to the elements of the first.
*/

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Input data -> 2 text arrays
        //2. Iterate through each element from the 2nd array
              // repeat: iterate 1st array -> el 1 == el2

        String [] firstArray = scanner.nextLine().split(" ");
        String [] secondArray = scanner.nextLine().split(" ");
        for (String elementSecondArray : secondArray) {
            // code to repeat for each element in the array
            for (String elementFirstArray : firstArray) {
                if (elementSecondArray.equals(elementFirstArray)) {
                    System.out.print((elementFirstArray + " "));
                    break;
                }
            }
        }
    }
}
