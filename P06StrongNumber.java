package FundConditionalStatExercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int numLength = input.length();
        int currentFactorial;
        int sumOfFactorials = 0;

        for (int i=0; i<numLength; i++) {
            currentFactorial = 1;
            char current = input.charAt(i);
            int currentIntoNumber = Integer.parseInt(String.valueOf(current));
            for (int j=currentIntoNumber; j>=1; j--) {
                currentFactorial *= j;
            }
            sumOfFactorials += currentFactorial;
        }

        int originalNumber = Integer.parseInt(input);
        if (sumOfFactorials == originalNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
