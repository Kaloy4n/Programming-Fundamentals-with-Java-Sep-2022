package dataTypesandVariables.Exercises;

/*You have a water tank with a capacity of 255 liters.
On the next n lines, you will receive liters of water, which you must pour into your tank.
If the capacity is not enough, print "Insufficient capacity!" and continue reading the next line.
On the last line, print the liters in the tank.
*/

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = Byte.parseByte(scanner.nextLine());
        short tankCapacity = 255;
        int litersInTank = 0;
        for (int i = 1; i <= n ; i++) {
                short quantityAdded = Short.parseShort(scanner.nextLine());
                litersInTank += quantityAdded;
                if (litersInTank > tankCapacity) {
                System.out.println("Insufficient capacity!");
                litersInTank -= quantityAdded;
                }
            }
        System.out.println(litersInTank);
    }
}