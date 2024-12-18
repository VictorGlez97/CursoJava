package Arreglos;

import java.util.Scanner;

public class ArregloNumMayour {
    public static void main(String[] args) {
        
        try {
            
            int[] a = new int[5];
            Scanner s = new Scanner(System.in);
    
            System.out.println("Ingresa 5 enteros:");
    
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
    
            int max = 0;
            for (int i = 1; i < a.length; i++) {
                max = (a[max] > a[i]) ? max: i;
            }
            System.out.println("a = " + a[max]);
        
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            main(args);
            System.exit(0);
        }

    }
}
