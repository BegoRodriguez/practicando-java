package ejercicios;
import java.util.Scanner;

public class MayorEntreDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El mayor de los dos números es: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El mayor de los dos números es: " + numero2);
        } else {
            System.out.println("Los dos números son iguales.");
        }

        scanner.close();
    }
}