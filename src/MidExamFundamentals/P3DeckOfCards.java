package MidExamFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cardsDeck =
                Arrays.stream(scanner.nextLine().split(",\\s+"))
                        .collect(Collectors.toList());
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        for (int command = 1; command <= numberOfCommands; command++) {
            List<String> commands = Arrays.stream(scanner.nextLine().split(", "))
                        .collect(Collectors.toList());
            String commandName = commands.get(0);

            switch (commandName) {
                case "Add":
                    if (cardsDeck.contains(commands.get(1))) {
                        System.out.println("Card is already in the deck");
                    } else {
                        cardsDeck.add(commands.get(1));
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    if (!cardsDeck.contains(commands.get(1))) {
                        System.out.println("Card not found");
                    } else {
                        cardsDeck.remove(commands.get(1));
                        System.out.println("Card successfully removed");
                    }
                    break;
                case "Remove At":
                    int indexToRemoveAt = Integer.parseInt(commands.get(1));
                    if (indexToRemoveAt < 0 || indexToRemoveAt >= cardsDeck.size()) {
                        System.out.println("Index out of range");
                    } else {
                        cardsDeck.remove(indexToRemoveAt);
                        System.out.println("Card successfully removed");
                    }
                    break;
                case "Insert":
                    int indexToInsertAt = Integer.parseInt(commands.get(1));
                    String cardName = commands.get(2);
                    if (indexToInsertAt < 0 || indexToInsertAt >= cardsDeck.size()) {
                        System.out.println("Index out of range");
                    } else {
                        if (cardsDeck.contains(cardName)){
                            System.out.println("Card is already added");
                        } else {
                            cardsDeck.add(indexToInsertAt, cardName);
                            System.out.println("Card successfully added");
                        }
                    }
                    break;
            }
        }
        System.out.println(String.join(", ", cardsDeck));
    }
}