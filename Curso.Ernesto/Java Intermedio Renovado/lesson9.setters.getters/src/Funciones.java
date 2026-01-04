public class Funciones {
    //Estas variables son solo para cambiarles el valor a "1" cuando cada metodo se lleve acabo
    //Ecepto "Kilos" y "tipoDeRopa", que son las que se ocupan en el constructor
    private int kilos, tipoDeRopa, secado, lavado, llenado;

    //Constructor para instanciar e inicializar el objeto y los parametros que envian desde la clase "Lavadoramain"
    public Funciones(int kilos, int tipoDeRopa) {
        this.kilos = kilos;
        this.tipoDeRopa = tipoDeRopa;
    }

    //Metodo "Llenado" primera accion de lavadora
    private void Llenado() {
        if (kilos <= 12) {
            System.out.println("Llenando...");
            System.out.println("llenado completo");
            llenado = 1;
        } else {
            System.out.println("Demasiados kilos, baja la carga");
        }
    }

    //Metodo "Lavado" segunda accion de lavadora
    private void Lavado() {
        Llenado();
        if (llenado == 1) {
            if (tipoDeRopa == 1) {
                System.out.println("Escogista lavado de ropa blanca / lavado suave");
                System.out.println("lavando...");
                System.out.println("lavado sinalizado.");
            } else if (tipoDeRopa == 2) {
                System.out.println("Escogiste tipo de de ropa a color / Lavado intenso");
                System.out.println("Lavando ....");
                System.out.println("Lavado finalizado.");
            } else {
                System.out.println("el tipo de ropa que escogiste no esta disponible, se lavara como ropa de color.");
            }
            lavado = 1;//Se cambia el valor de la variable para que el programa sepa que si se efectuo este metodo
        }
    }

    //Metodo "Secado" tercera accion de lavadora
    private void Secado() {
        Lavado();
        if (lavado == 1) {
            System.out.println("Secando ropa....");
            System.out.println("secado finalizado.");
            secado = 1;
        }
    }

    //Este metodo es el unico que se va a compartir que es de tipo publico y contiene todo el ciclo de lavado
    public void CicloFinalizado() {
        Secado();
        if (secado == 1) {
            System.out.println("Ciclo de lavado finalizado.");
        }
    }

    //Metodo getter, sirve para mostrar el contenido de un objeto o una variable
    public int getKilos() {
        return kilos;
    }

    //Metodo setter, sirve para tener acceso a una variable que esta encapsulada de modo privado
    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    public int getTipoDeRopa() {
        return tipoDeRopa;
    }

    public void setTipoDeRopa(int tipoDeRopa) {
        this.tipoDeRopa = tipoDeRopa;
    }
}