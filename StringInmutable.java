public class StringInmutable {
    public static void main(String[] args) {
        
        String curso = "Programacion Java";
        String profesor = "Andres";

        curso.concat(profesor);

        System.out.println("curso : " + curso);

        String resultado = curso.transform(c -> {
            return c + " con " + profesor;
        });

        System.out.println( resultado );

        resultado.replace("a", "A");

        System.out.println( resultado );

    }
}
