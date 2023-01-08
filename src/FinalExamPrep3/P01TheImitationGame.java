package FinalExamPrep3;

import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMsg = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            String[] operations = command.split("\\|");
            String instruction = operations[0];

            switch (instruction) {
                case "Move":
                    int numOfMoves = Integer.parseInt(operations[1]);
                    StringBuilder beginningPart = new StringBuilder();
                    for (int i = 0; i < numOfMoves; i++) {
                        char symbolToBeMoved = encryptedMsg.charAt(i);
                        beginningPart.append(symbolToBeMoved);
                    }
                    String endPart = encryptedMsg.substring(numOfMoves);
                    encryptedMsg = endPart + beginningPart;
                    break;

                case "Insert":
                    StringBuilder newMsg = new StringBuilder();
                    int insertIndex = Integer.parseInt(operations[1]);
                    String insertValue = operations[2];
                    for (char symbol : encryptedMsg.toCharArray()) {
                        newMsg.append(symbol);
                    }
                    newMsg.insert(insertIndex, insertValue);
                    encryptedMsg = newMsg.toString();
                    break;

                case "ChangeAll":
                    String substring = operations[1];
                    String replacement = operations[2];
                    encryptedMsg = encryptedMsg.replace(substring, replacement);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s%n", encryptedMsg);
    }
}
