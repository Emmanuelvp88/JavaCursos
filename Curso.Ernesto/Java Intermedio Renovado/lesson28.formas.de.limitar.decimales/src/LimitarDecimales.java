import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class LimitarDecimales {
    public static void main(String[] args) {
        double numero = 3;
        double raiz = Math.sqrt(numero);

        System.out.println("\n*******La raiz cuadrada de " + numero + " es: " + raiz + "*********\n");

        //Utilizando la clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.##");//las almoadillas despues del punto marcan cuantos decimales mostrar
        System.out.println("Raiz cuadrada con DecimaFormat: " + df.format(raiz));
        //OJO: esto devuelve un String no un double, simple solo para mostrar el valor

        //Utilizando string.format()
        System.out.println("Raiz cuadrada con String.format: " + String.format("%.2f", raiz));
        //La forma mas elegante de hacerlo

        //Utilizando la clase Math.round()
        System.out.println("raiz cuadrada con Math.round: " + (double) Math.round(raiz * 100) / 100);
        //Se usa cuando quieres seguir operando con la variable

        //Utilizando la clase Math BigDecimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Raiz cuadrada con BigDecimal: " + bd.doubleValue());
        //Muy elegible en finanzas, alta precision y control de decimales

    }
}
