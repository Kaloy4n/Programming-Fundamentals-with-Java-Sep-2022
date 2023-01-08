package FinalExamPrep3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> pieceComposer = new LinkedHashMap<>();
        Map<String, String> pieceKey = new LinkedHashMap<>();

        int numOfPieces = Integer.parseInt(scanner.nextLine());

        for (int input = 1; input <= numOfPieces; input++) {
            //"{piece}|{composer}|{key}"
            String[] currentInput = scanner.nextLine().split("\\|");
            String piece = currentInput[0];
            String composer = currentInput[1];
            String key = currentInput[2];
            pieceComposer.put(piece, composer);
            pieceKey.put(piece, key);
        }

        String commands = scanner.nextLine();
        while (!commands.equals("Stop")) {
            String command = commands.split("\\|")[0];

            switch (command) {
                case "Add":
                    String piece = commands.split("\\|")[1];
                    String composer = commands.split("\\|")[2];
                    String key = commands.split("\\|")[3];

                    if(!pieceComposer.containsKey(piece) && !pieceKey.containsKey(piece)) {
                        pieceComposer.put(piece, composer);
                        pieceKey.put(piece, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    } else {
                        System.out.printf("%s is already in the collection!%n", piece);
                    }
                break;

                case "Remove":
                    piece = commands.split("\\|")[1];
                    if(pieceComposer.containsKey(piece) && pieceKey.containsKey(piece)) {
                        pieceComposer.remove(piece);
                        pieceKey.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                break;

                case "ChangeKey":
                    piece = commands.split("\\|")[1];
                    String newKey = commands.split("\\|")[2];
                    if(pieceComposer.containsKey(piece) && pieceKey.containsKey(piece)) {
                        pieceKey.replace(piece, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }

                break;
            }
            commands = scanner.nextLine();
        }
        pieceComposer.forEach((key1, value) -> {
            String key = pieceKey.get(key1);
            System.out.printf("%s -> Composer: %s, Key: %s%n", key1, value, key);
        });
    }
}
