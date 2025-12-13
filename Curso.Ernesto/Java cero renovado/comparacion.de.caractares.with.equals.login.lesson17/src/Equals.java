import java.util.Scanner;

public class Equals {
    public static void main(String [] args){

        String nombre = "", pasword = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre de usuario:");
        nombre = sc.nextLine();
        System.out.println("Ingresa el password:");
        pasword = sc.nextLine();

        if (nombre.equalsIgnoreCase("Emmanuel") && pasword.equals("java")){
            System.out.println("Bienvenido al curso de java con Ernesto");
        }else {
            System.out.println("El nombre de usuario o contraseña con incorrectos");
        }
        //el metodo "equals" es para comparar que sean estrctamente iguales una cadene de caracteres
        //para ignorar entre mayusculas y minisculas se le agrega "IgnoreCase" al equals (equalsIgnoreCase) asi quedaria
    }
}
