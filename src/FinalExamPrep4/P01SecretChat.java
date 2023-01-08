package FinalExamPrep4;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String[] instructionsArr = scanner.nextLine().split(":\\|:");

        while (!instructionsArr[0].equals("Reveal")) {
            String command = instructionsArr[0];

            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(instructionsArr[1]);
                    message.insert(index, " ");
                    System.out.println(message);
                    break;

                case "Reverse":
                    String substring = instructionsArr[1];

                    if (!message.toString().contains(substring)) {
                        System.out.println("error");
                    } else {
                        int startIndex = message.indexOf(substring);
                        int endIndex = startIndex + 1 + substring.length();
                        StringBuilder reversedStr = new StringBuilder();
                        for (int i = substring.length() - 1; i >= 0; i--) {
                            reversedStr.append(substring.charAt(i));
                        }
                        message.delete(startIndex, endIndex);
                        message.append(reversedStr);
                        System.out.println(message);
                    }
                    break;

                case "ChangeAll":
                    substring = instructionsArr[1];
                    String replacement = instructionsArr[2];
                    String str = message.toString();
                    String newStr = str.replace(substring, replacement);
                    message.setLength(0);
                    message.append(newStr);
                    System.out.println(message);
                    break;
            }
            instructionsArr = scanner.nextLine().split(":\\|:");
        }
        System.out.printf("You have a new text message: %s%n", message);
    }
}
