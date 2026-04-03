import javax.swing.*;
import java.awt.*;

public class Formas extends JFrame {

    public Formas(){
//        initComponents();
        this.setBounds(0,0,600,400);
        this.setLocationRelativeTo(null);
    }


    public static void main(String [] args){

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formas().setVisible(true);
            }
        });

    }

    public void paint(Graphics g){
        super.paint(g);


        g.setColor(Color.MAGENTA); //Para establecer un color
        g.drawLine(10,100,100,100); //Para dibujar una liena
        g.drawRect(150,50,60,100); //Para dibijar un rectangulo
        g.drawRoundRect(250, 50, 60, 100, 6, 6); //Para dibujar un rectangulo con bordes redondeados
        g.drawOval(350, 50, 60,100); //Paa dibujar un Ovalo

        //vectores para darle cordenadas a un trinagulo
        //De atras hacia deante seria vertice A,B y C
        int vectorX [] = {500, 550, 450};
        int vectorY [] = {50, 140, 140};
        g.drawPolygon(vectorX, vectorY, vectorX.length); //Para dibujar un triangulo con los vectores acteriores



    }

}
