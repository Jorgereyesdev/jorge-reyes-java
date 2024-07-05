package semana1.workshop1;

import java.util.Scanner;

public class DaysMonthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(String.in);

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

        }
    }
}
