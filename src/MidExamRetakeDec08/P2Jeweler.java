package MidExamRetakeDec08;

import java.util.Scanner;
import java.util.Arrays;

public class P2Jeweler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] whiteG = Arrays.stream(scanner.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        int[] yellowG = Arrays.stream(scanner.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        int pairs = 0;
        int residualG = 0;

        for (int i = 1; i <= yellowG.length; i++) {
                int sumCheck = whiteG[i] + yellowG[i];
                if(sumCheck == 10) {
                    pairs++;
                    continue;
                }
                while(sumCheck > 10) {
                    yellowG[i] -= 2;
                    sumCheck = whiteG[i] + yellowG[i];
                    if(sumCheck == 10) {
                        pairs++;
                        }
                    }
                if(sumCheck < 10) {
                    residualG += sumCheck;
                }
        }
        if(residualG >= 10) {
            pairs += residualG / 10;
        }
        final int threshold = 7;
        if(pairs >= threshold) {
            System.out.printf("Great success, you created %d earrings.%n", pairs);
        } else {
            int pairsNeeded = threshold - pairs;
            System.out.printf("Keep trying, you need %d more earrings.%n", pairsNeeded);
        }
    }
}
