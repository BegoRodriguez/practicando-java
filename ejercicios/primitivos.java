package ejercicios;
public class primitivos {
    public static void main(String[] args){

    
            int i = Integer.MIN_VALUE;
            int j = i - 1;  // Cuando un entero se desborda, vuelve al valor mínimo y comienza a contar desde allí.
            System.out.println("Valor maximo entero: " + i + " Operación desbordada " + j); // La variable 'j' volverá a -2147483648
            
            double d = Double.MIN_VALUE;
            double o = d - 1; // Los números en coma flotante se desbordan devolviendo el valor máximo
            System.out.println("Valor maximo double: " + d + " Operación desbordada " + o);  // La variable 'o' será el valor máximo
    }
}