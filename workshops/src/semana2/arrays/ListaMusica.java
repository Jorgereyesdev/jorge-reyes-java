package semana2.arrays;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ListaMusica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();
        ListIterator<String> iterator = playlist.listIterator();

        int opcion;

        do {
            System.out.println("\n--- Lista de Reproducción Musical ---");
            System.out.println("1. Añadir canción");
            System.out.println("2. Remover canción");
            System.out.println("3. Mostrar canción actual y siguientes");
            System.out.println("4. Saltar a la siguiente canción");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    añadirCancion(playlist, scanner);
                    break;
                case 2:
                    removerCancion(playlist, scanner);
                    break;
                case 3:
                    mostrarCanciones(iterator);
                    break;
                case 4:
                    saltarSiguiente(iterator);
                    break;
                case 5:
                    System.out.println("Gracias por usar la Lista de Reproducción Musical.");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void añadirCancion(LinkedList<String> playlist, Scanner scanner) {
        System.out.print("Ingrese el nombre de la canción: ");
        String cancion = scanner.nextLine();
        playlist.add(cancion);
        System.out.println("Canción añadida exitosamente.");
    }

    private static void removerCancion(LinkedList<String> playlist, Scanner scanner) {
        System.out.print("Ingrese el nombre de la canción a remover: ");
        String cancion = scanner.nextLine();
        if (playlist.remove(cancion)) {
            System.out.println("Canción removida exitosamente.");
        } else {
            System.out.println("La canción no se encuentra en la lista de reproducción.");
        }
    }

    private static void mostrarCanciones(ListIterator<String> iterator) {
        System.out.println("\nCanción actual y siguientes:");
        if (!iterator.hasNext()) {
            System.out.println("No hay canciones en la lista de reproducción.");
            return;
        }

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Reset the iterator to the start of the list
        while (iterator.hasPrevious()) {
            iterator.previous();
        }
    }

    private static void saltarSiguiente(ListIterator<String> iterator) {
        if (!iterator.hasNext()) {
            System.out.println("No hay más canciones en la lista de reproducción.");
            return;
        }

        System.out.println("Saltando a la siguiente canción: " + iterator.next());

        if (!iterator.hasNext()) {
            System.out.println("Has llegado al final de la lista de reproducción.");
        }
    }
}
