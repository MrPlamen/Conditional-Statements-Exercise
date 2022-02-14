package FundConditionalStatExercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int groupSize = Integer.parseInt(sc.nextLine());
        String groupType = sc.nextLine();
        String dayOfWeek = sc.nextLine();
        double pricePerPerson = 0;
        double bill;

        switch (groupType) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        pricePerPerson = 8.45;
                        break;
                    case "Saturday":
                        pricePerPerson = 9.80;
                        break;
                    case "Sunday":
                        pricePerPerson = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        pricePerPerson = 10.90;
                        break;
                    case "Saturday":
                        pricePerPerson = 15.60;
                        break;
                    case "Sunday":
                        pricePerPerson = 16;
                        break;
                }
                break;
            case "Regular":
                        switch (dayOfWeek) {
                            case "Friday":
                                pricePerPerson = 15;
                                break;
                            case "Saturday":
                                pricePerPerson = 20;
                                break;
                            case "Sunday":
                                pricePerPerson = 22.50;
                                break;
                        }
                        break;
                }
                bill = pricePerPerson*groupSize;
            switch (groupType) {
                case "Students":
                    if (groupSize>=30) {
                        bill = bill-(0.15*bill);
                    }
                    break;
                case "Business":
                    if (groupSize>=100) {
                        bill = pricePerPerson*(groupSize-10);
                    }
                    break;
                case "Regular":
                    if (groupSize>=10 && groupSize<=20) {
                        bill = bill-(0.05*bill);
                    }
                    break;
            }
        System.out.printf("Total price: %.2f", bill);
        }
    }
