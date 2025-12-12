public class While {
    public static void main(String [] args){
        //Veremos como funciona la estructura repetitiva o bucles "while" solo
        int i = 0;
        while (i <= 10){

            System.out.print(i + ",");
            /*El incremento se pone despues ddel print ya que si se pone antes cambia el resultado
            por que incrementa primero antes de imprimer el valor actual, las buenas practicas indican
            ponerlo despues del print*/
            i ++;

        }


    }
}
