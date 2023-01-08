package FinalExamPrep4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> citiesPopulation = new LinkedHashMap<>();
        Map<String, Integer> citiesGold = new LinkedHashMap<>();
        int countCities = 0;

        while (!input.equals("Sail")) {
            String city = input.split("\\|\\|")[0];
            int population = Integer.parseInt(input.split("\\|\\|")[1]);
            int gold = Integer.parseInt(input.split("\\|\\|")[2]);

            if(!citiesPopulation.containsKey(city)) {
                citiesPopulation.put(city, population);
                citiesGold.put(city, gold);
                countCities++;
            } else {
                citiesPopulation.put(city, citiesPopulation.get(city) + population);
                citiesGold.put(city, citiesGold.get(city) + gold);
            }
            input = scanner.nextLine();
        }
        String events = scanner.nextLine();

        while(!events.equals("End")) {
            String command = events.split("=>")[0];
            switch (command) {
                case "Plunder":
                    String town = events.split("=>")[1];
                    int people = Integer.parseInt(events.split("=>")[2]);
                    int gold = Integer.parseInt(events.split("=>")[3]);

                    citiesPopulation.put(town, citiesPopulation.get(town) - people);
                    citiesGold.put(town, citiesGold.get(town) - gold);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);

                    if(citiesPopulation.get(town) == 0 || citiesGold.get(town) == 0) {
                        citiesPopulation.remove(town);
                        citiesGold.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                        countCities--;
                    }
                    break;

                case "Prosper":
                    town = events.split("=>")[1];
                    gold = Integer.parseInt(events.split("=>")[2]);

                    if(gold >= 0) {
                        citiesGold.put(town, citiesGold.get(town) + gold);
                        int currentGold = citiesGold.get(town);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, currentGold);
                    } else {
                        System.out.println("Gold added cannot be a negative number!");
                    }
                    break;

            }
            events = scanner.nextLine();
        }
        if (countCities > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", countCities);
            citiesPopulation.forEach((key, value) -> {
                int gold = citiesGold.get(key);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", key, value, gold);
            });
        } else {
            System.out.printf("Ahoy, Captain! All targets have been plundered and destroyed!%n");
        }
    }
}
