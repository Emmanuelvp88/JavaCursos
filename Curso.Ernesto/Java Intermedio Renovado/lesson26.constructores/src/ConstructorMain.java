public class ConstructorMain {
   public static void main(String[] args) {

       //al crear un objeto de una clase, se ejecuta en automatico el constructor de esa clase
//       ConConstructor mensajero = new ConConstructor();

       ConMetodos mensajero = new  ConMetodos( 25,5);
       System.out.println(mensajero.x);

       //Cuando no tenemos uncostructor, podemos hacer la misma logica usando metodos
//       ConMetodos receptor = new ConMetodos();
//       receptor.pedirNombre();
//       receptor.mostrarNombre();
   }
}
