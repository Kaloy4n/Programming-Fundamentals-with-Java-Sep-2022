package basicSyntax;

import java.util.Scanner;

public class P01StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double avgGrade = Double.parseDouble(scanner.nextLine());

        // String resultText = String.format("Name: %s Age: %d, Grade: %.2f", studentName, age, avgGrade);
        // System.out.println(resultText);
        // Scanner.nextInt() doesn't move the cursor to the next line. Don't use it until said to do so.

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",studentName, age, avgGrade);

    }
}
