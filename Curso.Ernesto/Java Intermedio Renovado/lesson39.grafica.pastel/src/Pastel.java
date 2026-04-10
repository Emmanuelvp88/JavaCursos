import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pastel extends JFrame {

    JTextField txtRojo, txtVerde, txtAzul;
    JButton btnGraficar;
    JPanel panelGrafica;
    int rojo, verde, azul;

    public Pastel() {
        this.setTitle("Grafica de Pastel");
        this.setSize(500, 450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        // Mandamos a llamar al metodo que contiene lso componentes
        initComponents();

        this.setVisible(true);
    }

    public void initComponents() {

        // Titulo
        JLabel titulo = new JLabel("Color Favorito");
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

        // Los TextField
        txtRojo = new JTextField();
        txtRojo.setBounds(80,320,80,25);
        this.add(txtRojo);

        txtVerde = new JTextField();
        txtVerde.setBounds(80,350,80,25);
        this.add(txtVerde);

        txtAzul = new JTextField();
        txtAzul.setBounds(80,380,80,25);
        this.add(txtAzul);

        // Boton
        btnGraficar = new JButton("Graficar");
        btnGraficar.setBounds(320, 240,100,30);
        this.add(btnGraficar);

        // Evento del boton
        btnGraficar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{

                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros");
                }
            }
        });

    }


    public void dibujarGrafica(Graphics g){
        int total = rojo + verde + azul;

        if (total == 0){
            g.setColor(Color.BLACK);
            g.drawString("No hay datos para graficar",80,120);
            return;
        }
    }


    public static void main(String[] args) {
        new Pastel();
    }
}
