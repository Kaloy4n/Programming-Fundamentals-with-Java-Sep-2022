package Methods.Exercises;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        printVowelsCount(text);
    }
    // method to print the number of vowels count

    public static void printVowelsCount(String text) {
        // text is only with lowercase letters
        // text = "Kaloyan" -> 4
        int count = 0;
        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
