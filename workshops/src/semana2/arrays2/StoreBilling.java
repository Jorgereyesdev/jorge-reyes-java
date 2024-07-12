package semana2.arrays2;

import java.util.Scanner;

public class StoreBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productos = {"Manzanas", "Naranjas", "Plátanos", "Peras"};
        double[] precios = {1.20, 0.75, 1.50, 1.00};

        int[] cantidades = new int[productos.length];

        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingrese la cantidad de " + productos[i] + ": ");
            cantidades[i] = scanner.nextInt();
        }

        double total = 0.0;
        for (int i = 0; i < productos.length; i++) {
            total += cantidades[i] * precios[i];
        }

        System.out.printf("El valor total de la factura es: $%.2f%n", total);

        scanner.close();
    }
}
