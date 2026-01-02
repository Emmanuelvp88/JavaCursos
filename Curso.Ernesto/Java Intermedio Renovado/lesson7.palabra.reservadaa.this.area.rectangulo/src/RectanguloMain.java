import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la base del rectangulo.");
        int base = sc.nextInt();

        System.out.println("Dame la altura del rectangulo.");
        int altura = sc.nextInt();

        Area Valores = new Area(base, altura);

        //System.out.println("El area del rectangulo es: " + Valores.CalculoArea());
        Valores.Imprimir();
    }

}
