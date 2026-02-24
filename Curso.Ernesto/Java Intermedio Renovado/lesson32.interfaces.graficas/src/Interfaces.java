import javax.swing.*;
import java.awt.event.*;

public class Interfaces extends JFrame implements ActionListener{

    //Aqui solo esta la declaracion de los objetos que iremos a utilizar, aun no se inicializan
    private final JTextField field1;
    private JLabel label1;
    private JButton boton1;


    public Interfaces(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Inicializacion del Objeto
        label1 = new JLabel("Escribe aquí:");
        //Damos cordenadas al objeto con el metodo "setBounds()"
        label1.setBounds(30, 25, 80,50);
        //Agregamos el diseño anterior al objeto con el metodo "add()"
        add(label1);

        //Inicializacion del Objeto
        field1 = new JTextField();
        //Damos cordenadas al objeto con el metodo "setBounds()"
        field1.setBounds(120, 40, 130,20);
        //Agregamos el diseño anterior al objeto con el metodo "add()"
        add(field1);

        boton1 = new JButton("Mostrar");
        boton1.setBounds(40, 70, 80,30);
        add(boton1);
        //Decimos que este boto va a tener un evento
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

    //Agregamos el metodo "main" para poderle dar diseño a nuestro FRAME que va a contener a nuestros objetos
    public static void main(String[] args){

        //Esto es prácticamente una ventana (Frame) en blaco para contener a todos nuestros objetos que emos creado anteriormente
        //Creamos u nuevo Objeto de la clase "Interfaces"
        Interfaces frame = new Interfaces();
        //con esto le decimos que queremos que sea visible
        frame.setVisible(true);
        //Le damos dimensions
        frame.setSize(300, 170);
        //Le decimos que no queremos que sea modificable el tamaño
        frame.setResizable(false);
        //Que su locación esté centrada
        frame.setLocationRelativeTo(null);
        //Que el cerrarse cierre todos los procesos para que no consuma mas recursos o se cree un demonio
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
