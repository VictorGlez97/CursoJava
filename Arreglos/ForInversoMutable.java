package Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class ForInversoMutable {

    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;

        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
        }
    }

    public static void main(String[] args) {
        
        String[] productos = new String[7];
        
        productos[0] = "Kingston";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro";
        productos[3] = "Producto 3";
        productos[4] = "Producto 4";
        productos[5] = "Producto 5";
        productos[6] = "Producto 6";

        // Arrays.sort(productos);

        // for (int i = 0; i < productos.length/2; i++) {
        //     String actual = productos[i];
        //     String inverso = productos[productos.length-1-i];
        //     productos[i] = inverso;
        //     productos[productos.length-1-i] = actual;
        // }

        // arregloInverso(productos);

        // Arrays.sort(productos);
        // Collections.reverse(Arrays.asList(productos));

        int total = productos.length;
        int contador = 0;

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total -1 -i; j++) {
                if ( productos[j+1].compareTo(productos[j]) < 0 ) {
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("Contador = " + contador);

        System.out.println(" Usando for ");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("producto[" + i + "] = " + productos[i]); 
        }

    }
}
