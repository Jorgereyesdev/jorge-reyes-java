package semana1.workshop1;

import java.util.Scanner;

public class DaysMonthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month number");
        int month = scanner.nextInt();
        int days = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                System.out.println("Invalid month. Please enter a number between 1 and 12.");
                return;
        }

        System.out.println("The month is " + month + "have " + days + "days");
        scanner.close();
    }
}
