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
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class TheWindow extends JFrame {

    private JSlider slider;
    private DrawOval myPanel;

    public TheWindow() {
        super("Drawing Oval using slider");
        myPanel = new DrawOval();
        myPanel.setBackground(Color.ORANGE);

        slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);

        slider.addChangeListener(
                new ChangeListener() {
                    public void stateChanged(ChangeEvent e) {
                        myPanel.setD(slider.getValue());

                    }
                }
        );
        add(slider, BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);
    }
}
