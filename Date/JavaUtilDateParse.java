package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
        try {
            
            // Date fecha = format.parse("2020-01-25");
            // Date fecha = format.parse("hola");
            Date fecha = format.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            if (fecha.after(fecha2)) {
                System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
            } else if (fecha.before(fecha2)) {
                System.out.println("fecha es anterior que fecha2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha es igual a fecha2");
            }

            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("fecha es anterior que fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("fecha es igual a fecha2");
            }

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            main(args);
            System.exit(0);
        }

    }
}
