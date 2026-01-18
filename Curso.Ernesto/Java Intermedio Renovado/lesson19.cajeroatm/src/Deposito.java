
public class Deposito extends Transacciones {

    @Override
    public void Operacion() {
//        System.out.println(" Opcion 3: realizar un  deposito");
//        System.out.println(" ¿Cuanto deseasdepositar?");
//        efectivo = sc.nextInt();
//        dinero = getSaldo();
//        setSaldo(dinero + efectivo);
//        MostrarSaldo();
        System.out.println("Eelgiste la opcion 3 deposito: ¿que cantidad deseas depositar? ");
        deposito = sc.nextInt();
        efectivo = getSaldo();
        setSaldo(efectivo + deposito);
        System.out.println("Depositaste " + deposito);
        System.out.println("tu saldo actual es: " + getSaldo());
    }


}
