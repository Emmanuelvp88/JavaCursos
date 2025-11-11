
import java.util.Scanner;
public class Anidadas{

    public static void main (String [] args)   {

        int entrada = 0, num1 = 0, num2 = 0, resultado = 0;

        System.out.println("ingresa la opcion que desean realizar");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicaacion");
        System.out.println("4.- Divicion");

        Scanner sc = new Scanner(System.in);
        entrada = sc.nextInt();

        if (entrada == 1){
            System.out.println("Elegiste suma: aahoraa dame el primer digito a sumar");
            num1 = sc.nextInt();
            System.out.println("Dame el segundo digito a sumar");
            num2 = sc.nextInt();
            resultado = num1 + num2;
            System.out.println("el resultado de tu suma es: "+ resultado);
        };
        if (entrada == 2){
            System.out.println("Elegiste resta: Ahora dame el primer digito a restaar");
            num1 = sc.nextInt();
            System.out.println("Dame el segundo numero a restar");
            num2 = sc.nextInt();
            resultado = num1 - num2;
            System.out.println("El resutado de tu resta es: " + resultado);
            }
//        if(entrada = 3){
//
//        };
//        if(entrada = 4){
//
//        };

    };
};