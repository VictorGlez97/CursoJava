public class EjemploString {
    public static void main(String[] args) {

        String curso = "Programación java";
        String curso2 = new String("programación java");

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2: " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2): " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2): " + esIgual);

    }
}
