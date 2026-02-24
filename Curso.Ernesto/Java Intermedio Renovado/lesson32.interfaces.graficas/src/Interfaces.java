import javax.swing.*;
import java.awt.event.*;

public class Interfaces extends JFrame implements ActionListener{
    private final JTextField field1;
    private JLabel label1;
    private JButton boton1;


    public Interfaces(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label1 = new JLabel("Escribe aquí:");
        label1.setBounds(30, 25, 80,50);
        add(label1);

        field1 = new JTextField();
        field1.setBounds(120, 40, 130,20);
        add(field1);

        //Con esto le decimos que "boton1" va a hacer un nuevo objeto de la calse "JButton"
        boton1 = new JButton("Mostrar");
        /* con el método setBounds() damos coordenadas al objeto */
        boton1.setBounds(40, 70, 80,30);
        /* "add" sirve para agregar todo el diseño anterior al objeto que este dentro del metodo */
        add(boton1);
        boton1.addActionListener(this);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
            //recuperamos el evento con getSource() y corroborar que venga de "boton1"
            if (e.getSource() == boton1) {
                //creamos una variable que alojara el contenido de "field1"
                String texto = field1.getText();
                //Con esta línea mandamos a mostrar la variable "texto" en una ventana emergente
                JOptionPane.showMessageDialog(null,texto);
            }
    }

    //método "main" para poderle dar diseño a nuestro FRAME que va contener a nuestros objetos
    public static void main(String[] args){
        Interfaces frame = new Interfaces();
        frame.setVisible(true);
        frame.setSize(300,170);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
