
import javax.swing.*;

public class mp6 {
    
    protected JFrame frame;
    protected JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
    protected JButton button, button2, button3;
    String b = "", g, e, f;
    int q, w, j;
    JTextField textField;
    
    public mp6(){
        frame = new JFrame("Mini Project 6");
        button2 = new JButton(" + ");
        button = new JButton("1");
        button3 = new JButton("Clear");
        textField = new JTextField();

        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(button);
        frame.add(button2);
        frame.add(button3);

        frame.add(textField);

        q = w = j = 1;
        
        button.setBounds(200, 200, 50, 20);
        button2.setBounds(280, 200, 50, 20);
        button3.setBounds(350, 200, 50, 20);

        textField.setBounds(100, 100, 300, 50);

        button.addActionListener(e -> {
            String a = "1";
            b += a;

            textField.setText(b);
        });

        button2.addActionListener(e -> {
            String c = " + ";
            b += c;

            textField.setText(b);
        });

        button3.addActionListener(e -> {
            b = this.e = f = "";


            textField.setText(b);
        });

    }    
    public static void main(String[] args) {
        
        new mp6();
    }
    
}