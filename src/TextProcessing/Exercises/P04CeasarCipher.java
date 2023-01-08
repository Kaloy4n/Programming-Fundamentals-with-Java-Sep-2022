package TextProcessing.Exercises;

import java.util.Scanner;

public class P04CeasarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (char symbol : str.toCharArray()) {
            char encryptSymbol = (char) (symbol + 3);
            encryptedText.append(encryptSymbol);
        }

        System.out.println(encryptedText);
    }
}
