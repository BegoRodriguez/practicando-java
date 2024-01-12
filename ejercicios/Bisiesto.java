package ejercicios;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        // objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // introduzca un año
        System.out.print("Introduce un año: ");
        int year = scanner.nextInt();

        //si el año es bisiesto o no
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }

        // Cerrar SC
        scanner.close();
    }
}
