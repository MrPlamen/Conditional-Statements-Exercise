package FundConditionalStatExercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(sc.nextLine());
        double coffeePrice = 0;
        double totalPrice = 0;

        for (int i=1; i<=countOfOrders; i++) {
            double pricePerCapsule = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            int capsulesCount = Integer.parseInt(sc.nextLine());
            coffeePrice = ((days * capsulesCount) * pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f\n", coffeePrice);
            totalPrice += coffeePrice;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
