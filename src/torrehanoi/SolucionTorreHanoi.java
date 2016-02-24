package torrehanoi;
import java.util.Scanner;

public class SolucionTorreHanoi {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresa el número de discos de la torre: ");
        int discos = dato.nextInt();
        TorreHanoi torre = new TorreHanoi (discos);
        torre.solucion();
    }
}    