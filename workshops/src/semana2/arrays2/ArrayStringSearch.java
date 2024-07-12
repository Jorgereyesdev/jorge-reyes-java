package semana2.arrays2;

import java.util.Scanner;

public class ArrayStringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Elena"};

        System.out.print("Ingrese un nombre para buscar: ");
        String nombreBuscado = scanner.nextLine();

        String nombreBuscadoMinusculas = nombreBuscado.toLowerCase();

        boolean encontrado = false;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].toLowerCase().equals(nombreBuscadoMinusculas)) {
                encontrado = true;
                System.out.printf("Nombre encontrado en la posicion: %d%n", i);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nombre no encontrado en el array.");
        }

        scanner.close();
    }
}
