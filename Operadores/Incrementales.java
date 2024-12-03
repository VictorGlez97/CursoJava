package Operadores;

public class Incrementales {
    public static void main(String[] args) {
        
        // PRE INCREMENTO
        int i = 1;
        int j = ++i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // POST INCREMENTO
        i = 2;
        System.out.println("INICIAL DE i = " + i);

        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);


    }
}