import java.util.Random;

public class ObjetoRandom {
    public static void main(String[] args) {
        //creacion de una variable donde vamos a guardar el resultado
        int aleatorio = 0;

        //creacion de un objeto del tipo de la clase "Random"
        Random rm = new Random();

        //la operacion que se realiza mediante el objeto, la guardamos en la variable
        aleatorio = (int)(rm.nextDouble() * 100);

        //ya solo mandamos a imprimir la variable
        System.out.println(aleatorio);

    }

}
