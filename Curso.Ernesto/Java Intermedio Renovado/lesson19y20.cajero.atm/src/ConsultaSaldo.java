public class ConsultaSaldo extends Transacciones {

    @Override
    public void Operacion(){
        System.out.println("Opcion 1: Consulta de saldo");
        System.out.println("--------------------------");
        System.out.println("Saldo actual: " + getSaldo());
        System.out.println("--------------------------");
    }
}
