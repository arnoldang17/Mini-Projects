import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.stream.Stream;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ic
 */
public class menu22 {
   
    public menu22(){
        JFrame frame = new JFrame("Sample Frame");
        JButton button = new JButton("Exit");
        ImageIcon image = new ImageIcon("C:\\Users\\ic\\Downloads\\1.jpg");
        
        Image image1 = image.getImage(); 
        Image newimg = image1.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); 
        image = new ImageIcon(newimg);
        
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        
        button.setBounds(300, 300, 100, 30);
        button.addActionListener(ex ->{
 
        new Menu_1();
        frame.dispose();
      
        });
        
        JLabel label1 = new JLabel("Civil Status: Single "),
           label2 = new JLabel ("Year-Level: 2nd year"),
           label3 = new JLabel("Program: Computer Science"),
           label4 = new JLabel("Age: 20"),
           label5 = new JLabel("Motto:"),
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
     
}

