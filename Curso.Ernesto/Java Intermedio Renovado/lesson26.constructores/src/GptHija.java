public class GptHija extends GptPadre {

    /*Ejercicio propuesto por GPT, donde demuestra el envío de atributos y la recepción de parámetros
    mediante super() "Envía los parámetros hacia la clase padre", y this. "Asigna los parámetros recibidos
    en el constructor, los que se envían desde el objeto en la main"*/

    int y;

    public GptHija(int x, int y) {

        super(x);//con "super()" enviamos el parámetro al constructor padre
        this.y = y;//con "this." asignamos el parámetro recibido a una variable local de la clase

        System.out.println("El valor de y es: " + y);

    }
}
