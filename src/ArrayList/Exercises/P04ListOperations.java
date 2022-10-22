package ArrayList.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Read a list of whole numbers
        //2. Read commands and stop when we receive "End"

        List<Integer> numbersList = Arrays.stream(sc.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("End")) {
            //valid command

            if (command.contains("Add")) {
            //•	Add {number} - add number at the end
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                numbersList.add(numberToAdd);

            } else {
                if (command.contains("Insert")) {
                    //•	Insert {number} {index} - insert number at a given index
                    // regex "\\s+" -> one or more intervals
                    int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                    int index = Integer.parseInt(command.split("\\s+")[2]);
                    if (isIndexValid(index, numbersList)) {
                        numbersList.add(index, numberToAdd);
                    } else {
                        System.out.println("Invalid index");
                    }
                } else if (command.contains("Remove")) {
                    //•	Remove {index} - remove that index
                    int indexToRemove = Integer.parseInt(command.split("\\s+")[1]);
                    if (isIndexValid(indexToRemove, numbersList)) {
                        numbersList.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                } else if (command.contains("Shift left")) {
                    //•	Shift left {count} - first number becomes last 'count' times
                    int countShiftLeft = Integer.parseInt(command.split("\\s+")[2]);
                    for (int time = 1; time <= countShiftLeft; time++) {
                        //first number becomes last
                        // get the first number
                        int firstNumber = numbersList.get(0);
                        //delete the first number from the list
                        numbersList.remove(0);
                        //add the first number to the last in the list
                        numbersList.add(firstNumber);
                    }
                } else if (command.contains("Shift right")) {
                    //•	Shift right {count} - last number becomes first 'count' times
                    int countShiftRight = Integer.parseInt(command.split("\\s+")[2]);
                    for (int time = 1; time <= countShiftRight; time++) {
                        // get the last number
                        int lastNumber = numbersList.get(numbersList.size() - 1);
                        //delete the last number from the list
                        numbersList.remove(numbersList.size() - 1);
                        //add the last number to the first in the list
                        numbersList.add(0, lastNumber);
                    }
                }
            }
                    command = sc.nextLine();
        }
        for (int number : numbersList) {
            System.out.print(number + " ");
        }
    }

    // create a method that checks whether an index is valid
    // true -> the index is [0, size - 1]
    // false -> invalid index
    public static boolean isIndexValid (int index, List<Integer> numbersList) {
        return index >= 0 && index <= numbersList.size() - 1;
    }
}
