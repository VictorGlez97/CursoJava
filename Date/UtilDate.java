package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDate {
    public static void main(String[] args) {
        
        Date fecha = new Date();

        System.out.println( fecha );

        // SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        String fechaStr = df.format(fecha);
        System.out.println(fechaStr);

        long j = 0;
        for (int i = 0; i < 10000000; i++) {
            j += i;
        }

        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en el for = " + tiempoFinal);

    }
}
