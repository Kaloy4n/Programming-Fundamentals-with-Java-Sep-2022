package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(?<day>\\d{2})(?<separator>[.\\-/])(?<month>[A-Z][a-z]{2})(\\2)(?<year>\\d{4})";
        Pattern pattern = Pattern.compile(regex); //template stored in an object
        Matcher matcher = pattern.matcher(text); //all texts from the variable text, which match the template

        while (matcher.find()) {
            //"13/Jul/1928"
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
