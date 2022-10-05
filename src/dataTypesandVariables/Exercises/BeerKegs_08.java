package dataTypesandVariables.Exercises;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. read int which is the num of kegs
        // 1.1. for each keg read -> model, radius, height
        // 1.2. volume = p * r^2 * h
        // 1.3. check if the keg has the biggest volume

        // search for a maximum value algorithm

        String maxModelKeg = "";
        double maxVolume = Double.MIN_VALUE; // the least value cause we want to replace it with bigger

        int countKegs = Integer.parseInt(scanner.nextLine());
        for (int keg = 1; keg <= countKegs; keg++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double kegModelVolume = Math.PI * Math.pow(radius, 2) * height;
            if (kegModelVolume > maxVolume) {
                maxVolume = kegModelVolume;
                maxModelKeg = kegModel;
            }
        }
        System.out.println(maxModelKeg);
    }
}
