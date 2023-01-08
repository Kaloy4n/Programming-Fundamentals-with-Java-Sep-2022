package RegularExpressions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        //\b[A-Z][a-z]+ [A-Z][a-z]+\b
        String regex = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex); //template stored in an object
        Matcher matcher = pattern.matcher(text); //all texts from the variable text, which match the template

        List<String> matchedPhones = new LinkedList<>();
        while (matcher.find()) {
            matchedPhones.add(matcher.group());
        }
        System.out.println(String.join(", ", matchedPhones));
    }
}