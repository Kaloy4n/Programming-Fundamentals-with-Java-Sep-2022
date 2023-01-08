package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", "");
        // symbol -> count of occurrences

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();
        // HashMap -> we don't care about the order of records.
        // LinkedHashMap -> records are arranged according to their order of addition.
        // TreeMap -> records are sorted by their key.

        for (char symbol : text.toCharArray()) {
            //"Kalo"  -> ['K', 'a', 'l', 'o']
            if (!symbolsCount.containsKey(symbol)) {
                symbolsCount.put(symbol, 1);
            } else {
                int currentCount = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentCount + 1);
            }
        }

        symbolsCount.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
