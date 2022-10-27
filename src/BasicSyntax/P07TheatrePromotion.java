package BasicSyntax;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String day =scanner.nextLine();
        int age =Integer.parseInt(scanner.nextLine());
        int price =0;
        boolean isNotValid=false;
        if (age>=0 && age<=18){
            switch (day) {
                case "Weekday":
                    price = 12;

                    break;
                case "Weekend":
                    price = 15;

                    break;
                case "Holiday":
                    price = 5;
                    break;
            }

        } else if (age>18 && age<=64 ){

            switch (day) {
                case "Weekday":
                    price = 18;

                    break;
                case "Weekend":
                    price = 20;

                    break;
                case "Holiday":
                    price = 12;
                    break;
            }

        } else if (age>64 && age<=122){

            switch (day) {
                case "Weekday":
                    price = 12;

                    break;
                case "Weekend":
                    price = 15;

                    break;
                case "Holiday":
                    price = 10;
                    break;
            }

        }
        else {
            isNotValid=true;
        }

        if (isNotValid){
            System.out.println("Error!");
        }
        else {
            System.out.printf("%d$",price);
        }

    }
}