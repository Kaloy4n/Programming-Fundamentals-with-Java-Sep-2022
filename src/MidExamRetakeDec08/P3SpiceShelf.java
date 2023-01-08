package MidExamRetakeDec08;

import java.util.*;
import java.util.stream.Collectors;

public class P3SpiceShelf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> spices = Arrays.stream(scanner.nextLine().split(",\\s")).collect(Collectors.toList());

        String[] commands = scanner.nextLine().split("\\s");
        while(!commands[0].equals("done")) {
            switch (commands[0]) {

                case "AddSpice":
                    String spice = commands[1];
                    if(!spices.contains(spice)) {
                        spices.add(spice);
                    }
                break;

                case "AddManySpices":
                    int indexToAddAt = Integer.parseInt(commands[1]);
                    List<String> spicesToAdd = Arrays.stream(commands[2].split("\\|")).collect(Collectors.toList());
                    spices.addAll(indexToAddAt, spicesToAdd);
                    break;

                case "SwapSpices":
                    String spice1 = commands[1];
                    String spice2 = commands[2];
                    if(spices.contains(spice1) && spices.contains(spice2)) {
                        spice1 = spices.get(spices.indexOf(spice1));
                        int indexOf1 = spices.indexOf(spice1);
                        int indexOf2 = spices.indexOf(spice2);
                        spices.set(indexOf1, spice2);
                        spices.set(indexOf2, spice1);
                    }
                    break;

                case "ThrowAwaySpices":
                    spice = commands[1];
                    int numOfSpicesToRemove = Integer.parseInt(commands[2]);
                    if(spices.contains(spice)) {
                        int indexOfSpice = spices.indexOf(spice);
                        if (spices.indexOf(spice) + numOfSpicesToRemove > indexOfSpice) {
                            spices.subList(indexOfSpice, spices.indexOf(spice) + numOfSpicesToRemove).clear();
                        }
                            }
                    break;
                case "Arrange":
                    Collections.sort(spices);
                    break;
            }
            commands = scanner.nextLine().split("\\s");
        }
        System.out.println(String.join(" ", spices));
    }
}
