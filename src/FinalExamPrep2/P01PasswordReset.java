package FinalExamPrep2;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine(); //pass to be modified
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            //1. command = "TakeOdd"

            //3. command = "Substitute {substring} {substitute}"

            if (command.equals("TakeOdd")) {
                //1. get the symbols of odd indexes (1, 3, 5, 7, 9, ...)
                pass = getCharsOnOddIndexes(pass);
                //2. print the new pass
                System.out.println(pass);

            } else if (command.contains("Cut")) {
                //2. command = "Cut {index} {length}"
                int index = Integer.parseInt(command.split("\\s+")[1]);
                int length = Integer.parseInt(command.split("\\s+")[2]);
                // 1. get from the pass  the substring, which starts from the index and is with given length
                String substringToRemove = pass.substring(index, index + length);
                //2. remove the first occurrence of this substring
                pass = pass.replaceFirst(substringToRemove, "");
                System.out.println(pass);

            } else if (command.contains("Substitute")) {
                //3. command = "Substitute est var".split("\\s+") -> [Substitute", "est", "var"]
                String substring = command.split("\\s+")[1];
                String substitute = command.split("\\s+")[2];
                if (pass.contains(substring)) {
                    // replaces all occurrences of substring with substitute
                    pass = pass.replaceAll(substring, substitute);
                    System.out.println(pass);

                } else {
                    // if there is no substring to replace
                    System.out.println("Nothing to replace!");
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s%n", pass);
    }

    private static String getCharsOnOddIndexes(String pass) {
        StringBuilder newPass = new StringBuilder();
        for (int pos = 0; pos <= pass.length() - 1; pos++) {
            if (pos % 2 != 0) {
                char currentSymbol = pass.charAt(pos);
                newPass.append(currentSymbol);
            }
        }
        return newPass.toString();
    }
}
