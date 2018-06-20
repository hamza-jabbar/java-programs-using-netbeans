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

public class DrawingGraphics extends JPanel {
    //This method allows you to change the color
    public void PaintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        
        g.setColor(Color.BLUE);
        g.fillRect(25, 25, 100, 30);
        /*Blue rectangle on the screen*/
                            /*R,   G,  B*/
        g.setColor(new Color(190, 81, 215));
        g.fillRect(25, 65, 100, 30);
        
        g.setColor(Color.RED);
        g.drawString("This is some text", 25, 120); //This is text on the screen   
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Drawing Graphics Class");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawingGraphics d = new DrawingGraphics();
        f.add(d);
        f.setSize(400, 250);
        f.setVisible(true); 
    }
}
