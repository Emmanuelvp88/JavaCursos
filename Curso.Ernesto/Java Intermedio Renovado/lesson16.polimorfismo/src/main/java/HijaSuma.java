public class HijaSuma extends Padre {

    //Mtodo para realizar la operacion
    @Override
    public void Operacion() {
        resultado = num1 + num2;
    }

    //Metodo para mostrar resultado, aunque todo lo pudimos aver mostrado en el metodo anterior
    //Esto es confines educativos
    @Override
    public void Resultados() {
        System.out.println("El resultado de tu suma es:" + resultado);
        ;
    }
}
