package Operadores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Estanque {
    public static void main(String[] args) {
        
        try {
            
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese los litros del estanque: ");
            Double litros = scanner.nextDouble();

            String estanque = new String("");

            estanque = litros >= 70 ? "Estanque lleno" : estanque + "";
            estanque = litros >= 60 && litros < 70 ? "Estanque casi lleno" : estanque + "";
            estanque = litros >= 40 && litros < 60 ? "Estanque 3/4" : estanque + "";
            estanque = litros >= 35 && litros < 40 ? "Medio estanque" : estanque + "";
            estanque = litros >= 20 && litros < 35 ? "Suficiente" : estanque + "";
            estanque = litros >= 1 && litros < 20 ? "Insuficiente" : estanque + "";

            System.out.println(estanque);

        } catch (InputMismatchException e) {
            System.out.println("Ingrese unicamente numeros");
            main(args);
            System.exit(0);
        }

    }
}
