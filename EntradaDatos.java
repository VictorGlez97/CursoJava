import javax.swing.JOptionPane;

public class EntradaDatos {
    public static void main(String[] args){
        
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero");
        
        try {
            int numeroDecimal = Integer.parseInt(numeroStr);
            System.out.println("numeroDecimal = " + numeroDecimal);
    
            String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            mensaje += "\n numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            mensaje += "\n numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
            JOptionPane.showMessageDialog(null, mensaje);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número");
            System.out.println(e);
            main(args);
            System.exit(0);
        }

    }
}