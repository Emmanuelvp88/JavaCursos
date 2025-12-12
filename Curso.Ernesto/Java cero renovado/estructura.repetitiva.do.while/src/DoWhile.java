public class DoWhile {
    public static void main(String [] args){
        /* En esta leccion veremos como funciona la estructura repetitiva Do While
        * */

        int i  = 1000;

        do{
            i -= 200;/*Si pongo el decremento abajo del print si se imprime correctmente hasta el "0", pero se
             esta imprimiendo el -200 por que la condicion dice que sea mayor o igual a cero, asi que todavia entra la condicion
            siendo cero*/

            System.out.print(i + ",");// sin salto de linea para que se imprime Horizontal

        }while(i >= 0);
    }
}
