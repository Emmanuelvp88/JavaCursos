public class Funciones {
    private int kilos, tipoDeRopa, secado, lavado, llenado;

    public Funciones(int kilos, int tipoDeRopa) {
        this.kilos = kilos;
        this.tipoDeRopa = tipoDeRopa;
    }

    private void Llenado() {
        if (kilos <= 12) {
            System.out.println("Llenando...");
            System.out.println("llenado completo");
            llenado = 1;
        } else {
            System.out.println("Demasiados kilos, baja la carga");
        }
    }

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
            lavado = 1;
        }
    }

    private void Secado() {
        Lavado();
        if (lavado == 1) {
            System.out.println("Secando ropa....");
            System.out.println("secado finalizado.");
        secado = 1;
        }
    }

    public void CicloFinalizado() {
        Secado();
        if (secado == 1) {
            System.out.println("Ciclo de lavado finalizado.");
        }
    }
}