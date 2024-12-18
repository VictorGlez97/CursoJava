package Arreglos;

import java.util.Arrays;

public class Ejemplo {
    public static void main(String[] args) {
        
        String[] productos = new String[7];
        
        productos[0] = "Kingston";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro";
        productos[3] = "Producto 3";
        productos[4] = "Producto 4";
        productos[5] = "Producto 5";
        productos[6] = "Producto 6";

        Arrays.sort(productos);

        System.out.println(" Usando for ");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("producto[" + i + "] = " + productos[i]); 
        }

        System.out.println("Usando foreach");
        for (String prod : productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("Usando while");
        int i = 0;
        while (i < productos.length) {
            System.out.println("para indice " + i + ": " + productos[i]);
            i++;
        }

        System.out.println("Usando do while");
        i = 0;
        do {
            System.out.println("para indice " + i + ": " + productos[i]);
            i++;
        } while (i < productos.length);

        System.out.println(" Usando for inverso");
        for (int j = productos.length - 1; j >= 0; j--) {
            System.out.println("producto[" + j + "] = " + productos[j]); 
        }

        // System.out.println("producto[0] = " + productos[0]);
        // System.out.println("producto[1] = " + productos[1]);
        // System.out.println("producto[2] = " + productos[2]);
        // System.out.println("producto[3] = " + productos[3]);
        // System.out.println("producto[4] = " + productos[4]);
        // System.out.println("producto[5] = " + productos[5]);
        // System.out.println("producto[6] = " + productos[6]);

        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = 50;
        numeros[2] = 5;
        numeros[3] = 15;

        Arrays.sort(numeros);

        System.out.println("numeros[0] = " + numeros[0]);
        System.out.println("numeros[1] = " + numeros[1]);
        System.out.println("numeros[2] = " + numeros[2]);
        System.out.println("numeros[3] = " + numeros[3]);

    }
}
