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
public class initForApplets extends JApplet {
    private double sum;
    
    public void init() { //Initialization method
        String fn =  JOptionPane.showInputDialog("Enter first number: ");
        String sn =  JOptionPane.showInputDialog("Enter second number: ");
        
        double n1 = Double.parseDouble(fn);
        double n2 = Double.parseDouble(sn);
        
        sum = n1 + n2;
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("The sum is " + sum, 25, 30);
    }
}