package DrawingOvalWithSlider;

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
import javax.swing.*;
public class DrawOval extends JPanel {
    private int d = 10; //oval diameter by default
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(10, 10, d, d);
    /*This method is a way of painting the oval on screen*/        
    }
    public void setD(int newD) {
        d = (newD >= 0 ? newD : 10);
            //Short if statement
        repaint(); //This calls the paint component automatically 
        /*This method is a way of changing the diameter*/
    }
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }
}
