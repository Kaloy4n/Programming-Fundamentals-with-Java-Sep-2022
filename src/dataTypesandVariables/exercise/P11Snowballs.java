package dataTypesandVariables.exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte numOfSnowballs = Byte.parseByte(scanner.nextLine());
        double maxSnowballValue = Double.MIN_VALUE;
        short maxSnowballSnow = Short.MIN_VALUE;
        short maxSnowballTime = Short.MIN_VALUE;
        short maxSnowballQuality = Short.MIN_VALUE;

        for (int ball = 1; ball <= numOfSnowballs ; ball++) {
            short snowballSnow = Short.parseShort(scanner.nextLine());
            short snowballTime  = Short.parseShort(scanner.nextLine());
            short snowballQuality = Short.parseShort(scanner.nextLine());
            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);
            if (snowballValue > maxSnowballValue) {
                maxSnowballValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality);
    }
}
