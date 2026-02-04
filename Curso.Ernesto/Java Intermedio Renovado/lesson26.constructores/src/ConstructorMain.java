public class ConstructorMain {
   public static void main(String[] args) {

       //al crear un objeto de una clase, con la palabra "new" el constructor de esa clase se ejecuta en automatico
       ConConstructor mensajero = new ConConstructor();

       //Cuando no tenemos un constructor, podemos hacer la misma logica usando metodos
       ConMetodos receptor = new ConMetodos();
       receptor.pedirNombre();
       receptor.mostrarNombre();


      //NOTA: Tengamso bien en cuennta que unque creemos un objeto de tipo "Hija" siempre se ejecutara primero el constructor de la calse "Padre"

       //objeto para el ejercicio de GPT
      GptHija gpt = new GptHija(25, 5);



   }
}
