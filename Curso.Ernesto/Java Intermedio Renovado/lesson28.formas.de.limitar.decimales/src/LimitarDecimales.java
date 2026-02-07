import java.text.DecimalFormat;
import java.math.BigDecimal;

public class LimitarDecimales {
    public static void main(String[] args) {
        double numero = 3;
        double raiz = Math.sqrt(numero);

        System.out.println("la raiz cuadrada de " + numero + " es: " + raiz);

        //Utilizando la clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.##");//se delimita los decimales con las almoadillas despues del punto en los parametros
        System.out.println("Raiz cuadrada con DecimaFormat: " + df.format(raiz));

        //Utilizando string format
        System.out.println("Raiz cuadrada con String.format: " + String.format("%.2f", raiz));

    }
}
