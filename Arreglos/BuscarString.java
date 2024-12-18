package Arreglos;

import java.util.Scanner;

public class BuscarString {
    public static void main(String[] args) {
        
        String[] a = new String[4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese una cadena");
            a[i] = s.next();
        }

        System.out.println("\r\n Ingrese una cadena a buscar: ");
        String cadena = s.next();
        int i = 0;

        for (; i < a.length && !a[i].equalsIgnoreCase(cadena); i++) {}

        if (i == a.length) {
            System.out.println("Numero no encontrado");
        } else if (a[i].toLowerCase().compareTo(cadena.toLowerCase()) == 0) {
            System.out.println("Encontrado en la posicion " + i);
        }

        System.out.println("\n Desea buscar otra cadena: ");

        if (s.next().toLowerCase() == "si") {
            main(args);
        } else {
            System.exit(0);
        }

    }
}
