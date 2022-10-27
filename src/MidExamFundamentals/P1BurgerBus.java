package MidExamFundamentals;

import java.util.Scanner;

public class P1BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfCities = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0.0;

        for (int city = 1; city <= numOfCities; city++) {
            String cityName = scanner.nextLine();
            double ownersIncome = Double.parseDouble(scanner.nextLine());
            double ownersExpense = Double.parseDouble(scanner.nextLine());
            double cityProfit;

            if (city % 3 == 0) {
                ownersExpense = 1.50 * ownersExpense;

            } else if (city % 3 == 0 && city % 5 == 0) {
                ownersIncome = 0.90 * ownersIncome;

            } else if (city % 5 == 0) {
                ownersIncome = 0.90 * ownersIncome;

            }
            cityProfit = ownersIncome - ownersExpense;
            totalProfit += cityProfit;
            System.out.printf("In %s Burger Bus earned %.02f leva.%n", cityName, cityProfit);
        }
        System.out.printf("Burger Bus total profit: %.02f leva.%n", totalProfit);
    }
}