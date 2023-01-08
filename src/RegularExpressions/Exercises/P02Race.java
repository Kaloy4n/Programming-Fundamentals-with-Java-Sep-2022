package RegularExpressions.Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> racersNames = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> racersDistances = new LinkedHashMap<>();
        racersNames.forEach(name -> racersDistances.put(name, 0));

        String regexLetter = "[A-Za-z]+";
        Pattern patternLetter = Pattern.compile(regexLetter);

        String regexNum = "[0-9]";
        Pattern patternDigit = Pattern.compile(regexNum);

        String input = sc.nextLine();
        while (!input.equals("end of race")) {
            StringBuilder nameBuilder = new StringBuilder();
            Matcher matchLetters = patternLetter.matcher(input);
            while (matchLetters.find()) {
                nameBuilder.append(matchLetters.group());
            }

            int distance = 0;
            Matcher matchDigits = patternDigit.matcher(input);
            while (matchDigits.find()) {
                distance += Integer.parseInt(matchDigits.group());
            }

            String racerName = nameBuilder.toString();
            if (racersDistances.containsKey(racerName)) {
                int oldDistance = racersDistances.get(racerName);
                racersDistances.put(racerName, oldDistance + distance);
            }

            input = sc.nextLine();
        }

        List<String> namesOfTopThree = racersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // sort by descending order when reversing
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("1st place: " + namesOfTopThree.get(0));
        System.out.println("2nd place: " + namesOfTopThree.get(1));
        System.out.println("3rd place: " + namesOfTopThree.get(2));
    }
}
