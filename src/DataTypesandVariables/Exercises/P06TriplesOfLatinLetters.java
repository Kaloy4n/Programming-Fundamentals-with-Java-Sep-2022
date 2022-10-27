package DataTypesandVariables.Exercises;

// Write a program to read an integer n and print all triples of the first n small Latin letters, ordered alphabetically.

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    char firstChar = (char) ('a' + i);
                    char secondChar = (char) ('a' + j);
                    char thirdChar = (char) ('a' + k);
                    String result = String.format("%c%c%c", firstChar, secondChar, thirdChar);
                    System.out.println(result);
                }
            }
        }
    }
}