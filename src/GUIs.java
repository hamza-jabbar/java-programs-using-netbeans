/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
import javax.swing.JOptionPane;
public class GUIs {
    public static void main(String[] args) {
        int x = 1;
        do {
            String fn = JOptionPane.showInputDialog("Enter First Number: ");
            String sn = JOptionPane.showInputDialog("Enter Second Number: ");

            int num1 = Integer.parseInt(fn);
            int num2 = Integer.parseInt(sn);
            int sum = num1 + num2;

            JOptionPane.showMessageDialog(null, "The answer is " + sum, "Simple Calculator", JOptionPane.PLAIN_MESSAGE);
        } while (x == 1);
    }
}
