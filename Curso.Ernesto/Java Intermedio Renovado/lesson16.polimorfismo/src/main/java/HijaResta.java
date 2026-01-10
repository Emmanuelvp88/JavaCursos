public class HijaResta extends Padre {

    @Override
    public void Operacion() {
        resultado = num1 - num2;
    }

    @Override
    public void Resultados() {
        System.out.println("El resultado de tu resta es:" + resultado);
    }
}
