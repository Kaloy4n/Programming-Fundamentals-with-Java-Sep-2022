package ArrayList.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); //1 2 3 | 4 5 6 |  7 8
        List<String> listSeparatedByPipe = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        //1 2 3 | 4 5 6 |  7 8 -> split -> ["1 2 3 ", "4 5 6 ", "  7 8"] -> {"1 2 3 ", "4 5 6 ", "  7 8"}
        Collections.reverse((listSeparatedByPipe));
        //reverse -> {"  7 8","4 5 6 ", "1 2 3 "}
        // list.toString() -> "
        System.out.println(listSeparatedByPipe.toString()
                .replace("[","")
                .replace("]","")
                .trim()
                .replaceAll(",","")
                .replaceAll("\\s+"," "));
    }
}
