import java.util.Scanner;
//escalar de dos vectores
public class Ejercicio9 {

    public static int[] ingresarVector(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[n];
        System.out.println("Ingrese los elementos del vector de tamaño " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    public static int productoEscalar(int[] vector1, int[] vector2) {
        int producto = 0;
        for (int i = 0; i < vector1.length; i++) {
            producto += vector1[i] * vector2[i];
        }
        return producto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la dimensión de los vectores: ");
        int n = scanner.nextInt();
        int[] vector1 = ingresarVector(n);
        int[] vector2 = ingresarVector(n);
        int producto = productoEscalar(vector1, vector2);

        System.out.println("El producto escalar de los vectores es: " + producto);

        scanner.close();
    }
}
