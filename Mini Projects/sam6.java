
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class sam6 {
    
    static String b = "";  

    public static void main(String[]args){
        JFrame frame = new JFrame("Calculator");
        JPanel panel = new JPanel();
        JTextField p1 = new JTextField();
        JButton btn1 = new JButton("Clear");
        JButton btn2 = new JButton("=");
        JButton btn3 = new JButton("+");
        JButton btn4 = new JButton("-");
        JButton btn5 = new JButton("*");
        JButton btn6 = new JButton("/");
        
        JButton butt1 = new JButton("1");
        JButton butt2 = new JButton("2");
        JButton butt3 = new JButton("3");
        JButton butt4 = new JButton("4");
        JButton butt5 = new JButton("5");
        JButton butt6 = new JButton("6");
        JButton butt7 = new JButton("7");
        JButton butt8 = new JButton("8");
        JButton butt9 = new JButton("9");
        JButton butt0 = new JButton("0");
        
        
        frame.setSize(600, 400);
        frame.setVisible(true);
        panel.setBackground(Color.green);
        panel.setLayout(null);
        
        
        p1.setBounds(0, 0, 585, 50);
        btn1.setBounds(30, 70, 100, 40);
        btn2.setBounds(290, 250, 50, 40);
        btn3.setBounds(290, 130, 50, 40);
        btn4.setBounds(290, 190, 50, 40);
        btn5.setBounds(150, 310, 50, 40);
        btn6.setBounds(220, 310, 50, 40);
        
        butt1.setBounds(80, 130,50, 40);
        butt2.setBounds(150, 130,50, 40);
        butt3.setBounds(220, 130,50, 40);
        butt4.setBounds(80, 190,50, 40);
        butt5.setBounds(150, 190,50, 40);
        butt6.setBounds(220, 190,50, 40);
        butt7.setBounds(80, 250,50, 40);
        butt8.setBounds(150, 250,50, 40);
        butt9.setBounds(220, 250,50, 40);
        butt0.setBounds(80, 310,50, 40);
        
      
        
       
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        panel.add(p1);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        
        
        panel.add(butt1);
        panel.add(butt2);
        panel.add(butt3);
        panel.add(butt4);
        panel.add(butt5);
        panel.add(butt6);
        panel.add(butt7);
        panel.add(butt8);
        panel.add(butt9);
        panel.add(butt0);
        
        
       butt0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ex){
                String a = "0"; 
                b += a;
                p1.setText(b);
            
            }        
        
        }); 
        
        
       butt9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ex){
                String a = "9";
                
                b += a;
                p1.setText(b);
            
            }
                  
        }); 
        
        
       butt8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ex){
                String a = "8";
                
                b += a;
                p1.setText(b);
            
            }
        });
        
        
       butt7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ex){
                String a = "7";
               
                b += a;
                p1.setText(b);
            
            }     
            
        
        }); 
        
        
        
       butt6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ex){
                String a = "6";
                
                b += a;
                p1.setText(b);
            
            }
                    
            
        
        }); 
       
        
       butt5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ex){
                String a = "5";
              
                b += a;
                p1.setText(b);
            
            }
                    
            
        
        }); 
        
        
       butt4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ex){
                String a = "4";
                
                b += a;
                p1.setText(b);
            
            }
            
        
        }); 
        
        
       butt3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ex){
                String a = "3";
                
                b += a;
                p1.setText(b);
            
            }
        
        });
       
       
       butt2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ex){
                String a = "2";
                
                b += a;
                p1.setText(b);
            
            }  
            
        });
        
        butt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ex){
                String a = "1";
                
                b += a;
                p1.setText(b);
            
            }

        });
        
        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ex){
              b = "";
              p1.setText(b);
            
            }
        
        });
        
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ex){
                String plus = " + ";
                b += plus;
                
                p1.setText(b);
            
            }
 
        });
    
    }
    
}
 
