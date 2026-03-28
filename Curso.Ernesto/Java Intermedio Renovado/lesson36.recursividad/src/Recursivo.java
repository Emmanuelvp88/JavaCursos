public class Recursivo {

    public void imprimir(int valor) {
        if (valor <= 5) {
            //imprime al subir si el print esta antes del llamado recursivo imprime de menor a mayor
            System.out.print(" " + valor);

            //llamado recursivo del mismo método con el argumento de "+1" para que vaya aumentando
            imprimir(valor + 1);

            //Curiosamente, cuando ponemos el print después de la llamada recursiva, se imprime de mayor a menor
            System.out.print(" " + valor);
        }
    }
}
