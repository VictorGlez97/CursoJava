package ClaseMath;

import java.util.Random;

public class MathRandom {
    public static void main(String[] args) {
        
        String[] colores = {"Azul", "Amarillo", "Rojo", "Verde", "Blanco", "Negro"};

        double random = Math.random();
        System.out.println("random = " + random);

        random *= colores.length;
        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);
        System.out.println("Color: " + colores[(int)random]);

        // random = Math.ceil(random);
        // System.out.println("random = " + random);

        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25 - 15 + 1);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);

    }
}
