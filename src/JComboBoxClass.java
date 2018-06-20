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

public class JComboBoxClass extends JFrame {
    private JComboBox box;
    private JLabel picture;
    
    private static String[] filename = {"b.png", "x.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};
    
    public JComboBoxClass() {
        super("JComboBox");
        setLayout(new FlowLayout());
        
        box = new JComboBox(filename);
        
        box.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent event) {
                        if(event.getStateChange() == ItemEvent.SELECTED)
                            picture.setIcon(pics[box.getSelectedIndex()]); 
                    }
                }
        );
        add(box);
        picture = new JLabel(pics[0]);
        add(picture);
    }
    public static void main(String[] args) {
        JComboBoxClass j = new JComboBoxClass();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(150,90);
        j.setVisible(true);
    }
}
