package dataTypesandVariables.Exercises;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeople = Integer.parseInt(scanner.nextLine());
        short capacity = Short.parseShort(scanner.nextLine());

        int fullCourses = (int) Math.ceil((double) numPeople / capacity);

//        int fullCourses = numPeople / capacity;
//        if (numPeople % capacity != 0) {
//            fullCourses += 1;
//        }
        System.out.println(fullCourses);
    }
}
