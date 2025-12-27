import java.util.Scanner;

public class InversorDePalabras {
    public static void main(String[] args) {

        String palabra = "";
        Scanner sc = new Scanner(System.in);
        String contador = "";

        System.out.println("Ingresa una palabra para ser invertida.");
        palabra = sc.nextLine();

        //"i" es igual a cantidad de caracteres de "palabra", mientras sea mayor que decremente
        for(int i = palabra.length();i > 0; i--){
            contador += palabra.substring(i - 1, i); //"contador" variable acumladora va alojar caracter por caracter empezando de la ultima posicion
        }
        System.out.println("Palabra invertida: " + contador);
    }
}
