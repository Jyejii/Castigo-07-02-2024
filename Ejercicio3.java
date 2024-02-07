import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Introduce números enteros positivos (introduce un número negativo para terminar):");

        while (true) {
            int numero = sc.nextInt();

            if (numero < 0)
                break;

            if (numero < min)
                min = numero;

            if (numero > max)
                max = numero;
        }

        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            System.out.println("No se introdujeron números.");
        } else {
            System.out.println("El mínimo de la lista es: " + min);
            System.out.println("El máximo de la lista es: " + max);
        }
    }
}
