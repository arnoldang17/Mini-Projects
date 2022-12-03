import java.awt.Font;
import java.util.Arrays;

import javax.swing.*;

public class mp5 { 
    JFrame frame = new JFrame();
    JMenuBar mm = new JMenuBar();

    JMenu file = new JMenu("File"),
          history = new JMenu("History"),
          bookPublished = new JMenu("Book Published");
        
    JMenuItem myProfile = new JMenuItem("My Profile"), 
              experience = new JMenuItem("experience"),
              education = new JMenuItem("Education"),
              parents = new JMenuItem("Parents"),
              siblings = new JMenuItem("Siblings"),
              friends = new JMenuItem("Friends"),
              local = new JMenuItem("Local"),
              international = new JMenuItem("International"),
              article = new JMenuItem("Article");
    
    JMenu[] menus = {file, history, bookPublished};
    JMenuItem[] fileItems = {myProfile, experience, education};
    JMenuItem[] historyItems = {parents, siblings, friends};
    JMenuItem[] bookPublishedItems = {local, international, article};
    
    mp5(){
        
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setLayout(null);  
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Arrays.stream(menus).forEach(p -> mm.add(p));
        Arrays.stream(menus).forEach(p -> p.setFont(new Font("Arial", Font.PLAIN, 12)));
        Arrays.stream(fileItems).forEach(p -> p.setFont(new Font("Arial", Font.PLAIN, 12)));
        Arrays.stream(fileItems).forEach(p -> file.add(p));
        Arrays.stream(historyItems).forEach(p -> history.add(p));
        Arrays.stream(bookPublishedItems).forEach(p -> bookPublished.add(p));
        
        frame.setJMenuBar(mm);
    
        myProfile.addActionListener(ex -> {
        
        new mp51(mm).myProfile();

        frame.dispose();
        }); 
        experience.addActionListener(ex -> {
        
        new mp51(mm).experience();
        frame.dispose();
        });

        education.addActionListener(ex -> {

        new mp51(mm).education();
        frame.dispose();
        });

    }
    
    public static void main(String[] args){

       new mp5();
        
    }
}
