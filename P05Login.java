package FundConditionalStatExercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";
        int invalidPassCounter = 0;
        boolean isBlocked = false;

        String user = sc.nextLine();
        int userLength = user.length();
        for (int i = userLength - 1; i >= 0; i--) {
            password += user.charAt(i);
        }
        String input = sc.nextLine();
        while (!input.equals(password)) {
            invalidPassCounter++;
            if (invalidPassCounter == 4) {
                System.out.printf("User %s blocked!", user);
                isBlocked = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = sc.nextLine();
        }
        if (!isBlocked) {
            System.out.printf("User %s logged in.", user);
        }
    }
}
