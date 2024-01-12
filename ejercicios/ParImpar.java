package ejercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca un número entero
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Comprobar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
