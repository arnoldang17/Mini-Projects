import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

public class mp6 {
    private boolean addition;
    private boolean subtraction;
    private boolean multiplication;
    private boolean division;
    
    private int[] all;
    private JFrame frame;
    private JTextField display = new JTextField();
    private JButton number1 = new JButton("1"),
                    number2 = new JButton("2"), 
                    number3 = new JButton("3"), 
                    number4 = new JButton("4"), 
                    number5 = new JButton("5"),
                    number6 = new JButton("6"),
                    number7 = new JButton("7"),
                    number8 = new JButton("8"),
                    number9 = new JButton("9"),
                    number0 = new JButton("0"),
                    clear = new JButton("clear"),
                    equals = new JButton(" = "),
                    plus = new JButton(" + "),
                    minus = new JButton(" - "),
                    multiply = new JButton(" * "),
                    divide = new JButton(" / ");

    public mp6() {
        addition = false;
        subtraction = false;
        multiplication = false;
        division = false;

        frame = new JFrame("Calculator");
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        display.setBounds(0, 0, 585, 50);
        clear.setBounds(30, 70, 100, 40);
        equals.setBounds(290, 250, 50, 40);
        plus.setBounds(290, 130, 50, 40);
        minus.setBounds(290, 190, 50, 40);
        multiply.setBounds(150, 310, 50, 40);
        divide.setBounds(220, 310, 50, 40);
        
        number1.setBounds(80, 130,50, 40);
        number2.setBounds(150, 130,50, 40);
        number3.setBounds(220, 130,50, 40);
        number4.setBounds(80, 190,50, 40);
        number5.setBounds(150, 190,50, 40);
        number6.setBounds(220, 190,50, 40);
        number7.setBounds(80, 250,50, 40);
        number8.setBounds(150, 250,50, 40);
        number9.setBounds(220, 250,50, 40);
        number0.setBounds(80, 310,50, 40);

        frame.add(display);

        JButton[] allButton = {number1, number2, number3, number4, number5, number6, number7, number8, number9, number0, clear, equals, plus, minus, multiply, divide};
        Arrays.stream(allButton).forEach(button -> frame.add(button));

        plus.addActionListener(e -> {
            display.setText(display.getText() + " + ");
        });

        minus.addActionListener(e -> {
            display.setText(display.getText() + " - ");
        });

        multiply.addActionListener(e -> {
            display.setText(display.getText() + " * ");  
        });

        divide.addActionListener(e -> {
            display.setText(display.getText() + " / ");   
        });

        number1.addActionListener(e -> {
            display.setText(display.getText() + "1");
        });

        number2.addActionListener(e -> {
            display.setText(display.getText() + "2");
        });

        number3.addActionListener(e -> {
            display.setText(display.getText() + "3");
        });

        number4.addActionListener(e -> {
            display.setText(display.getText() + "4");
        });

        number5.addActionListener(e -> {
            display.setText(display.getText() + "5");
        });

        number6.addActionListener(e -> {
            display.setText(display.getText() + "6");
        });

        number7.addActionListener(e -> {
            display.setText(display.getText() + "7");
        });

        number8.addActionListener(e -> {
            display.setText(display.getText() + "8");
        });

        number9.addActionListener(e -> {
            display.setText(display.getText() + "9");
        });

        number0.addActionListener(e -> {
            display.setText(display.getText() + "0");
        });

        clear.addActionListener(e -> {
            display.setText("");
        });

        equals.addActionListener(e -> {
            
            display.setText(String.valueOf(system()));
        });
    }

    private int system() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList(display.getText().split(" "))); //6
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(Integer.parseInt(display.getText().split("+*-/"))));
        
        

        System.out.println(Arrays.toString(numbers.toArray()));

        for (int i = input.size(); 0 < i; i--) {
            if (input.get(i).equals("+")) {
                int a = add(numbers, i, input);
                numbers.remove(i);
                numbers.remove(i+1);
                numbers.add(a);

            } else if (input.get(i).equals("-")) { 
                int a = subtract(numbers, i, input);
                numbers.remove(i-1);
                numbers.remove(i+1);
                numbers.add(a);

            } else if (input.get(i).equals("*")) {
                int a = multiply(numbers, i, input);
                numbers.remove(i-1);
                numbers.remove(i+1);
                numbers.add(a);

            } else if (input.get(i).equals("/")) {
                division = true;
            }
        }
        System.out.println(Arrays.toString(numbers.toArray()));

        return numbers.get(0);
    }

    private int multiply(ArrayList<Integer> numbers, int i, ArrayList<String> input) { 
        
        return numbers.get(i) * numbers.get(i-1);

    }
    private int subtract(ArrayList<Integer> numbers, int i, ArrayList<String> input) { 
        
        return numbers.get(i+1) - numbers.get(i-1);

    }
    private int add(ArrayList<Integer> numbers, int i, ArrayList<String> input) { 
        int a = Integer.parseInt(input.get(i-1));
        int b = Integer.parseInt(input.get(i+1));

        int c = numbers.indexOf(a);
        int d = numbers.indexOf(b);

        return numbers.get(c) + numbers.get(d);

    }
    
    public static void main(String[] args) {
        new mp6();
    }
}
