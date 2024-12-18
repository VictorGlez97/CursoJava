package System;

import java.util.Map;

public class VariablesEntorno {
    public static void main(String[] args) {
        
        Map<String, String> varEnv = System.getenv();
        // System.out.println("Variable de ambiente del sistema = " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        System.out.println("------------------------- Listando variables de entorno del sistema ----------------");
        for (String key : varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

    }
}
