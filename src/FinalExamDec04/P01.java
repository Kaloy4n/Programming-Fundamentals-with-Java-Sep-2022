package FinalExamDec04;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] commands = scanner.nextLine().split("\\s+");
        while(!commands[0].equals("End")) {
            String command = commands[0];

            switch (command) {
                case "Translate": {
                    String symbol = commands[1];
                    String replacement = commands[2];
                    str = str.replace(symbol, replacement);
                    System.out.println(str);

                    break;
                }
                case "Includes": {
                    String subStr = commands[1];
                    if (str.contains(subStr)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }

                    break;
                }
                case "Start": {
                    String subStr = commands[1];
                    if (str.startsWith(subStr)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }

                    break;
                }
                case "Lowercase":
                    str = str.toLowerCase();
                    System.out.println(str);

                    break;
                case "FindIndex": {
                    String symbol = commands[1];
                    System.out.println(str.lastIndexOf(symbol));

                    break;
                }
                case "Remove":
                    int startIndex = Integer.parseInt(commands[1]);
                    int count = Integer.parseInt(commands[2]);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.delete(startIndex, startIndex + count);
                    str = sb.toString();
                    System.out.println(str);
                    break;
            }
            commands = scanner.nextLine().split("\\s+");
        }
    }
}
