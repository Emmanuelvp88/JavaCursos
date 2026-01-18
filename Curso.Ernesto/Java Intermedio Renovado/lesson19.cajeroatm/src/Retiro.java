
public class Retiro extends Transacciones{

    @Override
    public void Operacion() {
//        System.out.println("Escogiste la opcion 2: Retirar efectivo.");
//        System.out.println("¿Cuanto efectivo deseas retirar?");
//        efectivo = sc.nextInt();
//        if(getSaldo()>= efectivo) {
//            setSaldo(getSaldo() - efectivo);
//            MostrarSaldo();
//        }else {
//            System.out.println("El monto de retiro es mayor al saldo, retirar una cantidad menor");
//        }
        System.out.println("elegiste la opcion 2: retiro. ¿Cuanto deseas retirar?");
        retiro = sc.nextInt();
        efectivo = getSaldo();
        setSaldo(efectivo - retiro);
        System.out.println("Retiarste " + retiro);
        System.out.println("tu saldo actual es: " + getSaldo());

    }
}
