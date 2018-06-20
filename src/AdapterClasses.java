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
public class AdapterClasses extends JFrame {
    private String details;
    private JLabel statusbar;
    
    public AdapterClasses() {
        super("Adapter Classes");
        
        statusbar = new JLabel("This is default");
        add(statusbar, BorderLayout.SOUTH);
        addMouseListener(new Mouseclass());
    }
    private class Mouseclass extends MouseAdapter {
        public void MouseClicked(MouseEvent event) {
            details = String.format("You clicked %d", event.getClickCount());
            
            if(event.isMetaDown())
                details += "With right mouse button";
            else if(event.isAltDown())
                details += "With center mouse button";
            else
                details += "With left mouse button";
            
            statusbar.setText(details);
        }
    }
    public static void main(String[] args) {
        AdapterClasses j = new AdapterClasses();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(300,200);
        j.setVisible(true);
    }
}
/*Adapter classes allows you to override only the methods you want*/