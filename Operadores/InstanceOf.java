package Operadores;

public class InstanceOf {
    public static void main(String[] args) {
        
        String texto = new String("Creando un objeto de la clase String ... que tal!");

        Integer num = 7;

        boolean b1 = texto instanceof String;

        System.out.println("texto es del tipo string: " + b1);

    }
}
