public class Ejercicio4 {

    public static int[][] tablaDeMultiplicar(int n) {
        int[][] tablas = new int[n][10];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i - 1][j] = i * j;
            }
        }
        return tablas;
    }

    public static void imprimirTablas(int[][] tablas) {
        for (int i = 0; i < tablas.length; i++) {
            System.out.println("Tabla de multiplicar del " + (i + 1) + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println((i + 1) + " x " + j + " = " + tablas[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] tablasMultiplicar = tablaDeMultiplicar(n);
        imprimirTablas(tablasMultiplicar);
    }
}


