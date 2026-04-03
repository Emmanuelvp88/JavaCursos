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

        g.setColor(Color.MAGENTA);
        g.drawLine(10,100,100,100);
        g.draw3DRect(150,50,60,100,true);
        g.drawRoundRect(250, 50, 60, 100, 6, 6);
        g.drawOval(350, 50, 60,100);

        int vectorX [] = {500, 550, 450};
        int vectorY [] = {50, 140, 140};
        g.drawPolygon(vectorX, vectorY, vectorX.length);



    }

}
