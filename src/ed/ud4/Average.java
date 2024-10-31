/**
 *  Esta clase debe realizar las siguientes operaciones
    a. Obtiene un número entero aleatorio entre 0 y 19 ambos incluidos
    b. Genera tantos números aleatorios entre 1 y 50, ambos incluidos, como se
    obtengan en el punto a.
    c. El programa debe mostrar la suma total de los números obtenidos.
 */

package ed.ud4;

import java.util.Random;

public class Average {
    public static void main(String[] args) {
        Random aleatorio = new Random(System.currentTimeMillis());
        int contar = aleatorio.nextInt(20);
        int total = 0;
        for (int i = 0; i < contar; i++) {
            int num = aleatorio.nextInt(100) + 1;
            total += num;
            System.out.println(num + " ");
        } 
        System.out.println();
        System.out.println("Total: "+ total);
        // calcular la media aritmetica
        // Cambiamos el calculo de (double) a (int), parseamos el resultado
        double media = (double) total / (double) contar;
        System.out.println("Media de los numeros: " + media);
    }
}