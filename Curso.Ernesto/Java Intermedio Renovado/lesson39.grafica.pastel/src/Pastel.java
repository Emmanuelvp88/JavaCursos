import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pastel extends JFrame {

    JTextField txtRojo, txtVerde, txtAzul;
    JButton graficar;
    JPanel panelGrafica;
    int rojo, verde, azul;

    public Pastel(){
        this.setTitle("Grafica de Pastel");
        this.setSize(500, 450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //mandamos a llamar al metodo que contiene lso componentes
        initComponent();
    }

   panelGrafica = new JPanel(){
        @Override
                protected void paintComponent(Graphics g);
    };

    boolean bandera = false;





    public void initComponent(){

    }



    public static void main(String [] args){
    }


}
