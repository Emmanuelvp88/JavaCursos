import java.util.Scanner;

public class ConMetodos extends ConConstructor {
    String nombre = "";
    Scanner sc = new Scanner(System.in);

    public void pedirNombre() {
        System.out.println("¿Cual es tu nombre?");
        nombre = sc.nextLine();
    }

    public void mostrarNombre() {
        System.out.println("Tu nombre es: " + nombre);
    }


    //Ejercicio propuesto por GPT, donde demustra en levio de atributos y la recepcion de parametros
    //mediannte super(), y this
    int y;

    public ConMetodos(int x, int y) {
        super(x);
        this.y = y;
        System.out.println("El valor de y es: " + y);

    }

}
