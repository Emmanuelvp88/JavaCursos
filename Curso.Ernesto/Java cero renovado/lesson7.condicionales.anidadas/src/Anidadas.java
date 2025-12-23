public class Anidadas {

    public static void main(String[] args) {

        int opcion = 1, num1 = 04, num2 = 7, resultado = 0;
        /*NOTA: La variable opcion es la que va determinar que estructura condicional va entrar en funcion, cambiando
         el valor de esta variable conforme a las opciones que temos disponibles daremos la orden al programa de que stuctura condiconal
         va entrar en funcion*/

        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicaacion");
        System.out.println("4.- Divicion\n");
        //En la siguiente leccion veremos como se escoje cada una de estas opciones mediante teclado

        if (opcion == 1) {
            System.out.println("Elegiste suma");
            resultado = num1 + num2;
            System.out.println("el resultado de tu suma es: " + resultado);
        } else if (opcion == 2) {
            System.out.println("Elegiste resta");
            resultado = num1 - num2;
            System.out.println("El resutado de tu resta es: " + resultado);
        } else if (opcion == 3) {
            System.out.println("elegiste Multiplicacion");
            resultado = num1 * num2;
            System.out.println("El resultado de multiplicaion es: " + resultado);
        } else if (opcion == 4) {
            System.out.println("Elegiste divicion");
            resultado = num1 / num2;
            System.out.println("Elresultado de tu divicion es: " + resultado);
        } else {
            System.out.println("Opcion invalida, elige una opcion valida (opcion del 1 - 4");
        }
    };
};