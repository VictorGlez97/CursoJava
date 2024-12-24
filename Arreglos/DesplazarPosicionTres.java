package Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class DesplazarPosicionTres {
    public static void main(String[] args) {
        
        int[] numeros = { 15, 17, 19, 21, 23, 25, 27, 0 };
        int numero, posicion;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        numero = s.nextInt();

        Arrays.sort(numeros);

        posicion = 0;
        while (posicion < 6 && numero > numeros[posicion]) {
            posicion++;
        }

        System.out.println("\nPosicion: " + posicion);

        System.out.println("\nNumeros:");
        for (int i : numeros) {
            System.out.println(i);
        }
 
    }
}
