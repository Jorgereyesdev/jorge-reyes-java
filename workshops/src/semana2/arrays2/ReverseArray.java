package semana2.arrays2;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        int[] reversedArray = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            reversedArray[i] = array[n - 1 - i];
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
