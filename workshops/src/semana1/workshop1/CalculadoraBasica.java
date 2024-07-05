package semana1.workshop1;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;

        System.out.println("The sum is: " + sum);
        System.out.println("The subtraction is: " + subtraction);
        System.out.println("The multiplication is: " + multiplication);

        if (num2 != 0) {
            System.out.println("The division is: " + division);
        } else {
            System.out.println("can not be divided by 0");
        }

        scanner.close();
    }
}