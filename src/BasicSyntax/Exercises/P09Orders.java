package BasicSyntax.Exercises;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double price;
        int days;
        int capsulesCount;
        double sum = 0;
        double currentPrice;

        for (int i = 1; i <=orders ; i++) {
            price = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());
            currentPrice = (days * capsulesCount) * price;
            System.out.printf("The price for the coffee is: $%.2f%n", currentPrice);
            sum += currentPrice;
        }
        System.out.printf("Total: $%.2f", sum);
    }
}