package Wrapper;

import java.lang.reflect.Method;

public class WClass {
    public static void main(String[] args) {
        
        String texto = "Hola soy vic!";

        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass);

        for (Method metodo: strClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }

    }
}
