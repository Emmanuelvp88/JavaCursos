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

        // Mandamos a llamar al metodo que contiene lso componentes
        initComponents();
    }

    public void initComponents() {

        // Titulo
        JLabel titulo = newJLabel("Color Favorito");
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        titulo.setBounds(180,10,150,30);
        this.add(titulo);

        // Panel de dibujo
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

        // Etiquetas de colores (Leyenda)
        JLabel lblRojo = new JLabel("Color Rojo");
        lblRojo.setForeground(Color.RED);
        lblRojo.setBounds(350,90,100,30);
        this.add(lblRojo);

        JLabel lblVerde = new JLabel("Color Verde");
        lblVerde.setForeground(Color.GREEN.darker());
        lblVerde.setBounds(350,130,100,30);
        this.add(lblVerde);

        JLabel lblAzul = new JLabel("Color Azul");
        lblAzul.setForeground(Color.BLUE);
        lblAzul.setBounds(350,170,100,30);
        this.add(lblAzul);


    }

    public void dibujarGrafica(Graphics g){

    }
    boolean bandera = false;


    public static void main(String[] args) {
    }
}
