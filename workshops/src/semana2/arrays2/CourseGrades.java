package semana2.arrays2;

import java.util.Scanner;

public class CourseGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_NOTAS = 8;
        final double PROMEDIO_MINIMO = 76.0;

        System.out.print("Ingrese la cantidad de calificaciones (de 0 a 7): ");
        int cantidadNotasObtenidas = scanner.nextInt();

        if (cantidadNotasObtenidas < 0 || cantidadNotasObtenidas >= TOTAL_NOTAS) {
            System.out.println("Cantidad de calificaciones inválida. Debe estar entre 0 y 7.");
            scanner.close();
            return;
        }

        double[] notasObtenidas = new double[cantidadNotasObtenidas];
        double sumaNotasObtenidas = 0.0;

        for (int i = 0; i < cantidadNotasObtenidas; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + " (de 0 a 100): ");
            notasObtenidas[i] = scanner.nextDouble();

            if (notasObtenidas[i] < 0 || notasObtenidas[i] > 100) {
                System.out.println("Calificación inválida. Debe estar entre 0 y 100.");
                scanner.close();
                return;
            }

            sumaNotasObtenidas += notasObtenidas[i];
        }

        int cantidadNotasFaltantes = TOTAL_NOTAS - cantidadNotasObtenidas;

        double sumaTotalNecesaria = PROMEDIO_MINIMO * TOTAL_NOTAS;

        double sumaNotasFaltantesNecesaria = sumaTotalNecesaria - sumaNotasObtenidas;

        double promedioNotasFaltantesNecesario = sumaNotasFaltantesNecesaria / cantidadNotasFaltantes;

        if (promedioNotasFaltantesNecesario > 100) {
            System.out.println("No es posible aprobar el curso con las notas faltantes.");
        } else {
            System.out.printf("Necesitas un promedio de %.2f en las %d notas faltantes para aprobar el curso.%n",
                    promedioNotasFaltantesNecesario, cantidadNotasFaltantes);
        }

        scanner.close();
    }
}
