package Arreglos;

import java.util.Scanner;

public class DesplazarPosicion {
    public static void main(String[] args) {
        
        // int[] a = new int[10];
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        Scanner s = new Scanner(System.in);

        int ultimo = a[a.length-1];
        for (int i = a.length - 2; i > a.length; i--) {
            System.out.println("a = " + i);
            a[i] = a[i-1];
        }
        a[0] = ultimo;

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

    }
}
