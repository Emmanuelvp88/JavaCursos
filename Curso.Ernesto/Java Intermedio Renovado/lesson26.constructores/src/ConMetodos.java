import java.util.Scanner;

public class ConMetodos  {
    String nombre = "";
    Scanner sc = new Scanner(System.in);

    //metodo para pedir datos
    public void pedirNombre() {
        System.out.println("¿Cual es tu nombre?: 'Con metodos'");
        nombre = sc.nextLine();
    }

    //metodo para mostrar los datos
    public void mostrarNombre() {
        System.out.println("Tu nombre es: " + nombre);
    }
}
