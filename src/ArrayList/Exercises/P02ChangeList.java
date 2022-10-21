package ArrayList.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. read a list of numbers
        List<Integer> numbersList = Arrays.stream(sc.nextLine() // "1 2 3 4 5 5 5 6"
                                    .split(" "))           // ["1", "2", "3", "4", "5", "5", "5", "6"] - an Array with strings
                                    .map(Integer::parseInt)      // [1, 2, 3, 4, 5, 5, 5, 6] -> an Array with whole numbers
                                    .collect(Collectors.toList()); // {1, 2, 3, 4, 5, 5, 5, 6} -> converts it to a List of whole numbers
        String command = sc.nextLine(); //reading commands
        //2. we get commands until we reach "end"
        while (!command.equals("end")) {

            if (command.contains("Delete")) {
                //"Delete {element}"
                //remove all elements of the List which equal the element next to the command

                int numberToRemove = Integer.parseInt(command.split(" ")[1]);
                numbersList.removeAll(Collections.singletonList(numberToRemove));

            } else if (command.contains("Insert")) {
                //"Insert {element} {position}"
                int elementToInsert = Integer.parseInt(command.split(" ")[1]);
                int indexToInsert = Integer.parseInt(command.split(" ")[2]);
                numbersList.add(indexToInsert, elementToInsert);
            }
            command = sc.nextLine();
        }
        // list of whole numbers
        for (int number : numbersList) {
            System.out.print(number + " ");
        }
    }
}
