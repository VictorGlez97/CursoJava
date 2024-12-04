package ValorRef;

class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorValor2 {
    public static void main(String[] args) {
        
        // -- CON REFERENCIA
        // int[] edad = {10, 11, 12};
        
        // for (int j = 0; j < edad.length; j++) {
        //     System.out.println("edad[i] = " + edad[j]);
        // }
        
        // System.out.println("Antes de llamar el método test2");
        // test2(edad);
        // System.out.println("Despues de llamar el método test2");
        
        // for (int j = 0; j < edad.length; j++) {
        //     System.out.println("edad[i] = " + edad[j]);
        // }
                
        // -- SIN REFERENCIA
        // int i = 10;
        // System.out.println("Iniciamos el método main con i = " + i);
        // test(i);
        // System.out.println("Finaliza el método con el valor de i = " + i);

        Persona persona = new Persona();
        persona.modificarNombre("Victor");
        System.out.println("persona = " + persona.leerNombre());
        
        test(persona);
        System.out.println("persona = " + persona.leerNombre());
        
    }

    // public static void test(int i){
    //     System.out.println("Iniciamos el método test con i = " + i);
    //     i = 35; 
    //     System.out.println("Finaliza el método test con i = " + i);
    // }

    public static void test2(int[] edadArr){
        System.out.println("Iniciamos el método test2");
        for (int j = 0; j < edadArr.length; j++) {
            edadArr[j] = edadArr[j] + 20; 
        }
        System.out.println("Finaliza el método test2");
    }

    public static void test(Persona persona){
        persona.modificarNombre("Hugo");
    }
}
