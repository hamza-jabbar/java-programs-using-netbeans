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

public class MouseEvents extends JFrame {
    private JPanel mousepanel;
    private JLabel statusbar;
    
    public MouseEvents() {
        super("Mouse Events");
        
        mousepanel = new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);
        
        statusbar = new JLabel("defsult");
        add(statusbar, BorderLayout.SOUTH);
        
        HandleClass handler = new HandleClass(); //This handles the mouse events
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);
    }
    private class HandleClass implements MouseListener, MouseMotionListener {
        public void mouseClicked(MouseEvent event) {
            statusbar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
        }
        public void mousePressed(MouseEvent event) {
            statusbar.setText("You have pressed the mouse");
        }
        public void mouseReleased(MouseEvent event) {
            statusbar.setText("You released the mouse button");
        }
        public void mouseEntered(MouseEvent event) { //"mouseEntered" is when the mouse have entered an area
            statusbar.setText("You have entered the area");
            mousepanel.setBackground(Color.RED);
        }
        public void mouseExited(MouseEvent event) {
            statusbar.setText("The mouse has left the window");
            mousepanel.setBackground(Color.BLUE);
        }
        //These are the "MouseMotion" events
        public void mouseDragged(MouseEvent event) {
            statusbar.setText("You are dragging the mouse");
        }
        public void mouseMove(MouseEvent event) {
            statusbar.setText("YOu have moved the mouse");
        }

        public void mouseMoved(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    public static void main(String[] args) {
        MouseEvents j = new MouseEvents();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(200,200);
        j.setVisible(true);
    }
}
