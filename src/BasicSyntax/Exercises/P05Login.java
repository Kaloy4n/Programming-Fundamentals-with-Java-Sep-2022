package BasicSyntax.Exercises;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. username -> входни данни
        //2. password -> username на обратно
        //3. въвеждане на парола

        String username = scanner.nextLine(); //"Acer"
        StringBuilder password = new StringBuilder(); //парола -> "recA"
        //всяка позиция в текста -> последната(дължина - 1) към първата(0)
        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password.append(currentSymbol);
        }
        //знаем каква ни е паролата

        String enteredPassword = scanner.nextLine();
        int countFailedTry = 0; //брой неуспешни опити за въвеждане на парола
        //повтаряме: въвеждаме някаква парола
        //стоп: enteredPassword == password
        //продължаваме: enteredPassword != password

        while (!enteredPassword.equals(password.toString())) {
            //грешно въведена парола
            countFailedTry++;
            if (countFailedTry == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        //вярна парола -> enteredPassword == password
        if (enteredPassword.equals(password.toString())) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
