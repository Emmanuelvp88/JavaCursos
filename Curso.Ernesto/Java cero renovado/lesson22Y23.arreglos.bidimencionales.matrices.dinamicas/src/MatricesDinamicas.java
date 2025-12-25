import java.util.Scanner;

public class MatricesDinamicas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas filas deseas?");
        int filas = sc.nextInt();
        System.out.println("cuantas columnas deseas?");
        int columnas = sc.nextInt();

        //Declaracion del array
        int matriz[][] = new int[filas][columnas];

        //bucle para rellenar el for
        for (int i = 0; i < matriz.length; i++) {//recorre filas

            for (int j = 0; j < matriz[i].length; j++) {//recorre columnas, matriz[i] le dice que recorra los elementos de la fila "i"
                System.out.println("dame el valos de la posicion fila " + (i + 1) + " columna " + (j + 1));
                matriz[i][j] = sc.nextInt();//para que el usuario ingrese manualmente los numeros que desea que acontenga el array
            }
        }
        //for para mandar a imprimir el contenido del array
        for (int i = 0; i < matriz.length; i++) {//recorre filas

            for (int j = 0; j < matriz[i].length; j++){//resorre columnas
                System.out.print("[" + matriz[i][j]+"]");
            }
            System.out.println();
        }

    }

}
