package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02repeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        List<String> repeatList = new ArrayList<>();
        for (String currentWord : wordsArr) {
            int countTimes = currentWord.length();
            String repeatWord = repeatString(currentWord, countTimes);
            repeatList.add(repeatWord);
        }
        System.out.println(String.join("", repeatList));
    }

    public static String repeatString(String word, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += word;
        }
        return result;
    }
}
