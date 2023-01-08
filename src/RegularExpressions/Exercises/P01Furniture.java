package RegularExpressions.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> furniture = new ArrayList<>();
        double totalSum = 0;
        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        while (!input.equals("Purchase")) {
            Matcher match = pattern.matcher(input);
            //match = ">>(?<furnitureName>Sofa)<<(?<price>312.23)!(?<quantity>3)"
            if (match.find()) {
                String furnitureName = match.group("furnitureName");
                double price = Double.parseDouble(match.group("price"));
                int quantity = Integer.parseInt(match.group("quantity"));

                furniture.add(furnitureName);
                double currentFurnitureName = price * quantity;
                totalSum += currentFurnitureName;
            }
            scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
