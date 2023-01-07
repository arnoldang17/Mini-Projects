import javax.swing.*;
import java.awt.Image;

public abstract class mp53 {
    JFrame frame;
    JLabel label1, label2, label3, label4, label5,label6, label7, label8, labelimage;
    JLabel[] labels;
    ImageIcon image;
    JButton button;
    Image image1, newimg;

    public mp53(){
        
        frame = new JFrame();
        button = new JButton("Exit");
        
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        
        button.setBounds(400, 600, 100, 30);
        button.addActionListener(ex ->{
         
        new mp5();
        frame.dispose();
        });
    }
    void abc() {
        System.out.println("abc");
    }
}
