package FinalExamPrep3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> emojis = new ArrayList<>();
        Pattern pattern1 = Pattern.compile("([0-9])");
        Pattern pattern2 = Pattern.compile("(\\*{2}|:{2})([A-Z][a-z]{2,})\\1");
        int threshold = 1;

        Matcher matcher = pattern1.matcher(input);
        while (matcher.find()) {
            threshold *= Integer.parseInt(matcher.group(1));
        }

        Matcher matcher2 = pattern2.matcher(input);

        while (matcher2.find()) {
            emojis.add(matcher2.group());
        }

        System.out.printf("Cool threshold: %d%n", threshold);
        System.out.printf("%s emojis found in the text. The cool ones are:%n", emojis.size());

        for (String emoji : emojis) {
            int sumLetter = 0;
            for (int k = 0; k < emoji.length(); k++) {
                char c = emoji.charAt(k);
                if (Character.isLetter(c))
                    sumLetter += c;
            }
            if (sumLetter > threshold) {
                System.out.println(emoji);
            }
        }
    }
}
