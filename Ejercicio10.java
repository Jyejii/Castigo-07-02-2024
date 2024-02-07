import java.util.Random;
import java.util.Scanner;
//Matriz simetrica
public class Ejercicio10 {


    public static void generarMatrizSimetrica(int dimension) {
        int[][] matriz = new int[dimension][dimension];
        Random random = new Random();

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = random.nextInt(100) + 1; // Números aleatorios entre 1 y 100
            }
        }
        for (int i = 0; i < dimension; i++) {
            for (int j = i + 1; j < dimension; j++) {
                matriz[i][j] = matriz[j][i];
            }
        }

        System.out.println("Matriz simétrica generada:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la dimensión de la matriz cuadrada: ");
        int dimension = scanner.nextInt();
        generarMatrizSimetrica(dimension);
        scanner.close();
    }
}

