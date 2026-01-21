public class Main {
    public static void main(String[] args) {

        /*La palabra reservada "Super" sirve preferentemente para instanciar metodos y atributos de una clase
        padre, EJEMPLO: si tenemos un  metodo o variable de una clase hija que tiene el mismo nombre de algun metodo de la calse padre,
         con la palabra "super." sabemos que hacemos referencia los elemetos de la clase padre,*/


        /*creamos un objeto para mandar a llamar al metodo "Saludar()"que se encuentra en la clase hija, y sabemos que en la clase padre
        tambien existe un metodo con el mismo nombre.
        el metodo de la clase hija contiene al metodo "Saludar()" de la clase padre referenciandolo con la palabra "Super"*/
        Padre hija = new Hija();
        hija.Saludar();
    }
}
