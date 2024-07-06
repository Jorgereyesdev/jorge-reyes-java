package semana1.workshop1;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total bill amount: ");
        double billAmount = scanner.nextDouble();

        System.out.print("Enter the tip percentage you wish to leave: ");
        double tipPercentage = scanner.nextDouble();

        double tipAmount = billAmount * (tipPercentage / 100);

        System.out.printf("You should leave a tip of: $%.2f%n", tipAmount);

        scanner.close();
    }
}

