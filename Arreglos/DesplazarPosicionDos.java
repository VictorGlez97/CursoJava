package Arreglos;

import java.util.Scanner;

public class DesplazarPosicionDos {
    public static void main(String[] args) {
        
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingresa el numero a agregar: ");
        int numero = s.nextInt();

        System.out.println("Ingresa la posicion que quieres cambiar: ");
        int posicion = s.nextInt();

        for (int i = numeros.length - 2; i >= posicion - 1; i--) {
            // System.out.println("i = " + i);
            numeros[i+1] = numeros[i];
        }

        numeros[posicion-1] = numero;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

    }
}
