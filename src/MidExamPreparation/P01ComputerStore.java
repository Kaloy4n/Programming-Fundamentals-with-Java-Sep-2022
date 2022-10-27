package MidExamPreparation;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double totalWithoutTaxes = 0.0;
        double taxes = 0.0;
        if(input.equals("special") || input.equals("regular")) {
            System.out.println("Invalid order!");
        } else {
            while (!input.equals("special") && !input.equals("regular")) {
                double price = Double.parseDouble(input);
                if (price < 0) {
                    System.out.println("Invalid price!");
                } else {
                    totalWithoutTaxes += price;
                    taxes += price * 0.20;
                }
                input = scanner.nextLine();
            }
            double totalPriceIncTaxes = totalWithoutTaxes + taxes;
            if (Double.compare(totalPriceIncTaxes, 0) == 0) {
                System.out.println("Invalid order!");
            } else {
                double discountedTotal = totalPriceIncTaxes - (totalPriceIncTaxes * 0.10);
                if (input.equals("special")) {
                printReceiptByCustomerType(totalWithoutTaxes, taxes, discountedTotal);
                } else {
                printReceiptByCustomerType(totalWithoutTaxes, taxes, totalPriceIncTaxes);
                }
            }
        }
    }

    private static void printReceiptByCustomerType(double totalWithoutTaxes, double taxes, double totalByType) {
        System.out.printf("Congratulations you've just bought a new computer!\n" +
                "Price without taxes: %.2f$\n" +
                "Taxes: %.2f$\n" +
                "-----------\n" +
                "Total price: %.2f$\n", totalWithoutTaxes, taxes, totalByType);
    }
}
