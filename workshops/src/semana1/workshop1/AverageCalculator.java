package semana1.workshop1;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first grade: ");
        double grade1 = scanner.nextDouble();

        System.out.print("Enter the second grade: ");
        double grade2 = scanner.nextDouble();

        System.out.print("Enter the third grade: ");
        double grade3 = scanner.nextDouble();

        double average = (grade1 + grade2 + grade3) / 3;

        System.out.printf("The average grade is: %.2f%n", average);

        if (average >= 6) {
            System.out.println("The student passes.");
        } else {
            System.out.println("The student fails.");
        }

        scanner.close();
    }
}
