package FundConditionalStatExercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyAvailable = Double.parseDouble(sc.nextLine());
        int countOfStudents = Integer.parseInt(sc.nextLine());
        double lightsaberPrice = Double.parseDouble(sc.nextLine());
        double robePrice = Double.parseDouble(sc.nextLine());
        double beltPrice = Double.parseDouble(sc.nextLine());

        double freeBelts = Math.floor(countOfStudents/6);

        double countOfSabers = Math.ceil(countOfStudents + (0.1 * countOfStudents));
        int countOfRobes = countOfStudents;
        double countOfBelts = countOfStudents - freeBelts;

        double bill = countOfSabers * lightsaberPrice + countOfBelts * beltPrice + countOfRobes * robePrice;
        if (bill<=moneyAvailable) {
            System.out.printf("The money is enough - it would cost %.2flv.", bill);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", bill-moneyAvailable);
        }
    }
}
