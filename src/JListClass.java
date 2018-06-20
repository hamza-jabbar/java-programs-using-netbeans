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
import javax.swing.event.*;

public class JListClass extends JFrame {
    private JList list;
    private static String[] colornames = {"black", "blue", "red", "white"};
    private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
    
    public JListClass() {
        super("JList");
        setLayout(new FlowLayout());
        
        list = new JList(colornames);
        list.setVisibleRowCount(5);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));
        
        list.addListSelectionListener(
                new ListSelectionListener() {
                    public void valuechanged(ListSelectionEvent event) {
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);
                    }
            public void valueChanged(ListSelectionEvent lse) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
                }
        );
    }
    public static void main(String[] args) {
        JListClass j = new JListClass();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(150,90);
        j.setVisible(true);
    }
}
