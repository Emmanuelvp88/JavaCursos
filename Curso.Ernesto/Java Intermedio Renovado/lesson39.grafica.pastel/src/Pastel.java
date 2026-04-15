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
        lblRojo.setBounds(380,90,100,30);
        this.add(lblRojo);

        JLabel lblVerde = new JLabel("Color Verde");
        lblVerde.setForeground(Color.GREEN.darker());
        lblVerde.setBounds(380,130,100,30);
        this.add(lblVerde);

        JLabel lblAzul = new JLabel("Color Azul");
        lblAzul.setForeground(Color.BLUE);
        lblAzul.setBounds(380,170,100,30);
        this.add(lblAzul);

        // Cuadritos de Colores
        JPanel rojoBox = new JPanel();
        rojoBox.setBackground(Color.RED);
        rojoBox.setBounds(350,95,20,20);
        this.add(rojoBox);

        JPanel verdeBox = new JPanel();
        verdeBox.setBackground(Color.GREEN.darker());
        verdeBox.setBounds(350,135,20,20);
        this.add(verdeBox);

        JPanel azulBox = new JPanel();
        azulBox.setBackground(Color.BLUE);
        azulBox.setBounds(350,175,20,20);
        this.add(azulBox);

        // Labels entrada de votos
        JLabel lbRojo = new JLabel("Rojo");
        lbRojo.setBounds(30,320,50,25);
        this.add(lbRojo);

        JLabel lbVerde = new JLabel("Verde");
        lbVerde.setBounds(30,350,50,25);
        this.add(lbVerde);

        JLabel lbAzul = new JLabel("Azul");
        lbAzul.setBounds(30,380,50,25);
        this.add(lbAzul);


        // Los TextField par los votos
        txtRojo = new JTextField();
        txtRojo.setBounds(80,320,80,25);
        this.add(txtRojo);

        txtVerde = new JTextField();
        txtVerde.setBounds(80,350,80,25);
        this.add(txtVerde);

        txtAzul = new JTextField();
        txtAzul.setBounds(80,380,80,25);
        this.add(txtAzul);

        // Boton graficar
        btnGraficar = new JButton("Graficar");
        btnGraficar.setBounds(350, 240,100,30);
        this.add(btnGraficar);

        // Evento del boton
        btnGraficar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    rojo = Integer.parseInt(txtRojo.getText());
                    verde = Integer.parseInt(txtVerde.getText());
                    azul = Integer.parseInt(txtAzul. getText());

                    //Vuelver a dibujar
                    panelGrafica.repaint();
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros");
                }
            }
        });

    }

// Metodo para dibujar el círculo para gráfica pastel
    public void dibujarGrafica(Graphics g){
        int total = rojo + verde + azul;

        if (total == 0){
            g.setColor(Color.BLACK);
            g.drawString("No hay datos para graficar",80,120);
            return;
        }

        // Convertir los votos a grados
        int gradosRojo = (rojo * 360) / total;
        int gradosVerde = (verde * 360) / total;
        int gradosAzul = 360 - gradosVerde - gradosRojo;


        // Dibujar los sectores
        g.setColor(Color.RED);
        g.fillArc(30,20,200,200, 0, gradosRojo);

        g.setColor(Color.GREEN.darker());
        g.fillArc(30,20,200,200,gradosRojo, gradosVerde);

        g.setColor(Color.BLUE);
        g.fillArc(30,20,200,200,gradosRojo + gradosVerde, gradosAzul);

    }


    public static void main(String[] args) {
               new Pastel();
    }
}
