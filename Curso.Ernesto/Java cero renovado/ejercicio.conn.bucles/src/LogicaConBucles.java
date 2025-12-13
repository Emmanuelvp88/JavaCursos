public class LogicaConBucles {
    public static void main(String[] args){
        //Logica de Ernesto primera ejersicio con bucle "for"
        //salida esperada: 1,2,3,4,5,6,7,8,9,10
        int i = 0;
        for (i = 1; i <= 10; i++) {
            if (i < 10) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();

        //Logica de ernensto primer ejersicio con el bucle "while"
        i = 1;// Reseteamos la variable por que es una variable global y esta siendo utilizada y esta en constanteente cambio
        while (i <= 10) {
            if (i < 10) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
            i++;
        }
        System.out.println();

        //Logica de Ernesto con el segundo ejercicio con bucle "for"
        i = 1;
        int j = 99;
        for(i = 1; i <= 10;i++){
            if(i < 10){
                System.out.print(i + ",");
                System.out.print(j + ",");
            }else{
                System.out.print(i + ",");
                System.out.print(j);
            }
                j--;
        }
        System.out.println("\n");

        /*Mi logica con el primer ejercicio, solo lo are con el bucle "for" se seguira la misma
        * logica con los demas bucles*/
        i = 1;
        for (; i < 10; i++) {
            System.out.print(i + ",");
        }
        System.out.print(i);
        System.out.println();

        /*Mi logica con la segunda cadena dde numeros, se aplica lo mismo para ambos bucles
         tanto para "for" como para el "while" asi que no veo el caso hacer los solo hare una
         demostracion con el bucle "for"*/

        i = 1;//reseteamos la variable a 0 ya que es una variable global y esta en constante cambio
        j = 99;
        for (; i < 10; i++) {
            System.out.print(i + "," + j + ",");
            j--;
        }
        System.out.println(i + "," + j);
    }
}
