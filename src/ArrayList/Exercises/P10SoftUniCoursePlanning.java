package ArrayList.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> schedule = Arrays.stream(sc.nextLine()
                .split(", "))
                .collect(Collectors.toList());

        String input = sc.nextLine();
        while (!input.equals("course start")) {
            String[] tokens = input.split(":");
            String command = tokens[0];
            String lessonTitle = tokens[1];

                switch(command) {

                case "Add":
                    if(!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if(!schedule.contains(lessonTitle)) {
                        schedule.add(index, lessonTitle);
                    }
                    break;

                case "Remove":
                    int indexOfLesson = schedule.indexOf(lessonTitle);
                    if (indexOfLesson < schedule.size() - 1 && schedule.get(indexOfLesson + 1).equals(lessonTitle + "-Exercise")) {
                        schedule.remove(indexOfLesson + 1);
                    } else schedule.remove(lessonTitle);
                    break;

                case "Swap":
                    String lessonTitle2 = tokens[2];
                    String exercise1 = lessonTitle + "-Exercise";
                    String exercise2 = lessonTitle2 + "-Exercise";

                    if (schedule.contains(lessonTitle) && schedule.contains(lessonTitle2)) {
                        int index1 = schedule.indexOf(lessonTitle);
                        int index2 = schedule.indexOf(lessonTitle2);
                        schedule.set(index1, lessonTitle2);
                        schedule.set(index2, lessonTitle);

                        if (index1 < schedule.size() - 1 && schedule.get(index1 + 1).equals(exercise1)) {
                            schedule.remove(index1 + 1);
                            schedule.add(index2 + 1, exercise1);
                        }
                        if (index2 < schedule.size() - 1 && schedule.get(index2 + 1).equals(exercise2)) {
                            schedule.remove(index2 + 1);
                            schedule.add(index1 + 1, exercise2);
                        }
                    }
                    break;

                case "Exercise":
                    int indexLesson = schedule.indexOf(lessonTitle);
                    String exercise = lessonTitle + "-Exercise";
                    if(schedule.contains(lessonTitle)) {
                        if (indexLesson == schedule.size() - 1) {
                            schedule.add(indexLesson + 1, exercise);
                        } else if (!schedule.get(indexLesson + 1).equals(exercise)) {
                            schedule.add(indexLesson + 1, exercise);
                        }
                    } else {
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    }
                    break;
            }
            input = sc.nextLine();
        }
        printList(schedule);
    }

    private static void printList(List<String> elements) {
        int count = 1;
        for (String element : elements) {
            System.out.println(count + "." + element);
            count++;
        }
    }
}
