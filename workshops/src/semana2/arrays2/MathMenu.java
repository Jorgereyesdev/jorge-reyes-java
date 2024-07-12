package semana2.arrays2;

import java.util.Scanner;

public class MathMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Elija una opción (1-5): ");
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                flag = true;
                System.out.println("Saliendo del programa...");
                continue;
            }

            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();
            double resultado;

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.printf("Resultado: %.2f + %.2f = %.2f%n", num1, num2, resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.printf("Resultado: %.2f - %.2f = %.2f%n", num1, num2, resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.printf("Resultado: %.2f * %.2f = %.2f%n", num1, num2, resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.printf("Resultado: %.2f / %.2f = %.2f%n", num1, num2, resultado);
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }

        scanner.close();
    }
}
