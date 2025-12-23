import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Substring {
    public static void main(String [] args) {
        String cadenaOriginal = "", cadenaSubstring = "";
        int numDeCaracteres = 0, desde = 0, hasta = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una cadena de caracteres");
        cadenaOriginal = sc.nextLine();

        /*El metodo .lecgth() solo sive para contar y saver cuantos caracteres tiene una cadena
           en este caso alojamos ese numero de caracteres en una ariable del tipo Int*/
        numDeCaracteres = cadenaOriginal.length();
        // Y solo lo mostramos mediante un Print()
        System.out.println("Cadena ingresada : " + cadenaOriginal + "  contiene " + numDeCaracteres + " caracteres ");


        /* Aqui pedimos un numero de inicio y un numero final para que se muestre la cadena*/
        System.out.println("Desde que caracter hasta que caracter quieres que se muestre la cadena");
        desde = sc.nextInt();
        hasta = sc.nextInt();

        // Un if() por si el usuario mete un numero mayor al numero total de caracteres de la cadena original
        if(desde > numDeCaracteres || hasta > numDeCaracteres){
            System.out.println("El numero que ingresaste es mayor al total de numeros de caracteres de la cadena, vuelva a intentar");
        }else{
            /* Metodo substring() sirve para determinar desde que numero hasta que numero de caracteres mostrar cierta cadena
             eso se debe de alojar a otra variable para mostrar el resulatado final de la cadena recortada*/
            cadenaSubstring = cadenaOriginal.substring(desde, hasta);
            System.out.println("La nueva cadena de caracteres queda asi: " + cadenaSubstring);

        }



    }
}
