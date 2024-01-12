package ejercicios;

public class Bucles {
    public static void main(String[] args) {
        //bucle for
        System.out.println("Bucle for:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //utilizando bucle while
        System.out.println("Bucle while:");
        int j = 1;
        while (j <= 20) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        //utilizando bucle do-while
        System.out.println("Bucle do-while:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 20);
        System.out.println();
    }
}