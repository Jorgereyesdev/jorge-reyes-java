package semana2.arrays;

import java.util.Scanner;

public class BuscadorMayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Por favor, ingrese 5 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        scanner.close();
    }
}
