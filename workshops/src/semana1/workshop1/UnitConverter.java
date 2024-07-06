package semana1.workshop1;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.60934;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        double miles = kilometers / KILOMETERS_PER_MILE;

        System.out.println(kilometers + " kilometers is equivalent to " + miles + " miles.");

        scanner.close();
    }
}
