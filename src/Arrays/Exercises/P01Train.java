package Arrays.Exercises;

import java.util.Scanner;

/* You will be given a count of wagons in a train n.
On the next n lines, you will receive how many people will get on that wagon.
In the end, print the whole train and the sum of the people on the train.
*/

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfWagons = Integer.parseInt(scanner.nextLine());
        // create an array of size numOfWagons
        int[]peopleArr = new int[numOfWagons];
        int sum = 0;
        for (int i = 0; i < numOfWagons; i++) {
            //fil in the array elements with the number of People hopping on the train in each wagon.
            peopleArr[i] = Integer.parseInt(scanner.nextLine());
            sum += peopleArr[i];
            System.out.print(peopleArr[i] + " ");
        }
        System.out.printf("%n%d", sum);
    }
}
