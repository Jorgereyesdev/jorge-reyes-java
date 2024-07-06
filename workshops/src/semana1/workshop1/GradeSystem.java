package semana1.workshop1;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación del examen (0-100): ");
        int calificacion = scanner.nextInt();

        char letra;

        if (calificacion >= 90 && calificacion <= 100) {
            letra = 'A';
        } else if (calificacion >= 80 && calificacion < 90) {
            letra = 'B';
        } else if (calificacion >= 70 && calificacion < 80) {
            letra = 'C';
        } else if (calificacion >= 60 && calificacion < 70) {
            letra = 'D';
        } else if (calificacion >= 0 && calificacion < 60) {
            letra = 'F';
        } else {
            System.out.println("Calificación inválida. Debe estar en el rango de 0 a 100.");
            scanner.close();
            return;
        }

        System.out.println("La calificación " + calificacion + " equivale a: " + letra);

        scanner.close();
    }
}
