
import java.awt.Image;
import java.util.stream.Stream;

import javax.swing.*;

public class mp51 {
    JFrame frame;
    JLabel label1, label2, label3, label4, label5, labelimage;
    ImageIcon image;
    JButton button;
    Image image1, newimg;
    
    public mp51(JMenuBar mm){

        frame = new JFrame("Sample Frame");
        button = new JButton("Exit");
        
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        
        button.setBounds(300, 300, 100, 30);
        button.addActionListener(ex ->{
         
        new mp5();
        frame.dispose();
        });
        // frame.setJMenuBar(mm);
        
    }
    void myProfile(){

        image = new ImageIcon("D:\\Java\\Mini Projects\\Mini Projects\\mp5\\marie-magny-fxel4isxgaa6suc-1.jpg");
        
        Image image1 = image.getImage(); 
        Image newimg = image1.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); 
        image = new ImageIcon(newimg);

        label1 = new JLabel("Civil Status: Single ");
        label2 = new JLabel ("Year-Level: 2nd year");
        label3 = new JLabel("Program: Computer Science");
        label4 = new JLabel("Age: 20");
        label5 = new JLabel("Motto:");
        labelimage = new JLabel();
    
        label1.setBounds(150, 180, 300, 30);
        label2.setBounds(150, 230, 300, 30);
        label3.setBounds(150, 280, 300, 30);
        label4.setBounds(150, 330, 300, 30);
        label5.setBounds(150, 380, 300, 30);
        
        labelimage.setIcon(image);
        labelimage.setVerticalAlignment(JLabel.TOP);
        
        Stream.of(label1, label2, label3, label4, label5, labelimage).forEach(p -> frame.add(p));
            
    }
    void experience(){

        label1 = new JLabel("Civil Status: Single ");
        label2 = new JLabel ("Year-Level: 2nd year");
        label3 = new JLabel("Program: Computer Science");
        label4 = new JLabel("Age: 20");
        label5 = new JLabel("Motto:");

        label1.setBounds(150, 180, 300, 30);
        label2.setBounds(150, 230, 300, 30);
        label3.setBounds(150, 280, 300, 30);
        label4.setBounds(150, 330, 300, 30);
        label5.setBounds(150, 380, 300, 30);

        Stream.of(label1, label2, label3, label4, label5).forEach(p -> frame.add(p));
    }
    void education(){
        
        label1 = new JLabel("Civil Status: Single ");
        label2 = new JLabel ("Year-Level: 2nd year");
        label3 = new JLabel("Program: Computer Science");
        label4 = new JLabel("Age: 20");
        label5 = new JLabel("Motto:");

        label1.setBounds(150, 180, 300, 30);
        label2.setBounds(150, 230, 300, 30);
        label3.setBounds(150, 280, 300, 30);
        label4.setBounds(150, 330, 300, 30);
        label5.setBounds(150, 380, 300, 30);

        Stream.of(label1, label2, label3, label4, label5).forEach(p -> frame.add(p));

    }
    void parents(){
        
        label1 = new JLabel("Civil Status: Single ");
        label2 = new JLabel ("Year-Level: 2nd year");
        label3 = new JLabel("Program: Computer Science");
        label4 = new JLabel("Age: 20");
        label5 = new JLabel("Motto:");

        label1.setBounds(150, 180, 300, 30);
        label2.setBounds(150, 230, 300, 30);
        label3.setBounds(150, 280, 300, 30);
        label4.setBounds(150, 330, 300, 30);
        label5.setBounds(150, 380, 300, 30);

        Stream.of(label1, label2, label3, label4, label5).forEach(p -> frame.add(p));

    }
    void siblings(){
        
        label1 = new JLabel("Civil Status: Single ");
        label2 = new JLabel ("Year-Level: 2nd year");
        label3 = new JLabel("Program: Computer Science");
        label4 = new JLabel("Age: 20");
        label5 = new JLabel("Motto:");

        label1.setBounds(150, 180, 300, 30);
        label2.setBounds(150, 230, 300, 30);
        label3.setBounds(150, 280, 300, 30);
        label4.setBounds(150, 330, 300, 30);
        label5.setBounds(150, 380, 300, 30);

        Stream.of(label1, label2, label3, label4, label5).forEach(p -> frame.add(p));

    }
    void friends(){
        
        label1 = new JLabel("Civil Status: Single ");
        label2 = new JLabel ("Year-Level: 2nd year");
        label3 = new JLabel("Program: Computer Science");
        label4 = new JLabel("Age: 20");
        label5 = new JLabel("Motto:");

        label1.setBounds(150, 180, 300, 30);
        label2.setBounds(150, 230, 300, 30);
        label3.setBounds(150, 280, 300, 30);
        label4.setBounds(150, 330, 300, 30);
        label5.setBounds(150, 380, 300, 30);

        Stream.of(label1, label2, label3, label4, label5).forEach(p -> frame.add(p));

    }
    void local(){
        
        label1 = new JLabel("Civil Status: Single ");
        label2 = new JLabel ("Year-Level: 2nd year");
        label3 = new JLabel("Program: Computer Science");
        label4 = new JLabel("Age: 20");
        label5 = new JLabel("Motto:");

        label1.setBounds(150, 180, 300, 30);
        label2.setBounds(150, 230, 300, 30);
        label3.setBounds(150, 280, 300, 30);
        label4.setBounds(150, 330, 300, 30);
        label5.setBounds(150, 380, 300, 30);

        Stream.of(label1, label2, label3, label4, label5).forEach(p -> frame.add(p));

    }
    void international(){
        
        label1 = new JLabel("Civil Status: Single ");
        label2 = new JLabel ("Year-Level: 2nd year");
        label3 = new JLabel("Program: Computer Science");
        label4 = new JLabel("Age: 20");
        label5 = new JLabel("Motto:");

        label1.setBounds(150, 180, 300, 30);
        label2.setBounds(150, 230, 300, 30);
        label3.setBounds(150, 280, 300, 30);
        label4.setBounds(150, 330, 300, 30);
        label5.setBounds(150, 380, 300, 30);

        Stream.of(label1, label2, label3, label4, label5).forEach(p -> frame.add(p));

    }
    void article(){
        
        label1 = new JLabel("Civil Status: Single ");
        label2 = new JLabel ("Year-Level: 2nd year");
        label3 = new JLabel("Program: Computer Science");
        label4 = new JLabel("Age: 20");
        label5 = new JLabel("Motto:");

        label1.setBounds(150, 180, 300, 30);
        label2.setBounds(150, 230, 300, 30);
        label3.setBounds(150, 280, 300, 30);
        label4.setBounds(150, 330, 300, 30);
        label5.setBounds(150, 380, 300, 30);

        Stream.of(label1, label2, label3, label4, label5).forEach(p -> frame.add(p));

    }


    
}
