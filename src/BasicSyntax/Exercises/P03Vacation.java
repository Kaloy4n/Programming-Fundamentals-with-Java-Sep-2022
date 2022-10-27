package BasicSyntax.Exercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double price = 0;

        switch (dayOfTheWeek) {
            case "Friday":
                switch (typeOfGroup) {
                    case "Students":
                        price = 8.45;
                        if (groupPeople >= 30) {
                            price = price * 0.85;
                        }

                        break;
                    case "Business":
                        price = 10.90;
                        if (groupPeople >= 100) {
                            groupPeople -= 10;
                        }
                        break;
                    case "Regular":
                        price = 15;
                        if (groupPeople >= 10 && groupPeople <= 20) {
                            price = price * 0.95;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (typeOfGroup) {
                    case "Students":
                        price = 9.80;
                        if (groupPeople >= 30) {
                            price = price * 0.85;
                        }
                        break;
                    case "Business":
                        price = 15.60;
                        if (groupPeople >= 100) {
                            groupPeople -= 10;
                        }
                        break;
                    case "Regular":
                        price = 20;
                        if (groupPeople >= 10 && groupPeople <= 20) {
                            price = price * 0.95;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (typeOfGroup) {
                    case "Students":
                        price = 10.46;
                        if (groupPeople >= 30) {
                            price = price * 0.85;
                        }

                        break;
                    case "Business":
                        price = 16;
                        if (groupPeople >= 100) {
                            groupPeople -= 10;
                        }
                        break;
                    case "Regular":
                        price = 22.50;
                        if (groupPeople >= 10 && groupPeople <= 20) {
                            price = price * 0.95;

                        }
                        break;
                }
                break;
        }
        double totalPrice = price * groupPeople;
        System.out.printf("Total price: %.2f",totalPrice);
    }
}