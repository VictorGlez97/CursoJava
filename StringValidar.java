public class StringValidar {
    public static void main(String[] args) {
        
        String curso = null;

        boolean esNulo = curso == null; 

        if ( esNulo ) {
            curso = "";
        }

        boolean esVacio = curso.length() == 0;
        System.out.println(curso.toUpperCase());
        System.out.println("Bienvenidos al curso ".concat(curso));

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2: " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco: " + esBlanco);

        if ( !esBlanco ) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenidos al curso ".concat(curso));
        }

    }
}
