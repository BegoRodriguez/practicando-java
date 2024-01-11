import java.util.Scanner;

public class ejerciciomedia {

    public static void main(String[] args) {
        //Creamos una instancia de scanner

        Scanner sc = new Scanner(System.in);

        //Declaración de variable
        int num1;
        int num2;
        int suma;
        double media;

        //Solicitamos el primer número y la guardamos en una varible
        System.out.println("Introduce un número");
        num1 = sc.nextInt();

        //Solicitamos el primer número y la guardamos en una varible
        System.out.println("Introduce otro número");
        num2 = sc.nextInt();

        suma = num1 + num2;
        media = suma/2.0;
        
        //Mostramos la media por consola
        System.out.println("La media es: " + media);

        //Cerramos escanner
        sc.close();


    }
}
