package semana2.tallercarrosymotos;

import java.util.ArrayList;
import java.util.Scanner;

public class TallerMotosCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la capacidad máxima del taller y el numero de trabajos a registrar
        System.out.print("Ingrese la cantidad de empleados del taller: ");
        int maxEmployees = scanner.nextInt();
        System.out.print("Ingrese el numero de trabajos a registrar: ");
        int numTrabajos = scanner.nextInt();
        scanner.nextLine();

        // Asegurarse de que no se supere la capacidad maxima
        if (numTrabajos > maxEmployees) {
            System.out.println("El numero de trabajos no puede superar la capacidad maxima.");
            return;
        }

        // Estructura de datos
        String[][][] trabajos = new String[maxEmployees][2][4];
        ArrayList<String> empleados = new ArrayList<>();

        // Solicitar la informacion de cada vehiculo y almacenar los datos en el array tridimensional
        for (int i = 0; i < numTrabajos; i++) {
            System.out.println("Ingrese la informacion para el trabajo #" + (i + 1));

            System.out.print("Ingrese el nombre del empleado: ");
            String empleado = scanner.nextLine();
            empleados.add(empleado);

            System.out.print("Ingrese el tipo de vehiculo (0 para Moto, 1 para Carro): ");
            int tipoVehiculo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese la marca: ");
            trabajos[i][tipoVehiculo][0] = scanner.nextLine();

            System.out.print("Ingrese el modelo: ");
            trabajos[i][tipoVehiculo][1] = scanner.nextLine();

            System.out.print("Ingrese el año: ");
            trabajos[i][tipoVehiculo][2] = scanner.nextLine();

            System.out.print("Ingrese el estado (Pendiente, En reparación, Reparado): ");
            trabajos[i][tipoVehiculo][3] = scanner.nextLine();
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nOpciones:");
            System.out.println("1. Mostrar todos los vehículos");
            System.out.println("2. Contar y mostrar vehículos por estado");
            System.out.println("3. Buscar vehículo por marca y modelo");
            System.out.println("4. Actualizar información de un vehículo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Mostrar todos los vehículos en una tabla
                    System.out.println("\nAgenda de trabajos:");
                    System.out.println("| Tipo | Marca | Modelo | Año | Estado |");
                    System.out.println("|------|-------|--------|-----|--------|");
                    for (int i = 0; i < numTrabajos; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (trabajos[i][j][0] != null) {
                                String tipo = j == 0 ? "Moto" : "Carro";
                                System.out.printf("| %-4s | %-5s | %-6s | %-4s | %-8s |\n",
                                        tipo, trabajos[i][j][0], trabajos[i][j][1], trabajos[i][j][2], trabajos[i][j][3]);
                            }
                        }
                    }
                    break;
                case 2:
                    // Contar y mostrar cuántos vehículos hay en cada estado
                    int pendientes = 0, enReparacion = 0, reparados = 0;
                    for (int i = 0; i < numTrabajos; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (trabajos[i][j][0] != null) {
                                String estado = trabajos[i][j][3].toLowerCase();
                                if (estado.equals("pendiente")) {
                                    pendientes++;
                                } else if (estado.equals("en reparación")) {
                                    enReparacion++;
                                } else if (estado.equals("reparado")) {
                                    reparados++;
                                }
                            }
                        }
                    }
                    System.out.println("\nEstado de los vehículos:");
                    System.out.println("Pendientes: " + pendientes);
                    System.out.println("En reparación: " + enReparacion);
                    System.out.println("Reparados: " + reparados);
                    break;
                case 3:
                    // Permitir buscar un vehículo por su marca y modelo
                    System.out.print("\nIngrese la marca del vehículo a buscar: ");
                    String marcaBusqueda = scanner.nextLine();
                    System.out.print("Ingrese el modelo del vehículo a buscar: ");
                    String modeloBusqueda = scanner.nextLine();

                    boolean encontrado = false;
                    for (int i = 0; i < numTrabajos; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (trabajos[i][j][0] != null && trabajos[i][j][0].equalsIgnoreCase(marcaBusqueda) && trabajos[i][j][1].equalsIgnoreCase(modeloBusqueda)) {
                                encontrado = true;
                                String tipo = j == 0 ? "Moto" : "Carro";
                                System.out.printf("\nVehículo encontrado:\nTipo: %s\nMarca: %s\nModelo: %s\nAño: %s\nEstado: %s\n",
                                        tipo, trabajos[i][j][0], trabajos[i][j][1], trabajos[i][j][2], trabajos[i][j][3]);
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("\nNo se encontró el vehículo.");
                    }
                    break;
                case 4:
                    // Permitir actualizar la información de un vehículo específico
                    System.out.print("\nIngrese la marca del vehículo a actualizar: ");
                    marcaBusqueda = scanner.nextLine();
                    System.out.print("Ingrese el modelo del vehículo a actualizar: ");
                    modeloBusqueda = scanner.nextLine();

                    encontrado = false;
                    for (int i = 0; i < numTrabajos; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (trabajos[i][j][0] != null && trabajos[i][j][0].equalsIgnoreCase(marcaBusqueda) && trabajos[i][j][1].equalsIgnoreCase(modeloBusqueda)) {
                                System.out.print("Ingrese el nuevo estado (Pendiente, En reparación, Reparado): ");
                                trabajos[i][j][3] = scanner.nextLine();
                                System.out.print("Ingrese la nueva marca: ");
                                trabajos[i][j][0] = scanner.nextLine();
                                System.out.print("Ingrese el nuevo modelo: ");
                                trabajos[i][j][1] = scanner.nextLine();
                                System.out.print("Ingrese el nuevo año: ");
                                trabajos[i][j][2] = scanner.nextLine();
                                encontrado = true;
                                System.out.println("Información actualizada con éxito.");
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró el vehículo para actualizar.");
                    }
                    break;
                case 5:
                    // Salir del ciclo y terminar el programa
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}
