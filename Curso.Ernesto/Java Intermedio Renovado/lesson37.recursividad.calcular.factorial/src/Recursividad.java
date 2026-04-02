public class Recursividad {
    public int factorial(int parametro){

        if(parametro > 0){

            int auxiliar = parametro * factorial(parametro - 1);
            System.out.println(auxiliar);
            return auxiliar;
        }

        return 1;
        }
    }

