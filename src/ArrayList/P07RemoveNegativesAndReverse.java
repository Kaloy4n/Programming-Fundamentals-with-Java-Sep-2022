package ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(sc.nextLine().split( " "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbersList.removeIf(n -> n < 0);
        Collections.reverse(numbersList);

        if(numbersList.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));
        }
    }
}
