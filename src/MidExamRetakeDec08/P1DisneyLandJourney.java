package MidExamRetakeDec08;

import java.util.Scanner;

public class P1DisneyLandJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double journeyCost = Double.parseDouble(scanner.nextLine());
        int numMonths = Integer.parseInt(scanner.nextLine());
        double totalSaved = 0.0;

        for (int i = 1; i <= numMonths; i++) {

            if(i % 2 != 0) {
                totalSaved = totalSaved - totalSaved * 0.16;
            }
            if(i % 4 == 0) {
                totalSaved = totalSaved + totalSaved * 0.25;
            }
            double currentSavings = journeyCost * 0.25;
            totalSaved += currentSavings;
        }
        if (totalSaved >= journeyCost) {
            double difference = totalSaved - journeyCost;
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.%n", difference);
        } else {
            double moneyNeeded = journeyCost - totalSaved;
            System.out.printf("Sorry. You need %.2flv. more.%n", moneyNeeded);
        }
    }
}
