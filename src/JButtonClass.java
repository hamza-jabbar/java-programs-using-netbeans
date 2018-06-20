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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JButtonClass extends JFrame {
    private JButton reg;
    private JButton custom;
    
    public JButtonClass() {
        super("This is the JButton title");
        setLayout(new FlowLayout());
        
        reg = new JButton("reg Button");
        add(reg);
        
        Icon b = new ImageIcon(getClass().getResource("b.png"));
        Icon x = new ImageIcon(getClass().getResource("x.png"));
        custom = new JButton("Custom", b);
        custom.setRolloverIcon(x);
        add(custom);
        
        HandlerClass handler = new HandlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);
        
    }
    private class HandlerClass implements ActionListener {
        public void ActionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, String.format("%s", e.getActionCommand()));
        }
    }
    public static void main(String[] args) {
        JButtonClass j = new JButtonClass();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(300,200);
        j.setVisible(true);
    }
}
