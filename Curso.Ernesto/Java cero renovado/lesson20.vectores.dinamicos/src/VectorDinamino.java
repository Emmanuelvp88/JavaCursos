import java.util.Scanner;

public class VectorDinamino {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int numPosiciones = 0, contenido = 0;

        //Peticion al usuario de la cantidad de posiciones y se almacena en una variable
        System.out.println("De cuantas posiciones quieres el vector? ");
        numPosiciones = sc.nextInt();

        //Declaracion del vector y paso del parametro de cantidad de posiciones que va tener
        int vector[] = new int[numPosiciones];

        //Este for es solo para rellenar el vector, con la ayuda de el metodo .length() par saber la longitud del vector
        for (int i = 0; i < vector.length; i++){
            System.out.println("ingresa el numero que quieres en la posicion " + (i + 1));
            vector[i] = sc.nextInt();
        }

        //Este for es para mandar a imprimir todo el contenido del vector
        for(int i = 0;i < vector.length;i++) {
            System.out.print("[" + vector[i] + "]");
        }
    }
}
