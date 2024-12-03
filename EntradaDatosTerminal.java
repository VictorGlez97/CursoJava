import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatosTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        // String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        } catch (InputMismatchException e) {
            System.out.println("Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nnumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        System.out.println(mensaje);

    }
}