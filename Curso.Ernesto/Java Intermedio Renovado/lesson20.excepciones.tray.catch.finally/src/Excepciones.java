import java.util.Scanner;

public class Excepciones {
    static void main() {
        try {
            System.out.println("ingresa el primer numero");
            int num1 = new Scanner(System.in).nextInt();

            System.out.println("ingresa el segundo numero");
            int num2 = new Scanner(System.in).nextInt();

            int resultado = num1 / num2;
            System.out.println("el resultado es: " + resultado);

        }

        //El catch debe de tener un objeto del tipo de la ecepcion, para mostrarlo posteriormente
        catch (ArithmeticException e) {
            System.out.println("error¡¡¡" + e.getMessage());
        }

        //El finally siempre se va a ejecutar, util para Cerrar archivos
        //Cerrar conexiones
        //Liberar memoria
        //Cerrar streams
        finally {
            System.out.println("Aqui va el codigo que quieres que siempre se ejecute ");
        }
    }
}
