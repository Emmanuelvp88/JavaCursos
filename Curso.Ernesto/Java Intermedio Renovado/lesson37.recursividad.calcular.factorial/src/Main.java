import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Cual es el numero que deseas calcular el factorial");
        int parametro = sc.nextInt();

        Recursividad recursividad = new Recursividad();
        int resulFactorial = recursividad.factorial(parametro);

        System.out.println("El factorial de " + parametro + " es: " + resulFactorial);
        sc.close();
    }
}
