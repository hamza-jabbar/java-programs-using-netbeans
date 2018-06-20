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
public class DrawingMoreStuff extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        
        g.setColor(Color.BLUE);
        g.drawLine(10, 25, 200, 45);
        
        g.setColor(Color.RED);
        g.drawRect(10, 55, 100, 30);
        
        g.setColor(Color.GREEN);
        g.fillOval(10, 95, 100, 30);
        
        g.setColor(Color.ORANGE);
        g.fill3DRect(10, 160, 100, 50, true);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Drawing Graphics Class");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawingMoreStuff d = new DrawingMoreStuff();
        f.add(d);
        f.setSize(500, 270);
        f.setVisible(true); 
    }
}