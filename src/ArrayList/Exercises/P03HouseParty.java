package ArrayList.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countCommands = Integer.parseInt(sc.nextLine());
        List<String> guestsNames = new ArrayList<>();

        for (int count = 1; count <= countCommands; count++) {
            String command = sc.nextLine();
            //•	"{name} is going!"
            //•	"{name} is not going!"
            List<String> commandParts = Arrays.stream(command.split("\\s+"))
                .collect(Collectors.toList());
            String name = commandParts.get(0);
            if (commandParts.size() == 3) { //case of GOING
                if(guestsNames.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guestsNames.add(name); //adds the name to the last element in the list!
                }
            }
            else if (commandParts.size() == 4) { // case of NOT GOING
                if(guestsNames.contains(name)) {
                    guestsNames.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String name : guestsNames) {
            System.out.println(name);
        }
    }
}
