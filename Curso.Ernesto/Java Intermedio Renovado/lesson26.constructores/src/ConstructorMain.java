public class ConstructorMain {
   public static void main(String[] args) {

       //al crear un objeto de una clase, con la palabra "new" el constructor de esa clase se ejecuta en automatico
       ConConstructor mensajero = new ConConstructor();

       //Cuando no tenemos un constructor, podemos hacer la misma logica usando metodos
       ConMetodos receptor = new ConMetodos(0, 0);//estos parametros lo s meti de rrelleno por que los pide forsoezamente
       receptor.pedirNombre();
       receptor.mostrarNombre();

       //objeto para el ejercicio de GPT
       ConMetodos GPT = new  ConMetodos( 25,5);


   }
}
