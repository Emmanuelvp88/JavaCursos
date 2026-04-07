import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pastel extends JFrame {

    JTextField txtRojo, txtVerde, txtAzul;
    JButton graficar;
    JPanel panelGrafica;
    int rojo, verde, azul;

    public Pastel() {
        this.setTitle("Grafica de Pastel");
        this.setSize(500, 450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //mandamos a llamar al metodo que contiene lso componentes
        initComponents();
    }

    public void initComponents() {
        panelGrafica = new JPanel() {
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                dibujarGrafica(g);
            }
        };
        panelGrafica.setBounds(20,50,300,250);
        panelGrafica.setBackground(Color.LIGHT_GRAY);
        this.add(panelGrafica);





    }

    boolean bandera = false;


    public static void main(String[] args) {
    }
}
