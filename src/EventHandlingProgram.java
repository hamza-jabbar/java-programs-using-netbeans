

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class EventHandlingProgram extends JFrame { //Window
    private JTextField tf1, tf2, tf3;
    private JPasswordField pf1;
    
    public EventHandlingProgram() {
        super("Event Handling Program");
        setLayout(new FlowLayout());
        
        tf1 = new JTextField(10);
        add(tf1);
        
        tf2 = new JTextField("Enter Text Here: ");
        add(tf2);
        
        tf3 = new JTextField("Uneditable ", 20);
        tf3.setEditable(false);
        add(tf3);
        
        pf1 = new JPasswordField("MyPass");
        add(pf1);
        
        theHandler handler = new theHandler();//This builds the new actionlistener object
        tf1.addActionListener(handler);
        tf2.addActionListener(handler);
        tf3.addActionListener(handler);
        pf1.addActionListener(handler);
/*Anytime the object is used, it is referred to theHandler class*/
    }
    private class theHandler implements ActionListener {
//This is the class that handles the events
        public void actionPerformed(ActionEvent e) {
            String s = "";
            if(e.getSource() == tf1)
                s = String.format("field 1: %s", e.getActionCommand());
            
            else if (e.getSource() == tf2)
                s = String.format("field 2: %s", e.getActionCommand());
            
            else if (e.getSource() == tf3)
                s = String.format("field 2: %s", e.getActionCommand());
            
            else if (e.getSource() == pf1)
                s = String.format("Password Field is: %s", e.getActionCommand());
            /*"&s" - This is equal to anything that the user has typed in*/            
            
            JOptionPane.showMessageDialog(null, s);
        }
    }
    public static void main(String[] args) {
        EventHandlingProgram c = new EventHandlingProgram();
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setSize(350, 100);
        c.setVisible(true);
    }
}
