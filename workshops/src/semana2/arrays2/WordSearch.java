package semana2.arrays2;

import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto:");
        String texto = scanner.nextLine();

        System.out.println("Ingrese la palabra a buscar:");
        String palabra = scanner.nextLine();

        String textoMinusculas = texto.toLowerCase();
        String palabraMinusculas = palabra.toLowerCase();

        int index = textoMinusculas.indexOf(palabraMinusculas);
        boolean found = false;

        while (index != -1) {
            found = true;
            System.out.printf("Palabra encontrada en el rango: [%d, %d]%n", index, index + palabra.length() - 1);
            index = textoMinusculas.indexOf(palabraMinusculas, index + 1);
        }

        if (!found) {
            System.out.println("La palabra no se encontró en el texto.");
        }

        scanner.close();
    }
}
