public class StringMetodosArreglo {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();

        int largo = arreglo.length;

        for (int i = 0; i < largo; i++) {
            // System.out.println("arreglo = " + arreglo[i]);
            System.out.print(arreglo[i]);
        }

        System.out.println("\ntrabalenguas " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");

        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println(arreglo2[i]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("[.]");

        for (int i = 0; i < archivoArr.length; i++) {
            System.out.println(archivoArr[i]);
        }

    }
}