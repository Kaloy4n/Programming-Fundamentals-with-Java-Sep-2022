package MidExamFundamentals;

import java.util.Scanner;

public class P2TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(">>");
        //inputArr ["family 3 7210", "van 4 2345", "heavyDuty 9 31000"]
        double taxAgencyRevenue = 0.0;
        double taxAmount = 0.0;
        boolean isCarTypeValid = true;

        for (int i = 0; i < inputArr.length; i++) {
               String[] vehicles = inputArr[i].split(" ");
               String carType = vehicles[0];
               int taxYears = Integer.parseInt(vehicles[1]);
               int kmTravelled = Integer.parseInt(vehicles[2]);

               if (carType.equals("family")) {
                   int taxIncreaseTimes = kmTravelled / 3000;
                   taxAmount = taxIncreaseTimes * 12 + (50 - taxYears * 5);
               }
               if (carType.equals("heavyDuty")) {
                   int taxIncreaseTimes = kmTravelled / 9000;
                   taxAmount = taxIncreaseTimes * 14 + (80 - taxYears * 8);
               }
               if (carType.equals("sports")) {
                   int taxIncreaseTimes = kmTravelled / 2000;
                   taxAmount = taxIncreaseTimes * 18 + (100 - taxYears * 9);
               }
               if (!carType.equals("sports") && !carType.equals("heavyDuty") && !carType.equals("family")) {
                   isCarTypeValid = false;
                   System.out.println("Invalid car type.");
                   if (i < inputArr.length - 1) {
                       inputArr[i] = inputArr[i + 1];
                   }
               }
               if (isCarTypeValid) {
                   System.out.printf("A %s car will pay %.02f euros in taxes.%n", carType, taxAmount);
                   taxAgencyRevenue += taxAmount;
               } else {
                   isCarTypeValid = true;
               }
        }
        System.out.printf("The National Revenue Agency will collect %.02f euros in taxes.", taxAgencyRevenue);
    }
}

