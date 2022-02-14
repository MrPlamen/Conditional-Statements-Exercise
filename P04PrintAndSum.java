package FundConditionalStatExercise;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startingNumber = Integer.parseInt(sc.nextLine());
        int finalNumber = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i=startingNumber; i<=finalNumber; i++) {
            System.out.print(i + " ");
            sum+=i;
        }
        System.out.println("\nSum: " + sum);
    }
}
