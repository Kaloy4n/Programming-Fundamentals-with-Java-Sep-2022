package FinalExamDec04;

import java.util.*;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> guestMeals = new LinkedHashMap<>();
        List<String> meals = new ArrayList<>();

        int countUnlikedMeals = 0;

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String command = input.split("-")[0];
            String guest = input.split("-")[1];

            if (command.equals("Like")) {
                String meal = input.split("-")[2];
                guestMeals.putIfAbsent(guest, new ArrayList<>());
                if(!guestMeals.containsValue(meal)) {
                    guestMeals.get(guest).add(meal);
                    meals.add(meal);
                }
            } else if (command.equals("Dislike")) {
                String meal = input.split("-")[2];
                if (!guestMeals.containsKey(guest)) {
                    System.out.printf("%s is not at the party.%n", guest);
                } else if (!guestMeals.containsValue(meals.contains(meal))) {
                    System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
                } else if (!guestMeals.containsValue(guestMeals.get(guest))){
                    guestMeals.get(guest).remove(meal);
                    meals.remove(meal);
                    System.out.printf("%s doesn't like the %s.%n", guest, meal);
                    countUnlikedMeals++;
                }
            }
            input = scanner.nextLine();
        }
        guestMeals.forEach((key, value) -> System.out.printf("%s: %s%n", key, String.join(", ", value)));
        System.out.printf("Unliked meals: %d%n", countUnlikedMeals);
    }
}
