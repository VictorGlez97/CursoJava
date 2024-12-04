package Operadores;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        
        // System.out.println(3d);

        // String[] usernames = new String[2];
        // String[] passwords = new String[2];

        // usernames[0] = "victor";
        // usernames[1] = "admin";

        // passwords[0] = "12345";
        // passwords[1] = "54321";

        String[] usernames = {"victor", "admin", "hugo"};
        String[] passwords = {"12345", "12345", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;

            // if (usernames[i].equals(u) && passwords[i].equals(p)) {
            //     esAutenticado = true;
            //     break;
            // }  
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :  "Username o Password incorrecto!";
        System.out.println(mensaje);

        // if (esAutenticado) {
        //     System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        // } else {
        //     System.out.println("Username o Password incorrecto!");
        //     System.out.println("Lo siento, requiere autenticación");
        // }

        // String username = "victor";
        // String password = "12345";

        // String username2 = "admin";
        // String password2 = "54321";

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Ingrese el username");
        // String u = scanner.next();

        // System.out.println("Ingrese el password");
        // String p = scanner.next();

        // boolean esAutenticado = false;

        // if ((username.equals(u) && password.equals(p)) || (username2.equals(u) && password2.equals(p))) {
        //     esAutenticado = true;
        // } else {
        //     System.out.println("Username o Password incorrecto!");
        // }

        // if (esAutenticado) {
        //     System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        // } else {
        //     System.out.println("Lo siento, requiere autenticación");
        // }

    }
}
