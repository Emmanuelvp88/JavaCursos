public class Main {
    public static void main(String[] args) {

        //creamos un objeto apara mandar a llamar al metodo "Saludar()"que se encuentra en la clase hija
        //la cual contiene al metodo "Saludar()" de la clase padre referenciandolo con la palabra "Super"
        Padre hija = new Hija();
        hija.Saludar();

    }
}
