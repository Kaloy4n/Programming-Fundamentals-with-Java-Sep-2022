package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        //\b[A-Z][a-z]+ [A-Z][a-z]+\b
        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex); //template stored in an object
        Matcher matcher = pattern.matcher(text); //all texts from the variable text, which match the template

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
