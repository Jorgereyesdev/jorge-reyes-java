package semana1.workshop1;

import java.util.Scanner;

public class TaxiFareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir las tarifas
        final double TARIFA_BASE = 5.0;  // Tarifa base en dólares
        final double TARIFA_POR_KILOMETRO = 2.0;  // Tarifa por kilómetro en dólares

        // Solicitar la distancia del viaje al usuario
        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        // Calcular el costo del viaje
        double costoViaje = TARIFA_BASE + distancia * TARIFA_POR_KILOMETRO;

        // Mostrar el resultado al usuario
        System.out.printf("El costo del viaje es: $%.2f%n", costoViaje);

        scanner.close();
    }
}
