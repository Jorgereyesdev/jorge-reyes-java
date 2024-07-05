package semana1.workshop1;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double imc = weight / (height * height);

        System.out.println("Your IMC is: + " + imc);

        if (imc > 18.5) {
            System.out.println("You are underweight");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("You are in the normal range");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You have obesity");
        }

        scanner.close();
    }
}
