/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
import static com.sun.glass.ui.Cursor.setVisible;
import static com.sun.javafx.fxml.expression.Expression.add;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JColorChooserClass {

    private JButton b;
    private Color color = (Color.WHITE);
    private JPanel panel;

    public JColorChooserClass() {
        super("JColorChooser Class");
        panel = new JPanel();
        panel.setBackground(color);
        b = new JButton("Choose a color");
        b.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        color = JColorChooser.showDialog(null, "Pick your color", color);
                        if (color == null) {
                            color = (Color.WHITE);
                        }

                        panel.setBackground(color);
                    }
                }
        );

        add(panel, BorderLayout.CENTER);
        add(b, BorderLayout.SOUTH);
        setSize(425, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("JColorChooserClass");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JColorChooserClass d = new JColorChooserClass();
        f.add(d);
        f.setSize(400, 250);
        f.setVisible(true);
    }
}
