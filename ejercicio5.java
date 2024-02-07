import java.util.Scanner;

public class ejercicio5 {

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] primerosNPrimos(int n) {
        int[] primos = new int[n];
        int contador = 0;
        int numero = 2;
        while (contador < n) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }
        return primos;
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números primos que desea obtener: ");
        int n = scanner.nextInt();
        scanner.close();

        int[] primerosPrimos = primerosNPrimos(n);
        System.out.println("Los primeros " + n + " números primos son:");
        imprimirArray(primerosPrimos);
    }
}
