import java.awt.Font;
import java.util.Arrays;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class mp5 implements ActionListener{ 
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
        Arrays.stream(historyItems).forEach(p -> p.setFont(new Font("Arial", Font.PLAIN, 12)));
        Arrays.stream(bookPublishedItems).forEach(p -> p.setFont(new Font("Arial", Font.PLAIN, 12)));
        Arrays.stream(fileItems).forEach(p -> file.add(p));
        Arrays.stream(historyItems).forEach(p -> history.add(p));
        Arrays.stream(bookPublishedItems).forEach(p -> bookPublished.add(p));
        
        frame.setJMenuBar(mm);

    myProfile.addActionListener(this);
    experience.addActionListener(this);
    education.addActionListener(this);
    parents.addActionListener(this);
    siblings.addActionListener(this);
    friends.addActionListener(this);
    local.addActionListener(this);
    international.addActionListener(this);
    article.addActionListener(this);

}   
public void actionPerformed(ActionEvent e) {
        
    if(e.getSource() == myProfile){
        new mp51(mm).myProfile();
        frame.dispose();
    }
    else if(e.getSource() == experience){
        new mp51(mm).experience();
        frame.dispose();
    }
    else if(e.getSource() == education){
        new mp51(mm).education();
        frame.dispose();
    }
    else if(e.getSource() == parents){
        new mp51(mm).parents();
        frame.dispose();
    }
    else if(e.getSource() == siblings){
        new mp51(mm).siblings();
        frame.dispose();
    }
    else if(e.getSource() == friends){
        new mp51(mm).friends();
        frame.dispose();
    }
    else if(e.getSource() == local){
        new mp51(mm).local();
        frame.dispose();
    }
    else if(e.getSource() == international){
        new mp51(mm).international();
        frame.dispose();
    }
    else if(e.getSource() == article){
        new mp51(mm).article();
        frame.dispose();
    }
    
}
    public static void main(String[] args){

       new mp5();
        
    }   
}
