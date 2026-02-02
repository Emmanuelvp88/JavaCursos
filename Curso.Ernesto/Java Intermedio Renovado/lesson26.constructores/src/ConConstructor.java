import java.util.Scanner;

public class ConConstructor {

    public ConConstructor() {
        String nombre = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("¿cual es tu nombre?");
        nombre = sc.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }


    //envio de atributos de un contructor desde la clase padre
    int x = 30;

    public ConConstructor(int x) {
        this.x = x;
        System.out.println("El valor de x es: " + x);
    }
}
