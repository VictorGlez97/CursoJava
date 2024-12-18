package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class CalculaEdad {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la fecha de tu nacimiento: ");
        Date fechaActual = new Date();

        int aniosActuales = 0;

        try {
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaNacimiento = formato.parse(scanner.next());

            if (fechaNacimiento.compareTo(fechaActual) > 0) {
                System.out.println("Error: no se puede calcular la edad, porque la fecha es mas grande que el día actual");
                return;
            } else if (fechaNacimiento.compareTo(fechaActual) == 0) {
                System.out.println("Tiene 0 anios");
                return;
            }

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaNacimiento);
            int anio = calendar.get(Calendar.YEAR);
            int mes = calendar.get(Calendar.MONTH);
            System.out.println("mes: " + mes);

            Calendar calendarActual = Calendar.getInstance();
            calendarActual.setTime(fechaActual);
            int anioActual = calendarActual.get(Calendar.YEAR);
            int mesActual = calendarActual.get(Calendar.MONTH);

            aniosActuales = anioActual - anio;

            if (mesActual < mes) {
                aniosActuales--;
            } else if ( mes == mesActual ) {               
                int dia = calendar.get(Calendar.DAY_OF_MONTH);
                int diaActual = calendarActual.get(Calendar.DAY_OF_MONTH);

                if ( diaActual < dia ) {
                    aniosActuales--;
                }
            }

            System.out.println("Tiene " + aniosActuales + " años");

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            main(args);
            System.exit(0);
        }

    }
}
