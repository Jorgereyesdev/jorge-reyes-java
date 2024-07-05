package semana1.workshop1;

import java.util.Scanner;

public class AgeVerifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are young");
        }

        scanner.close();
    }
}
