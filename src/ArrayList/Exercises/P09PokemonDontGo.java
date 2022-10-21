package ArrayList.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(sc.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumRemovedElements = 0;

        while(numbersList.size() > 0) {
            int index = Integer.parseInt(sc.nextLine());
            //1. index is within size of 0 and last index

            if (index >= 0 && index <= numbersList.size() - 1) {
                int removedElement = numbersList.get(index);
                sumRemovedElements += removedElement;
                numbersList.remove(index);
                modifyList(numbersList, removedElement);
            }
            //2. index is less than 0

            else if (index < 0) {
                int firstElement = numbersList.get(0);
                sumRemovedElements += firstElement;
                numbersList.remove(0);
                int lastElement = numbersList.get(numbersList.size() - 1);
                numbersList.add(lastElement); //with .add() we add an element to the last position/index in the list!!!
                modifyList(numbersList, firstElement);
            }
            //3. index is larger than the last index

            else if (index > numbersList.size() - 1) {
                int lastElement = numbersList.get(numbersList.size() - 1);
                sumRemovedElements += lastElement;
                numbersList.remove(numbersList.size() - 1);
                int firstElement = numbersList.get(0);
                numbersList.add(firstElement); //with .add() we add an element to the last position/index in the list!!!
                modifyList(numbersList, lastElement);
            }
        }
        System.out.println(sumRemovedElements);
    }

    private static void modifyList(List<Integer> numbersList, int removedElement) {
        for (int indexInList = 0; indexInList <= numbersList.size() - 1; indexInList++) {
            int currentNumber = numbersList.get(indexInList);
            if (currentNumber <= removedElement){
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }
            numbersList.set(indexInList, currentNumber);
        }
    }
}
