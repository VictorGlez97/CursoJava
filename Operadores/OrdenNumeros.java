package Operadores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrdenNumeros {
    public static void main(String[] args) {
        
        try {
            
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Ingrese el primer numero: ");
            Integer numeroUno = scanner.nextInt();
    
            System.out.println("Ingrese el segundo numero: ");
            Integer numeroDos = scanner.nextInt();
    
            System.out.println(numeroUno > numeroDos ? "El número " + numeroUno + " es mayor al número " + numeroDos : "El número " + numeroDos + " es mayor al número " + numeroUno);
        
        } catch (InputMismatchException e) {
            System.out.println("Solo puede ingresar numeros");
            main(args);
            System.exit(0);
        }

    }
}
