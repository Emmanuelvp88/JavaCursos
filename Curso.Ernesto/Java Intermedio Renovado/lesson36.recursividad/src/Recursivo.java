public class Recursivo {

    public void imprimir(int valor) {
        if (valor <= 5) {
            //imprime al subir si el print esta antes del llamado recursivo imorime de menor a mayor
            System.out.print(" " + valor);

            //llmado recursivo del mismo metodo con el argumento de "+1" para que vaya aumentado
            imprimir(valor + 1);

            //Curiosamente cuando ponemso el print despues de la llmada recursiva, se imprime de mayor a menor
            System.out.print(" " + valor);
        }
    }
}
