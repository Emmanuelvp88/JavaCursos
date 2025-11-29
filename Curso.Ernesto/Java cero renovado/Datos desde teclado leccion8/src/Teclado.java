
import java.sql.SQLOutput;
import java.util.Scanner;
//Primeramente importamos la libreria requerida
public class Teclado {

    public static void main(String [] args){
        int num1, num2, resultado, opcion;


        Scanner sc = new Scanner(System.in);
        //Creamos un objeto de tipo "Scanner" gracias a la libreria

        System.out.println("***************Bienvenido a la calculadora***************");
        System.out.println("Selecciona el numero de operacion que deseas realizar");
        System.out.println("1.- Suma\n" +
                            "2.- Resta\n" +
                            "3.- Multiplicacion\n" +
                            "4.- Divicion\n" +
                            "5.- Resto\n");
        opcion = sc.nextInt();
        //Con esto decimos que "opcion" va ser igual a el objeto "sc" el cual va pedir datos
        //al usuario y lo alojara en  la variable "opcion"

        if(opcion == 1){
            System.out.println("Elegiste la opcion 1.- Suma");
            System.out.println("Dame el primer digito a sumar");
            num1 = sc.nextInt();
            System.out.println("Dame el segundo numero a umar");
            num2 = sc.nextInt();
            resultado = num1 + num2;
            System.out.println("El resultado de tu suma es: " + resultado);
        }else if(opcion == 2){
            System.out.println("Elegiste la opcion 2.- Resta");
            System.out.println("Dame el primer diguto a retar");
            num1 = sc.nextInt();
            System.out.println("Dame el segudo numeor a restar");
            num2 = sc.nextInt();
            resultado = num1 - num2;
            System.out.println("El resultadoi de tu resta es: " + resultado);
        }else if(opcion == 3){
            System.out.println("Elegiste la opcion 3.- Multiplicacion");
            System.out.println("Dame el primer digito para la multiplicacion");
            num1 = sc.nextInt();
            System.out.println("Dame el segundo digito para la multiplicacion");
            num2 = sc.nextInt();
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicacon es: " + resultado);

        }else if (opcion == 4){
            System.out.println("Eelgiste la opcion 4.- Divicion");
            System.out.println("dame el numero divisor");
            num1 = sc.nextInt();
            System.out.println("Dame el numero dividendo");
            num2 = sc.nextInt();
            resultado = num2/num1;
            System.out.println("El resultado de la divicon es: " + resultado);
        }else if(opcion == 5){
            System.out.println("Elegiste la opcion 5.- Resto");
            System.out.println("Dame el numero divisor");
            num1 = sc.nextInt();
            System.out.println("Dame el dividendo");
            num2 = sc.nextInt();
            resultado = num1 % num2;
            System.out.println("El resto es: " + resultado);
        } else{
            System.out.println("Opcion no valida, por favor elegige una de las opciones anteriores");
        }
    }
}
