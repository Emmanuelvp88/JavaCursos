public class Fibonaci {
    public static void main(String [] args){
        int a = 0, b = 1, c = 0;
        for(int i = 0; i <= 10; i++) {
            c = a + b;  //1 = 0 + 1 ahora "c" vale 1
            a = b;      //0 = 1 ahora "a" vale 1
            b = c;      //1 = 1 "b" sigue valiendo 1
            /*todas las variables valen 1 ahora mismo, en sa siguiente vuelta "c" va a valer 2 "a" 1 y "b" tomara el valor de "c" qu ees 2
            * y asi sucesivamente*/

            System.out.print(c + ",");
        }
        }
    }

