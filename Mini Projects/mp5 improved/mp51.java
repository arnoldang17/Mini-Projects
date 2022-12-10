
import java.awt.Font;
import java.awt.Image;
import java.util.Arrays;
import java.util.stream.Stream;

import javax.swing.*;

public class mp51 {
    JFrame frame;
    JLabel label1, label2, label3, label4, label5,label6, label7, label8, labelimage;
    JLabel[] labels;
    ImageIcon image;
    JButton button;
    Image image1, newimg;
    
    public mp51(JMenuBar mm){

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
        // frame.setJMenuBar(mm);
        
    }
    void myProfile(){

        image = new ImageIcon("D:\\Data\\Java\\Mini Projects\\Mini Projects\\mp5\\marie-magny-fxel4isxgaa6suc-1.jpg");
        
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
    void experience(){

        label1 = new JLabel("Accounting and Financial Management:");
        label2 = new JLabel ("\t Developed and maintained accounting records for up to fifty bank accounts.");
        label3 = new JLabel("\t Formulated monthly and year-end financial statements and generated various payroll records");
        label4 = new JLabel("\t Formulated intricate pro-forma budgets");
        label5 = new JLabel("\t Calculated and implemented depreciation/amortization schedules.");
        label6 = new JLabel("\t Supervised the preparation of the annual audit and the annual financial report.");
        label7 = new JLabel();

        label1.setBounds(200, 180, 4000, 30);
        label2.setBounds(200, 230, 4000, 30);
        label3.setBounds(200, 280, 4000, 30);
        label4.setBounds(200, 330, 4000, 30);
        label5.setBounds(200, 380, 4000, 30);
        label6.setBounds(200, 430, 4000, 30);
        label7.setBounds(200, 430, 4000, 30);

        Stream.of(label1, label2, label3, label4, label5, label6, label7).forEach(p -> frame.add(p));
        labels = new JLabel[]{label1, label2, label3, label4, label5, label6};
        Arrays.stream(labels).forEach(p -> p.setFont(new Font("Arial", Font.PLAIN, 25)));
    }   
    void education(){
        
        label1 = new JLabel("Education:");
        label2 = new JLabel("M.Ed. (Master of Education) Sri Venkateshwara University 2019");
        label3 = new JLabel ("B.Ed. (Bachelor of Education) Andhra University 2017");
        label4 = new JLabel("Intermediate (Bi.P.C) Narayana Junior College 2013");
        label5 = new JLabel("SSC SRR Public School 2011.");
        label6 = new JLabel();

        label1.setBounds(200, 180, 300, 30);
        label2.setBounds(200, 230, 4000, 30);
        label3.setBounds(200, 280, 4000, 30);
        label4.setBounds(200, 330, 4000, 30);
        label5.setBounds(200, 380, 4000, 30);
        label6.setBounds(200, 430, 4000, 30);

        Stream.of(label1, label2, label3, label4, label5, label6).forEach(p -> frame.add(p));
        labels = new JLabel[]{label1, label2, label3, label4, label5};
        Arrays.stream(labels).forEach(p -> p.setFont(new Font("Arial", Font.PLAIN, 25)));
        label1.setFont(new Font("Arial", Font.BOLD, 25));
    }
    void parents(){
        
        label1 = new JLabel("Parents:");
        label2 = new JLabel("Father: Joshua M. Hood");
        label3 = new JLabel ("41 years old");
        label4 = new JLabel("Mother Vicky E. Brame");
        label5 = new JLabel("40 years old");
        label6 = new JLabel();

        label1.setBounds(200, 180, 300, 30);
        label2.setBounds(200, 230, 300, 30);
        label3.setBounds(200, 280, 300, 30);
        label4.setBounds(200, 330, 300, 30);
        label5.setBounds(200, 380, 300, 30);
        label6.setBounds(200, 430, 300, 30);

        Stream.of(label1, label2, label3, label4, label5, label6).forEach(p -> frame.add(p));
        labels = new JLabel[]{label1, label2, label3, label4, label5};
        Arrays.stream(labels).forEach(p -> p.setFont(new Font("Arial", Font.PLAIN, 25)));
        label1.setFont(new Font("Arial", Font.BOLD, 25));
    }
    void siblings(){
        
        label1 = new JLabel("Siblings: ");
        label2 = new JLabel ("Alanna Walls - 21 years old");
        label3 = new JLabel("Sam Baldwin - 17 years old");
        label4 = new JLabel("Darcie Bird - 16 years old");
        label5 = new JLabel("Aimee Leblanc - 14 years old");
        label6 = new JLabel("Celine Atkinson - 12 years old");
        label7 = new JLabel();

        label1.setBounds(200, 180, 4000, 30);
        label2.setBounds(200, 230, 4000, 30);
        label3.setBounds(200, 280, 4000, 30);
        label4.setBounds(200, 330, 4000, 30);
        label5.setBounds(200, 380, 4000, 30);
        label6.setBounds(200, 430, 4000, 30);
        label7.setBounds(200, 430, 4000, 30);

        Stream.of(label1, label2, label3, label4, label5, label6, label7).forEach(p -> frame.add(p));
        labels = new JLabel[]{label1, label2, label3, label4, label5, label6};
        Arrays.stream(labels).forEach(p -> p.setFont(new Font("Arial", Font.PLAIN, 25)));
        label1.setFont(new Font("Arial", Font.BOLD, 25));
    }
    void friends(){
        
        label1 = new JLabel("Friends:");
        label2 = new JLabel ("Khalid Parrish");
        label3 = new JLabel("Dewey Miranda");
        label4 = new JLabel("Emily Bradford");
        label5 = new JLabel("Rowan Riddle");
        label6 = new JLabel();

        label1.setBounds(200, 180, 300, 30);
        label2.setBounds(200, 230, 300, 30);
        label3.setBounds(200, 280, 300, 30);
        label4.setBounds(200, 330, 300, 30);
        label5.setBounds(200, 380, 300, 30);
        label6.setBounds(200, 430, 4000, 30);

        Stream.of(label1, label2, label3, label4, label5, label6).forEach(p -> frame.add(p));
        labels = new JLabel[]{label1, label2, label3, label4, label5};
        Arrays.stream(labels).forEach(p -> p.setFont(new Font("Arial", Font.PLAIN, 25)));
        label1.setFont(new Font("Arial", Font.BOLD, 25));
    }
    void local(){
        
        label1 = new JLabel("Local Books: ");
        label2 = new JLabel ("The MoonstoneThe Moonstone (Paperback)");
        label3 = new JLabel("Like LifeLike Life (Paperback)");
        label4 = new JLabel("A Christmas CarolA Christmas Carol (Paperback)");
        label5 = new JLabel("The First CircleThe First Circle (Paperback)");
        label6 = new JLabel();

        label1.setBounds(200, 180, 4000, 30);
        label2.setBounds(200, 230, 4000, 30);
        label3.setBounds(200, 280, 4000, 30);
        label4.setBounds(200, 330, 4000, 30);
        label5.setBounds(200, 380, 4000, 30);
        label6.setBounds(200, 430, 4000, 30);
        
        Stream.of(label1, label2, label3, label4, label5, label6).forEach(p -> frame.add(p));
        labels = new JLabel[]{label1, label2, label3, label4, label5};
        Arrays.stream(labels).forEach(p -> p.setFont(new Font("Arial", Font.PLAIN, 25)));
        label1.setFont(new Font("Arial", Font.BOLD, 25));
    }
    void international(){
        
        label1 = new JLabel("International Books: ");
        label2 = new JLabel ("The Age of InnocenceThe Age of Innocence (Paperback)");
        label3 = new JLabel("Gimmick!Gimmick! (Hardcover)");
        label4 = new JLabel("SimplicissimusSimplicissimus (Paperback)");
        label5 = new JLabel("The Thirty-Nine StepsThe Thirty-Nine Steps (Paperback)");
        label6 = new JLabel("Behind the Beautiful Forevers: Life, Death, and Hope in a Mumbai Undercity");
        label7 = new JLabel();

        label1.setBounds(200, 180, 4000, 30);
        label2.setBounds(200, 230, 4000, 30);
        label3.setBounds(200, 280, 4000, 30);
        label4.setBounds(200, 330, 4000, 30);
        label5.setBounds(200, 380, 4000, 30);
        label6.setBounds(200, 430, 4000, 30);
        label7.setBounds(200, 430, 4000, 30);

        Stream.of(label1, label2, label3, label4, label5, label6, label7).forEach(p -> frame.add(p));
        labels = new JLabel[]{label1, label2, label3, label4, label5, label6};
        Arrays.stream(labels).forEach(p -> p.setFont(new Font("Arial", Font.PLAIN, 25)));
        label1.setFont(new Font("Arial", Font.BOLD, 25));
    }
    void article(){
        
        label1 = new JLabel("Articles: ");
        label2 = new JLabel ("Linux for Lettuce");
        label3 = new JLabel("The Prisoners of Guantánamo");
        label4 = new JLabel("Fiction Pick of the Week: \"Mother\'s Day");
        label5 = new JLabel("Jahar\'s World");
        label6 = new JLabel("Nuns and Nuclear Security");
        label7 = new JLabel();

        label1.setBounds(200, 180, 4000, 30);
        label2.setBounds(200, 230, 4000, 30);
        label3.setBounds(200, 280, 4000, 30);
        label4.setBounds(200, 330, 4000, 30);
        label5.setBounds(200, 380, 4000, 30);
        label6.setBounds(200, 430, 4000, 30);
        label7.setBounds(200, 430, 4000, 30);

        Stream.of(label1, label2, label3, label4, label5, label6, label7).forEach(p -> frame.add(p));
        labels = new JLabel[]{label1, label2, label3, label4, label5, label6};
        Arrays.stream(labels).forEach(p -> p.setFont(new Font("Arial", Font.PLAIN, 25)));
        label1.setFont(new Font("Arial", Font.BOLD, 25));

    }


    
}
