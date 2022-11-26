
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class mp4 {
  
    public static void main(String[] args){
        
    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();
    JLabel label = new JLabel("San Beda University "),
           label11 = new JLabel ("<<Grading System>>"),
           label1 = new JLabel("Quiz #1: "),
           label2 = new JLabel("Quiz #2: "),
           label3 = new JLabel("Quiz #3:"),
           label4 = new JLabel("Average quiz:"),
           label5 = new JLabel("Attendance: "),
           label6 = new JLabel("Recitation: "),
           label7 = new JLabel("Prelim Exam: "),
           label8 = new JLabel("Remark: "),
           label9 = new JLabel("Class Standing: "),
           label10 = new JLabel("Transmitted: "),
           label12 = new JLabel("Prelim Grade: ");
      
    JTextField  l1 = new JTextField(),
                l2 = new JTextField(),
                l3 = new JTextField(),
                l4 = new JTextField(),
                l5 = new JTextField(),
                l6 = new JTextField(),
                l7 = new JTextField(),
                l8 = new JTextField(),
                l9 = new JTextField(),
                l10 = new JTextField(),
                l12 = new JTextField();
    
    JButton button = new JButton("Compute"),
            button1 = new JButton("Clear"),
            button2 = new JButton("Exit");
     
    JLabel[] labels = new JLabel[] {label, label11, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label12};
    JTextField[] textfields = new JTextField[] {l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l12};
    JButton[] buttons = new JButton[]{button, button1, button2};
    
    frame.setSize(1000,1000);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel1.setLayout(null);
    
    frame.setVisible(true);
    
    frame.add(panel1);
    
    Arrays.stream(labels).forEach(p -> panel1.add(p));
    Arrays.stream(textfields).forEach(p -> panel1.add(p));
    Arrays.stream(buttons).forEach(p -> panel1.add(p));
    
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
    label4.setBounds(180, 420, 300, 30);
    l4.setBounds(330, 420, 150, 30);
    label12.setBounds(180, 460, 300, 30);
    l12.setBounds(330, 460, 150, 30);
    
    label5.setBounds(520, 180, 300, 30);
    l5.setBounds(640, 180, 150, 30);
    label6.setBounds(520, 230, 300, 30);
    l6.setBounds(640, 230, 150, 30);
    label7.setBounds(520, 280, 300, 30);
    l7.setBounds(640, 280, 150, 30);
    label8.setBounds(520, 330, 300, 30);
    l8.setBounds(640, 330, 150, 30);
    label9.setBounds(520, 420, 300, 30);
    l9.setBounds(640, 420, 150, 30);
    label10.setBounds(520, 460, 300, 30);
    l10.setBounds(640, 460, 150, 30);
    
    Arrays.stream(labels).forEach(p -> p.setFont(new Font("Arial light", Font.PLAIN, 15)));
    label.setFont(new Font("Arial light", Font.BOLD, 15));
    label11.setFont(new Font("Arial light", Font.BOLD, 15));
    
    button.setBounds(250, 520, 100, 30);
    button1.setBounds(430, 520, 100, 30);
    button2.setBounds(610, 520, 100, 30);
    
    button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ex){
    
            int quiz1 = Integer.parseInt(l1.getText());
            int quiz2 = Integer.parseInt(l2.getText());
            int quiz3 = Integer.parseInt(l3.getText());
            //int net_pay = Integer.parseInt(label4.getText());
            int attendance = Integer.parseInt(l5.getText());
            int recitation = Integer.parseInt(l6.getText());
            int prelimExam = Integer.parseInt(l7.getText());
            //int Total = Integer.parseInt(label8.getText());
                    
            
            int averageQuiz = (quiz1 + quiz2 + quiz3) /3;
            l4.setText(String.valueOf(averageQuiz));
            
            Double classStanding = (averageQuiz * .6) + (attendance * .2) + (recitation * .2);
            l9.setText(String.valueOf(classStanding));
            
            int prelimGrade = (int)((classStanding * .4) + (prelimExam  * .6));
            l12.setText(String.valueOf(prelimGrade));
            
            if (prelimGrade <= 74){
                l8.setText("Failed");
                l10.setText("5.0");
                
            }
            else if (prelimGrade >= 75 && prelimGrade <= 77){
                l8.setText("Need Improvement");
                l10.setText("3.0");
            
            }
            else if (prelimGrade >= 78 && prelimGrade <= 80){
                l8.setText("Low Passed");
                l10.setText("2.75");
            
            }
            else if (prelimGrade >= 81 && prelimGrade <= 83){
                l8.setText("High Passed");
                l10.setText("2.5");
            
            }
            else if (prelimGrade >= 84 && prelimGrade <= 86){
                l8.setText("Satisfactory");
                l10.setText("2.25");
            
            }
            else if (prelimGrade >= 87 && prelimGrade <= 89){
                l8.setText("Very Satisfactory");
                l10.setText("2.0");
            
            }
            else if (prelimGrade >= 90 && prelimGrade <= 92){
                l8.setText("Good");
                l10.setText("1.75");
            
            }
            else if (prelimGrade >= 93 && prelimGrade <= 95){
                l8.setText("Very Good");
                l10.setText("1.50");
            
            }
            else if (prelimGrade >= 96 && prelimGrade <= 98){
                l8.setText("Excellent");
                l10.setText("1.25");
            
            }
            else if (prelimGrade >= 99 && prelimGrade <= 100){
                l8.setText("Superior");
                l10.setText("1.0");
            
            }
    
        }
    });
    
    button1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ex){
        
        Arrays.stream(textfields).forEach(p -> p.setText(""));
        
        }
        
        });
        button2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ex){
        
        System.exit(0);
        
        }
        
        });

    }// main
}// class


