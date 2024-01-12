package ejercicios;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Crear un objeto Scanner 
        Scanner scanner = new Scanner(System.in);

        // número entre 1 y 100
        System.out.print("Introduce un número entre 1 y 100: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 100) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numero % 3 == 0) {
                System.out.println("Fizz");
            } else if (numero % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(numero);
            }
        } else {
            System.out.println("Por favor, introduce un número entre 1 y 100.");
        }

        // Cerrar SC
        scanner.close();
    }
}