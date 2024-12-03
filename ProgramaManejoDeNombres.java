import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        try {
            
            for (int i = 0; i < 3; i++) {
                
                System.out.println("Agrega nombre de un amigo o familiar:");
                String nombre = scanner.nextLine();
                sb.append(
                    nombre.substring(1, 2)
                    .toUpperCase()
                    .concat(".es")
                );

                if (i <= 1) {
                    sb.append("_");
                }
            }

            System.out.println(sb);

        } catch (Exception e) {
            System.out.println("Error al querer grabar los nombre");
            main(args);
            System.exit(0);
        }
    }
}
