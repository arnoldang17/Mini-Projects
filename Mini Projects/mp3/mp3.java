/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ic
 */
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class mp3 {
    
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
    

    JButton button = new JButton("Compute"),
            button1 = new JButton("Clear"),
            button2 = new JButton("Exit");
     
    frame.setSize(1000,1000);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel1.setLayout(null);
    
    frame.setVisible(true);
    
    frame.add(panel1);
    
    panel1.add(label);
    panel1.add(label11);
    panel1.add(label1);
    panel1.add(label2);
    panel1.add(label3);
    panel1.add(label4);
    panel1.add(label5);
    panel1.add(label6);
    panel1.add(label7);
    panel1.add(label8);
    panel1.add(l1);
    panel1.add(l2);
    panel1.add(l3);
    panel1.add(l4);
    panel1.add(l5);
    panel1.add(l6);
    panel1.add(l7);
    panel1.add(l8);
    panel1.add(button);
    panel1.add(button1);
    panel1.add(button2);
    
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
    
    label1.setFont(new Font("Arial light", Font.PLAIN, 15));
    label2.setFont(new Font("Arial light", Font.PLAIN, 15));
    label3.setFont(new Font("Arial light", Font.PLAIN, 15));
    label4.setFont(new Font("Arial light", Font.PLAIN, 15));
    
    label5.setBounds(520, 180, 300, 30);
    l5.setBounds(640, 180, 150, 30);
    label6.setBounds(520, 230, 300, 30);
    l6.setBounds(640, 230, 150, 30);
    label7.setBounds(520, 280, 300, 30);
    l7.setBounds(640, 280, 150, 30);
    label8.setBounds(520, 330, 300, 30);
    l8.setBounds(640, 330, 150, 30);
    
    label5.setFont(new Font("Arial light", Font.PLAIN, 15));
    label6.setFont(new Font("Arial light", Font.PLAIN, 15));
    label7.setFont(new Font("Arial light", Font.PLAIN, 15));
    label8.setFont(new Font("Arial light", Font.PLAIN, 15));
    
    button.setBounds(250, 430, 100, 30);
    button1.setBounds(430, 430, 100, 30);
    button2.setBounds(610, 430, 100, 30);
    
    button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ex){
    
    int hours = Integer.parseInt(l1.getText());
    int Rate_phours = Integer.parseInt(l2.getText());
    //int gross_pay = Integer.parseInt(label3.getText());
    //int net_pay = Integer.parseInt(label4.getText());
    int SSS = Integer.parseInt(l5.getText());
    int pagibig = Integer.parseInt(l6.getText());
    //int tax = Integer.parseInt(label7.getText());
    //int Total = Integer.parseInt(label8.getText());
            
            
            
            int gross_pay =  hours * Rate_phours;
            l3.setText("P" + Integer.toString(gross_pay));
            
            double tax = gross_pay * .1;
            double total = SSS + pagibig + tax;
            l8.setText("P" + Double.toString(total));
            l7.setText("P" + Double.toString(tax));
            
            l4.setText("P" + Double.toString(gross_pay - total));

        }
    });
    
    
    button1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ex){
        
        l1.setText("");
        l2.setText("");
        l3.setText("");
        l4.setText("");
        l5.setText("");
        l6.setText("");
        l7.setText("");
        l8.setText("");
        
        }
        
        });
        button2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ex){
        
        System.exit(0);
        
        }
        
        });

    
    
    }// main
}// class
