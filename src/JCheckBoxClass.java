/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxClass extends JFrame {
    private JTextField tf;
    private JCheckBox boldbox, italicbox;
    
    public JCheckBoxClass() {
        super("JCheckBox title");
        setLayout(new FlowLayout());
        
        tf = new JTextField("This is a sentence", 20);
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        add(tf);
        
        boldbox = new JCheckBox("Bold");
        italicbox = new JCheckBox("Italic");
        add(boldbox);
        add(italicbox);
        
        HandlerClass handler = new HandlerClass();
        boldbox.addItemListener(handler);
        italicbox.addItemListener(handler);
    }
    private class HandlerClass implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            Font font = null;
            if(boldbox.isSelected() && italicbox.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (boldbox.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            else if (italicbox.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else
                font = new Font("Serif", Font.PLAIN, 14);
            
            tf.setFont(font);
        }
    }
        public static void main(String[] args) {
        JCheckBoxClass j = new JCheckBoxClass();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(250,200);
        j.setVisible(true);
    }
}
