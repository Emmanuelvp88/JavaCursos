import java.util.Scanner;

    //la clase que contiene los metodos abstractos tambie debe de ser del tipo "abstarct"
public abstract class Padre {

    protected int num1, num2,resultado;
    Scanner sc = new Scanner(System.in);

    public void PedirDatos() {
        System.out.println("Dame el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Dame el segundo numero:");
        num2 = sc.nextInt();
    }

    /*Los metodos "abstractos" no llevan cuerpo, ya que el cuarpo se pone a la clase hija cuando se
    sobre escrive "@override" ella va a determinar la accion o las funcioanes que va realizar ese metodo
    cuando lo este sobre escribiendo, de eso se trata el polimorfismo,*/
    public abstract void Operacion();

    //los metodos para que se efectue el polimorfismo deben de ser del tipo "abstract"
    public abstract void Resultados();

}
