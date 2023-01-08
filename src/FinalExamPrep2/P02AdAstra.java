package FinalExamPrep2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String regex = "([#|])(?<foodName>[A-Za-z\\s]+)\\1(?<expDate>[0-9]{2}/[0-9]{2}/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int totalCalories = 0;
        StringBuilder foodInfo = new StringBuilder();

        while (matcher.find()) {
            String foodName = matcher.group("foodName");
            String expDate = matcher.group("expDate");
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories += calories;
            foodInfo.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", foodName, expDate, calories));
        }
        int days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        System.out.println(foodInfo);
    }
}