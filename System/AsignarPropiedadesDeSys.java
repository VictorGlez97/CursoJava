package System;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesDeSys {
    public static void main(String[] args) {
        
        try {

            File verificaArchivo = new File("C:/Desarrollo/CursoJava/config.properties");

            if (!verificaArchivo.exists()) {
                System.out.println("El archivo no se encuentra en la ruta especificada");
            }

            FileInputStream archivo = new FileInputStream("C:/Desarrollo/CursoJava/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");

            System.setProperties(p);
            System.getProperties().list(System.out);

        } catch (Exception e) {
            // e.printStackTrace();
            System.err.println(e);
        }

    }
}
