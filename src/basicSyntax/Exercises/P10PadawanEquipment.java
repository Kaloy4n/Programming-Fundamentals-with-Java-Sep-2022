package basicSyntax.exercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // общата сума = сума за мечовете + сума за одежди + сума за колани
        // 1. сума за мечове = бр. мечове (ученици + 10%) * цена за мечовете (вход)
        // 2. сума за одежди = бр. одежди (бр. ученици) * цена за одежди (вход)
        // 3. сума за колани = бр. коланите (бр. ученици - бр. безплатни колани) * цена за колани (вход)

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double sabresPrice  = Double.parseDouble(scanner.nextLine());
        double robesPrice  = Double.parseDouble(scanner.nextLine());
        double beltsPrice  = Double.parseDouble(scanner.nextLine());

        double sumSabres = (int)Math.ceil(1.10 * studentsCount) * sabresPrice;
        double sumRobes = studentsCount * robesPrice;
        double sumBelts = (studentsCount - (studentsCount / 6)) * beltsPrice;
        double totalSum = sumSabres + sumRobes + sumBelts;

        if(totalSum <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            double neededMoney = totalSum - budget;
            System.out.printf("George Lucas will need %.2flv more.",neededMoney);
        }
    }
}
