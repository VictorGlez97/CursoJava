public class StringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Victor";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase() );

        System.out.println("nombre.equals(\"Victor\") = " + nombre.equals("Victor"));
        System.out.println("nombre.equals(\"victor\") = " + nombre.equals("victor"));

        System.out.println("nombre.compareTo(\"Victor\") = " + nombre.compareTo("Victor"));
        System.out.println("nombre.compareTo(\"victor\") = " + nombre.compareTo("victor"));

        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));

    }
}
