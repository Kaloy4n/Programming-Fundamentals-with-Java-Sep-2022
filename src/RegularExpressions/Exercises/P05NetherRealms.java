package RegularExpressions.Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] demonNames = input.split(",\\s*");

        Map<String, Double> demonsHealth = new HashMap<>();
        Map<String, Double> demonsDmg = new HashMap<>();

        for (String demonName : demonNames) {
            demonsHealth.putIfAbsent(demonName, 0d);
            demonsDmg.putIfAbsent(demonName, 0d);
            double health = addDemonHealth(demonName);
            double dmg = addDamage(demonName);

            demonsHealth.put(demonName, health);
            demonsDmg.put(demonName, dmg);
        }

        demonsHealth
                .entrySet()
                .stream()
                //.sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(value -> {
                    double dmg = demonsDmg.get(value.getKey());
                    System.out.printf("%s - %.0f health, %.2f damage%n",
                            value.getKey(), value.getValue(), dmg);
                });
    }


    private static double addDamage(String demonName) {
        double sum = 0d;
        Pattern findDmg = Pattern.compile("(\\+{1}|-{1}(?=\\d))?\\d+\\.?\\d*");
                                                // easier ->> "[-+]?\\d+\\.?\\d*"
        String[] arithmetic = demonName.split("[^/*]+");

                                                // or ->> [-+.0-9]+
        Matcher digits = findDmg.matcher(demonName);
        while (digits.find()) {
            double digit = Double.parseDouble(digits.group());
            sum += digit;
        }

        for (String arithmeticSignCluster : arithmetic) {
            char[] arithmeticSigns = arithmeticSignCluster.toCharArray();
            for (char sign : arithmeticSigns) {
                if (sign == '*') {
                    sum *= 2;
                } else if (sign == '/') {
                    sum /= 2;
                }
            }
        }

        return sum;
    }

    private static double addDemonHealth(String demonName) {
        double sum = 0d;
        Pattern pattern = Pattern.compile("[^0-9+\\-*/.]");
        Matcher matcher = pattern.matcher(demonName);

        while (matcher.find()) {
            char match = matcher.group().charAt(0);
            sum += match;
        }

        return sum;
    }
}