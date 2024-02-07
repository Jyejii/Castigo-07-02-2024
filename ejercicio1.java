import java.util.Scanner;
public class ejercicio1{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese el numero de años:");
        int anos=scanner.nextInt();
        long SegundosTotal=calcularSengundosEnAnos(anos);

        System.out.println("el numero de segundos en "+anos+"años es:"+SegundosTotal);
    }
//Funcion realizado para pasar de años a segundos,con todos los valores definidos
    public static long calcularSengundosEnAnos(int anos){
        int diasEnAnos=anos*365;
        int horasEnDias=24;
        int minutosEnHoras=60;
        int segundosEnMinutos=60;
        long segundosEnAnos= diasEnAnos*horasEnDias*minutosEnHoras*segundosEnMinutos;
        return segundosEnAnos;
    }
}

