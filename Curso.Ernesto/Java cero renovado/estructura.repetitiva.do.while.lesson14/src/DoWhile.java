public class DoWhile {
    public static void main(String [] args){
        /* En esta leccion veremos como funciona la estructura repetitiva Do While
        * */

        int i  = 1000;

        do{
            System.out.print(i + ",");// sin salto de linea para que se imprime Horizontal
            i -= 200;/*El drecremento se pone despues del print si se pone arriba cambia el resultado
            porque incrementa primero antes de impriir el resultado actual*/
        }while(i >= 0);
    }
}
