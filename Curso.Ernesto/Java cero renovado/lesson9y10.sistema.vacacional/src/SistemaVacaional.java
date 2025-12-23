import java.sql.SQLOutput;
import java.util.Scanner;
public class SistemaVacaional {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String nombre;
        int clave, antiguedad;

        System.out.println("***************Bienvenido al Systema vacacional de Cocacola-Companny************\n");
        System.out.println("Cual es tu nombre");
        nombre = sc.nextLine();

        System.out.println("Cual es la clave de tu departamento");
        clave = sc.nextInt();

        System.out.println("Cual es tu antiguedad de trabajo");
        antiguedad = sc.nextInt();

        if(clave == 1){
            if (antiguedad == 1){
                System.out.println("El trabajador " + nombre + " Tiene derecho a 6 dias de vacaciones");
            } else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador " + nombre + " Tiene derecho a 14 dias de vacaciones");
            } else if (antiguedad >= 7) {
                System.out.println("ele trabajador " + nombre + " Tiene dereco a 20 dias de vacaciones");
            }
        }
        if(clave == 2){
            if (antiguedad == 1){
                System.out.println("El trabajador " + nombre + " Tiene derecho a 7 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("El trabajador " + nombre + " Tiene derecho a 15 dias de vacaciones");
            } else if (antiguedad >= 7) {
                System.out.println("El trabajador " + nombre + " tiene derecho a 22 dias de vacaciones");
            }
        }
    if(clave == 3){
        if(antiguedad == 1){
            System.out.println("El trabajador " + nombre + " tiene derecho a 10 dias de vacaciones");
        }else if (antiguedad >= 2 && antiguedad <= 6){
            System.out.println("El trabajador " + nombre + " Tiene derecho a 20 dias de vacaciones");
        } else if (antiguedad >= 7) {
            System.out.println("El trabajador " + nombre + " tiene derechoa  30 dias de vacaciones");
        }
    }else {
        System.out.println("La clave del departamento no existe, ¡por favor ingresa una clave valida.!");
    }
    }
    /* NOTA: Todo este proceso todas esta condicionales se pueden sustituir por
    * uan mejor estructura de control que es "Swith" "case" "break" que es lo que dictan las buenas practicas
    * no tener muchas estructuras if else
    * */
}
