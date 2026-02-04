import java.util.Scanner;

public class ConConstructor {

    public ConConstructor() {
        String nombre = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("¿cual es tu nombre?: 'con el constructor'");
        nombre = sc.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
