import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.println("Ingrese nombre de la factura: ");
            String nombreFactura = scanner.nextLine();
    
            System.out.println("Precio de producto 1: ");
            Double precioUno = scanner.nextDouble();
    
            System.out.println("Preco de producto 2: ");
            Double precioDos = scanner.nextDouble();

            Double total = precioUno + precioDos;
    
            System.out.println("\n\nPrecio: " + total);
            System.out.println("Impuestos: " + (total * .19));
            System.out.println("Precio neto: " + (total + (total * .19)));

        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero");
            // System.out.println(e);
            main(args);
            System.exit(0);
        }
    }
}
