package Operadores;

import javax.swing.JOptionPane;

public class NombreMayor {
    public static void main(String[] args) {
        
        String nombreUno = JOptionPane.showInputDialog(null, "Ingrese el primer nombre:");
        String nombreDos = JOptionPane.showInputDialog(null, "Ingrese el segundo nombre:");
        String nombreTres = JOptionPane.showInputDialog(null, "Ingrese el tercer nombre:");

        String nombreMayor = new String();

        nombreMayor = nombreUno.split(" ")[0].length() > nombreDos.split(" ")[0].length() ? nombreUno : nombreDos;
        nombreMayor = nombreMayor.split(" ")[0].length() > nombreTres.split(" ")[0].length() ? nombreMayor : nombreTres;
        
        JOptionPane.showMessageDialog(null, nombreMayor + " tiene el nombre mas largo");

    }
}
