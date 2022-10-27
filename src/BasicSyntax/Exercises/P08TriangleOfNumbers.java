package BasicSyntax.Exercises;

import java.util.Scanner;

public class P08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //колко пъти да печатам ред, докато броя е по-малък или равен на входящия брой
        for (int row = 1; row <= n ; row++) {
            //колко пъти да печатам колонка, докато е по-малка и равна на броя редове
            for (int count = 1; count <= row ; count++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}