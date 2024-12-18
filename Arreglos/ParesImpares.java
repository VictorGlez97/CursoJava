package Arreglos;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        
        try {
            
            int[] a, pares, impares;
            int totalPares = 0, totalImpares = 0;

            a = new int[10];
            Scanner s = new Scanner(System.in);

            System.out.println("Ingresa 10 números: ");
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }

            for (int i = 0; i < a.length; i++) {
                if (a[i]%2 == 0) {
                    totalPares++;
                } else {
                    totalImpares++;
                }
            }

            pares = new int[totalPares];
            impares = new int[totalImpares];

            int auxPares = 0, auxImpares = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i]%2 == 0) {
                    pares[auxPares] = a[i];
                    auxPares++;
                } else {
                    impares[auxImpares] = a[i];
                    auxImpares++;
                }
            }

            System.out.println("");
            System.out.println("-- PARES --");
            for (int i = 0; i < pares.length; i++) {
                System.out.print(pares[i] + " ");
            }

            System.out.println("");
            System.out.println("-- IMPARES --");
            for (int i = 0; i < impares.length; i++) {
                System.out.print(impares[i] + " ");
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
}
