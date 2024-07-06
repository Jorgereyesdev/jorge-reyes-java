package semana1.workshop1;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la dirección de conversión:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Elija una opción (1 o 2): ");
        int opcion = scanner.nextInt();

        double temperatura;
        double temperaturaConvertida;

        if (opcion == 1) {

            System.out.print("Ingrese la temperatura en grados Celsius: ");
            temperatura = scanner.nextDouble();
            temperaturaConvertida = celsiusToFahrenheit(temperatura);
            System.out.printf("%.2f °C equivale a %.2f °F%n", temperatura, temperaturaConvertida);
        } else if (opcion == 2) {

            System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
            temperatura = scanner.nextDouble();
            temperaturaConvertida = fahrenheitToCelsius(temperatura);
            System.out.printf("%.2f °F equivale a %.2f °C%n", temperatura, temperaturaConvertida);
        } else {
            System.out.println("Opción inválida. Por favor, seleccione 1 o 2.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
