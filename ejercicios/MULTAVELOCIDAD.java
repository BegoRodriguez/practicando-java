package ejercicios;
import java.util.Scanner;
public class MULTAVELOCIDAD {
public static void main(String[] args) {
        //  leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // ingrese un entero
        System.out.print("Ingrese la velocidad: ");
        int velocidad = scanner.nextInt();

        // velocidad es mayor que 120
        if (velocidad > 120) {
            //  velocidad es mayor que 120
            System.out.println("Multa por velocidad!");
        } else {
            // velocidad no es mayor que 120
            System.out.println("Velocidad permitida. No hay multa.");
        }

        scanner.close();
    }
}