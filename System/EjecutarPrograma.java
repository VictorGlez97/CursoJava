package System;

import java.io.IOException;

public class EjecutarPrograma {
    public static void main(String[] args) {
        
        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = rt.exec("textedit");
            } else if (System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("textedit");
            } else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        } catch (Exception e) {
            // e.printStackTrace();
            System.err.println("El comando s desconocido: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor");
        System.exit(0);

    }
}
