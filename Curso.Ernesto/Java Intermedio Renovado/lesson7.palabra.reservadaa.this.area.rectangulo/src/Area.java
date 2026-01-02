public class Area {
   private  int base, altura, resultado;

    public Area(int base, int altura){
        this.base = base;
        this.altura = altura;
    }


    //Esta es mi lógica, usando "int" en rl metodo para poder ussar "return"
    // y retornar directamente el valor de la operacion sin usar la variable "resultado"

//    public int CalculoArea(){
//        return base*altura;
//    }


    //Logica de Ernesto usando un meto extra "Imprimir()" y una variable extra "resultado"
    public void CalculoArea(){
        resultado = base*altura;
    }
    public void Imprimir(){
        CalculoArea();
        System.out.println("El area es: " + resultado);
    }
}
