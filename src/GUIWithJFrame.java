/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIWithJFrame extends JFrame {
//(Extending) JFrame - Makes the look and feel of the GUI in the running OS    
    private JLabel item1;
    
    public GUIWithJFrame() {
        super("This is the title bar");
        setLayout(new FlowLayout());//Gives the default layout
        item1 = new JLabel("This is a label");
        item1.setToolTipText("This is text on hover");
        
        add(item1);//You  have to add it manually     
    }
    public static void main(String[] args) {
        GUIWithJFrame gui = new GUIWithJFrame();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(275, 180);
        gui.setVisible(true);
    }
}
