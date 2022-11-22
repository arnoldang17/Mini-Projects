/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ic
 */
import javax.swing.*;
import java.awt.Font;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Stream;
public class mp3_improved {
    
    public static void main(String[] args){
        
    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();
    JLabel label = new JLabel("San Beda University "),
           label11 = new JLabel ("<<Payroll System>>"),
           label1 = new JLabel("No. Of Hours Worked: "),
           label2 = new JLabel("Rate per Hour: "),
           label3 = new JLabel("Gross Pay:"),
           label4 = new JLabel("Net Pay:"),
           label5 = new JLabel("SSS: "),
           label6 = new JLabel("Pag-Ibig: "),
           label7 = new JLabel("Tax: "),
           label8 = new JLabel("Total Deduction: ");
     JTextField  l1 = new JTextField(),
                 l2 = new JTextField(),
                 l3 = new JTextField(),
                 l4 = new JTextField(),
                 l5 = new JTextField(),
                 l6 = new JTextField(),
                 l7 = new JTextField(),
                 l8 = new JTextField();
    
    JTextField[] textFields = new JTextField[] {l1, l2, l3, l4, l5, l6, l7, l8};
    JLabel[] labels = new JLabel[] {label, label11, label1, label2, label3, label4, label5, label6, label7, label8};

    JButton button = new JButton("Compute"),
            button1 = new JButton("Clear"),
            button2 = new JButton("Exit");
     
    frame.setSize(1000,1000);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel1.setLayout(null);
    
    frame.setVisible(true);
    
    frame.add(panel1);
    
    panel1.add(button);
    panel1.add(button1);
    panel1.add(button2);

    Arrays.stream(textFields).forEach(p -> panel1.add(p));
    Arrays.stream(labels).forEach(p -> panel1.add(p));

    Stream.of(labels).forEach(p -> p.setFont(new Font("Arial light", Font.PLAIN, 15)));


    label.setBounds(370, 100, 300, 30);
    label11.setBounds(370, 120, 300, 50);
    
    label.setFont(new Font("Arial light", Font.BOLD, 20));
    label11.setFont(new Font("Arial light", Font.BOLD, 20));
    
    label1.setBounds(150, 180, 300, 30);
    l1.setBounds(300, 180, 150, 30);
    label2.setBounds(150, 230, 300, 30);
    l2.setBounds(300, 230, 150, 30);
    label3.setBounds(150, 280, 300, 30);
    l3.setBounds(300, 280, 150, 30);
    label4.setBounds(150, 330, 300, 30);
    l4.setBounds(300, 330, 150, 30);
    
    label5.setBounds(520, 180, 300, 30);
    l5.setBounds(640, 180, 150, 30);
    label6.setBounds(520, 230, 300, 30);
    l6.setBounds(640, 230, 150, 30);
    label7.setBounds(520, 280, 300, 30);
    l7.setBounds(640, 280, 150, 30);
    label8.setBounds(520, 330, 300, 30);
    l8.setBounds(640, 330, 150, 30);
    
    button.setBounds(250, 430, 100, 30);
    button1.setBounds(430, 430, 100, 30);
    button2.setBounds(610, 430, 100, 30);
    
    button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ex){
    
        int hours = Integer.parseInt(l1.getText());
        int Rate_phours = Integer.parseInt(l2.getText());
        int SSS = Integer.parseInt(l5.getText());
        int pagibig = Integer.parseInt(l6.getText());
            
            
        int gross_pay =  hours * Rate_phours;
        l3.setText("P" + Integer.toString(gross_pay));
            
        double tax = gross_pay * .1;
        double total = SSS + pagibig + tax;

        l8.setText("P" + String.format("%.0f",total));
        l7.setText("P" + String.format("%.0f", tax));
        l4.setText("P" + String.format("%.0f", gross_pay - total));

        }
    });
    
    
    button1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ex){
        
        Stream.of(l1, l2, l3, l4, l5, l6, l7, l8).forEach(p -> p.setText(""));
        
        }
        
    });
        button2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ex){
        
        System.exit(0);
        
        }
        
    });
  
    }// main
}// class
