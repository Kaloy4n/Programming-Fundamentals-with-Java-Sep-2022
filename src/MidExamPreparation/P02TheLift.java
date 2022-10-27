package MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleQueued = Integer.parseInt(scanner.nextLine());
        int[] wagonArr = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < wagonArr.length; i++) {
            //15
            //0 0 0 0
            //First state - 4 0 0 0 -> 11 people left
            //Second state – 4 4 0 0 -> 7 people left
            //Third state – 4 4 4 0 -> 3 people left

            //20
            //0 2 0
            //First state - 4 2 0  -> 16 people left
            //Second state – 4 4 0  -> 14 people left
            //Third state – 4 4 4 -> 10 people left, but there're no more wagons.

            final int wagonCapacity = 4;

            if (wagonArr[i] < wagonCapacity) {
                if (peopleQueued >= 4 - wagonArr[i]) {
                    peopleQueued -= 4 - wagonArr[i];
                    wagonArr[i] = 4;
                } else {
                    wagonArr[i] += peopleQueued;
                    peopleQueued = 0;
                }
            }
        }
        boolean full = IntStream.range(0, wagonArr.length).noneMatch(i -> wagonArr[i] != 4);
        if (peopleQueued == 0 && !full) {
            System.out.println("The lift has empty spots!");
        } else if (peopleQueued > 0 && full) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleQueued);
        }
        System.out.print(Arrays.toString(wagonArr).replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}

