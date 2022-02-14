package FundConditionalStatExercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initialInput = sc.nextLine();
        double coins;
        double coinsSum = 0;
        boolean invalidProduct = false;
        double unacceptableCoin = 0;
        double productPrice = 0;
        String product = " ";

        while (!initialInput.equals("Start")) {
            coins = Double.parseDouble(initialInput);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                coinsSum += coins;
            } else {
                unacceptableCoin = coins;
                System.out.printf("\nCannot accept %.2f\n", unacceptableCoin);
            }
            initialInput = sc.nextLine();
        }

        String secondInput = sc.nextLine();
        while (!secondInput.equals("End")) {
            if (secondInput.equals("Nuts") || secondInput.equals("Crisps") ||
            secondInput.equals("Soda") || secondInput.equals("Coke") || secondInput.equals("Water")) {
                switch (secondInput) {
                    case "Nuts":
                        productPrice = 2.0;
                        product = "Nuts";
                        break;
                    case "Water":
                        productPrice = 0.7;
                        product = "Water";
                        break;
                    case "Crisps":
                        productPrice = 1.5;
                        product = "Crisps";
                        break;
                    case "Soda":
                        productPrice = 0.8;
                        product = "Soda";
                        break;
                    case "Coke":
                        productPrice = 1.0;
                        product = "Coke";
                        break;
                }
            } else {
                System.out.println("Invalid product");
                invalidProduct = true;
            }
            if (productPrice<=coinsSum && invalidProduct==false) {
                System.out.printf("Purchased %s\n", product);
                coinsSum = coinsSum-productPrice;
            } else if (!invalidProduct){
                System.out.println("Sorry, not enough money");
            }
            secondInput = sc.nextLine();
        }

        System.out.printf("Change: %.2f\n", coinsSum);
    }
}
