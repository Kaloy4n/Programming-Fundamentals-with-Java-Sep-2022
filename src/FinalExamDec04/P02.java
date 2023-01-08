package FinalExamDec04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numChecks = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numChecks; i++) {
            String input = scanner.nextLine();
            String regex = "^([$%])(?<tag>[A-Z][a-z]{2,})\\1(:\\s)\\[(\\d+)]\\|\\[(\\d+)]\\|\\[(\\d+)]\\|$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()) {
                String tag = matcher.group("tag");
                int num1 = Integer.parseInt(matcher.group(4));
                int num2 = Integer.parseInt(matcher.group(5));
                int num3 = Integer.parseInt(matcher.group(6));
                char sym1 = (char) num1;
                char sym2 = (char) num2;
                char sym3 = (char) num3;
                System.out.printf("%s: %c%c%c%n", tag, sym1, sym2, sym3);
            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
