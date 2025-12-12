    /*  En esta leccion aprenderemos como se utiza la estructura de control
    * "Switch" "case" "break", esta se recomienda en las buenas practicas para no utilizar tantos "if else"*/
import java.util.Scanner;
public class SwitchCaseBreak {
    public static void main (String [] args){
        System.out.println("\n******************Casos disponibles*******************");
        System.out.println("Caso 1: Suma");
        System.out.println("Caso 2: Resta");
        System.out.println("Caso 3: Multiplicacion");
        System.out.println("Caso 4: Divicion\n");

        Scanner sc = new Scanner(System.in);
        int caso, num1, num2, resultado;

        System.out.println("ingresa el caso que deseas realizar.");
        caso = sc.nextInt();

        System.out.println("elegiste el caso " + caso + " ingresa el primer valor: ");
        num1 = sc.nextInt();
        System.out.println("Ingresa el segundo valor: ");
        num2 = sc.nextInt();

        switch(caso){
            case 1: resultado = num1 + num2;
                System.out.println("El resultado de tu suma es: "  + resultado);
                break;
            case 2:resultado = num1 - num2;
                System.out.println("El resultado de tu resta es: " + resultado);
                break;
            case 3:resultado = num1 * num2;
                System.out.println("El resultado de tu muntiplicacion es: " + resultado);
                break;
            case 4:resultado = num1 / num2;
                System.out.println("El resultado de tu divicion es: " + resultado);
                break;
            default:
                System.out.println("error¡, no se encontro un caso valido");
        }

    }

}
