package Arreglos;

import java.util.Scanner;

public class BuscarNumeros {
    public static void main(String[] args) {
        
        // int[] a = new int[10];
        int[] a = {5, 10, 25, 75, 3, 52, 874, 8, 74, 3};

        Scanner s = new Scanner(System.in);

        // for (int i = 0; i < a.length; i++) {
        //     System.out.println("Ingrese un numero");
        //     a[i] = s.nextInt();
        // }

        System.out.println("\r\n Ingrese un nuemro a buscar: ");
        int num = s.nextInt();
        int i = 0;

        while (i < a.length && a[i] != num) {
            i++;
        }

        if (i == a.length) {
            System.out.println("Numero no encontrado");
        } else {
            System.out.println("Encontrado en la posicion " + i);
        }

    }
}
