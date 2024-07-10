package semana2.arrays;

import java.util.Scanner;

public class SistemaReservasTeatro {
    private static final int FILAS = 5;
    private static final int ASIENTOS_POR_FILA = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] asientos = new boolean[FILAS][ASIENTOS_POR_FILA];

        int opcion;

        do {
            System.out.println("\n--- Sistema de Reservas de Teatro ---");
            System.out.println("1. Mostrar asientos");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Mostrar total de asientos ocupados y disponibles");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarAsientos(asientos);
                    break;
                case 2:
                    reservarAsiento(asientos, scanner);
                    break;
                case 3:
                    cancelarReserva(asientos, scanner);
                    break;
                case 4:
                    contabilizarAsientos(asientos);
                    break;
                case 5:
                    System.out.println("Gracias por usar el Sistema de Reservas de Teatro.");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void mostrarAsientos(boolean[][] asientos) {
        System.out.println("\nEstado actual de los asientos:");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < ASIENTOS_POR_FILA; j++) {
                if (asientos[i][j]) {
                    System.out.print("[X] "); // Ocupado
                } else {
                    System.out.print("[ ] "); // Disponible
                }
            }
            System.out.println();
        }
    }

    private static void reservarAsiento(boolean[][] asientos, Scanner scanner) {
        System.out.print("Ingrese el número de fila (1-5): ");
        int fila = scanner.nextInt() - 1;
        System.out.print("Ingrese el número de asiento (1-10): ");
        int asiento = scanner.nextInt() - 1;

        if (fila < 0 || fila >= FILAS || asiento < 0 || asiento >= ASIENTOS_POR_FILA) {
            System.out.println("Número de fila o asiento inválido.");
        } else if (asientos[fila][asiento]) {
            System.out.println("El asiento ya está reservado.");
        } else {
            asientos[fila][asiento] = true;
            System.out.println("Asiento reservado exitosamente.");
        }
    }

    private static void cancelarReserva(boolean[][] asientos, Scanner scanner) {
        System.out.print("Ingrese el número de fila (1-5): ");
        int fila = scanner.nextInt() - 1;
        System.out.print("Ingrese el número de asiento (1-10): ");
        int asiento = scanner.nextInt() - 1;

        if (fila < 0 || fila >= FILAS || asiento < 0 || asiento >= ASIENTOS_POR_FILA) {
            System.out.println("Número de fila o asiento inválido.");
        } else if (!asientos[fila][asiento]) {
            System.out.println("El asiento no está reservado.");
        } else {
            asientos[fila][asiento] = false;
            System.out.println("Reserva cancelada exitosamente.");
        }
    }

    private static void contabilizarAsientos(boolean[][] asientos) {
        int ocupados = 0;
        int disponibles = 0;

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < ASIENTOS_POR_FILA; j++) {
                if (asientos[i][j]) {
                    ocupados++;
                } else {
                    disponibles++;
                }
            }
        }

        System.out.println("Total de asientos ocupados: " + ocupados);
        System.out.println("Total de asientos disponibles: " + disponibles);
    }
}
