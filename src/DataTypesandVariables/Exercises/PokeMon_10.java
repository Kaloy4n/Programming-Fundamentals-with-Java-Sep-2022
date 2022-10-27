package DataTypesandVariables.Exercises;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // data inputs
        // repeat:
        // power -= distance -> num of pokes++
        // check for exhaustionFactor
        // stop: power < distance
        // continue: power >= distance

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int startPower = power;
        int countPoke = 0;
        while (power >= distance) {
            power -= distance;
            countPoke++;
            if (power == startPower / 2) {
                if (factor != 0) {
                    power /= factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(countPoke);
    }
}
