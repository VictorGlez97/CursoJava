package LineaComando;

public class ArgsLineaComando {
    public static void main(String[] args) {
        
        try {
            
            if (args.length == 0) {
                System.exit(-1);
            }
    
            for (int i = 0; i < args.length; i++) {
                System.out.println("Arg n° " + i + ": " + args[i]);
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
