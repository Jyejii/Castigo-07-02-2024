import java.util.Scanner;

public class Ejercicio8 {

    public static int[] recibirNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese números enteros. Ingrese 0 para terminar:");

        int[] numeros = new int[100]; // Tamaño inicial arbitrario
        int contador = 0;
        int numero;

        do {
            numero = scanner.nextInt();
            numeros[contador] = numero;
            contador++;
        } while (numero != 0);

        // Redimensionar el array para eliminar el 0 al final
        int[] resultado = new int[contador - 1];
        System.arraycopy(numeros, 0, resultado, 0, contador - 1);

        return resultado;
    }

    // Función para calcular la media de los elementos de un array
    public static double calcularMedia(int[] array) {
        double suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma / array.length;
    }

    // Función para calcular el mínimo de los elementos de un array
    public static int calcularMinimo(int[] array) {
        int minimo = array[0];
        for (int num : array) {
            if (num < minimo) {
                minimo = num;
            }
        }
        return minimo;
    }

    // Función para calcular el máximo de los elementos de un array
    public static int calcularMaximo(int[] array) {
        int maximo = array[0];
        for (int num : array) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }

    public static void main(String[] args) {
        int[] numeros = recibirNumeros();

        if (numeros.length == 0) {
            System.out.println("No se ingresaron números.");
            return;
        }

        double media = calcularMedia(numeros);
        int minimo = calcularMinimo(numeros);
        int maximo = calcularMaximo(numeros);

        System.out.println("Media: " + media);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
    }
}


