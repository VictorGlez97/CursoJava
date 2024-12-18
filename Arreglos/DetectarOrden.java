package Arreglos;

import java.util.Scanner;

public class DetectarOrden {
    public static void main(String[] args) {
        
        int[] a = new int[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        int aux = 0;
        boolean ordenado = true;
        for (int i = 0; i < a.length - 1; i++) {
            ordenado = a[i] > a[i+1] ? ordenado : false;
        }

    }
}
