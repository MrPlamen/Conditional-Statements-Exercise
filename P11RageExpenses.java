package FundConditionalStatExercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lostGameCount = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());
        int trashedHeadsets = 0;
        int trashedMice = 0;
        int trashedKeyboards = 0;

        for (int i = 1; i <= lostGameCount; i++) {



        }
        double rageExpenses = headsetPrice * trashedHeadsets + mousePrice * trashedMice +
                trashedKeyboards * keyboardPrice;
        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
