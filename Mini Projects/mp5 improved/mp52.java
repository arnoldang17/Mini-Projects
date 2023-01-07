import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Image;
import java.util.Arrays;
import java.util.stream.Stream;

import javax.swing.*;

public class mp52 extends mp53{

    void myProfile(){
        this.abc();
        image = new ImageIcon("G:\\Java\\Mini-Projects\\wallpaperflare.com_wallpaper (18).jpg");
        
        Image image1 = image.getImage(); 
        Image newimg = image1.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); 
        image = new ImageIcon(newimg);

        label1 = new JLabel("Civil Status: Single ");
        label2 = new JLabel ("Year-Level: 2nd year");
        label3 = new JLabel("Program: Computer Science");
        label4 = new JLabel("Age: 20");
        label5 = new JLabel("Motto:");
        labelimage = new JLabel();
    
        label1.setBounds(200, 230, 500, 30);
        label2.setBounds(200, 280, 500, 30);
        label3.setBounds(200, 330, 500, 30);
        label4.setBounds(200, 380, 500, 30);
        label5.setBounds(200, 430, 500, 30);
        
        labelimage.setIcon(image);
        //labelimage.setVerticalAlignment(JLabel.TOP);
        labelimage.setBounds(200, 100, 120, 120);
        
        Stream.of(label1, label2, label3, label4, label5, labelimage).forEach(p -> frame.add(p));
        labels = new JLabel[]{label1, label2, label3, label4, label5};
        Arrays.stream(labels).forEach(p -> p.setFont(new Font("Arial", Font.PLAIN, 25)));
    }
}
