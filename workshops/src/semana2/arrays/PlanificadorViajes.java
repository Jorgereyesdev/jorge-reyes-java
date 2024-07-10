package semana2.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class PlanificadorViajes {
    private static final int[] DISTANCIAS_FICTICIAS = {50, 60, 70, 80, 90};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n--- Planificador de Viajes ---");
            System.out.println("1. Añadir ciudad");
            System.out.println("2. Remover ciudad");
            System.out.println("3. Mostrar lista de ciudades");
            System.out.println("4. Calcular distancia total (opcional)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    añadirCiudad(ciudades, scanner);
                    break;
                case 2:
                    removerCiudad(ciudades, scanner);
                    break;
                case 3:
                    mostrarCiudades(ciudades);
                    break;
                case 4:
                    calcularDistanciaTotal(ciudades);
                    break;
                case 5:
                    System.out.println("Gracias por usar el Planificador de Viajes.");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void añadirCiudad(ArrayList<String> ciudades, Scanner scanner) {
        System.out.print("Ingrese el nombre de la ciudad: ");
        String ciudad = scanner.nextLine();
        ciudades.add(ciudad);
        System.out.println("Ciudad añadida exitosamente.");
    }

    private static void removerCiudad(ArrayList<String> ciudades, Scanner scanner) {
        System.out.print("Ingrese el nombre de la ciudad a remover: ");
        String ciudad = scanner.nextLine();
        if (ciudades.remove(ciudad)) {
            System.out.println("Ciudad removida exitosamente.");
        } else {
            System.out.println("La ciudad no se encuentra en el itinerario.");
        }
    }

    private static void mostrarCiudades(ArrayList<String> ciudades) {
        System.out.println("\nLista de ciudades a visitar:");
        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }

    private static void calcularDistanciaTotal(ArrayList<String> ciudades) {
        if (ciudades.size() < 2) {
            System.out.println("No hay suficientes ciudades para calcular la distancia total.");
            return;
        }

        int distanciaTotal = 0;
        for (int i = 0; i < ciudades.size() - 1; i++) {
            distanciaTotal += DISTANCIAS_FICTICIAS[i % DISTANCIAS_FICTICIAS.length];
        }

        System.out.println("La distancia total del viaje es: " + distanciaTotal + " km");
    }
}
