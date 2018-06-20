/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawingOvalWithSlider;

/**
 *
 * @author Hamza
 */
import javax.swing.*;
public class MainClass {
    public static void main(String[] args) {
        TheWindow w = new TheWindow();
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(230, 280);
        w.setVisible(true);
    }
}