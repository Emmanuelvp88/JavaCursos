import javax.swing.*;

public class Formas extends JFrame {

    public Formas(){
        initComponents();
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




}
