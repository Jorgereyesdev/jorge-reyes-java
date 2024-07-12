package semana2.arrays2;

import java.util.Scanner;

public class StoreBillingWithDiscounts {
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

        double descuento = 0.0;
        if (total >= 1000) {
            descuento = 0.25;
        } else if (total >= 500) {
            descuento = 0.20;
        } else if (total >= 300) {
            descuento = 0.15;
        } else if (total >= 200) {
            descuento = 0.10;
        }

        double totalConDescuento = total * (1 - descuento);

        System.out.printf("El valor total de la compra es: $%.2f%n", total);
        if (descuento > 0) {
            System.out.printf("Se aplicó un descuento de %.0f%%. El total con descuento es: $%.2f%n", descuento * 100, totalConDescuento);
        } else {
            System.out.println("No se aplica descuento.");
        }

        scanner.close();
    }
}
