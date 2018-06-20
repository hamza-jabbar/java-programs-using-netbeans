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

public class MultipleSelectionList extends JFrame {
    private JList leftlist, rightlist;
    private JButton movebutton;
    private static String[] food = {"chicken", "fish", "tava", "wings"};
    
    public MultipleSelectionList() {
        super("Multiple Selection List");
        setLayout(new FlowLayout());
        leftlist = new JList(food);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));
        
        movebutton = new JButton("Move -->");
        movebutton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        rightlist.setListData(leftlist.getSelectedValues()); 
                    }
                }
        );
        add(movebutton);
        rightlist = new JList();
        rightlist.setVisibleRowCount(3);
        rightlist.setFixedCellWidth(100);
        rightlist.setFixedCellHeight(15);
        rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightlist));
    }
    public static void main(String[] args) {
        MultipleSelectionList j = new MultipleSelectionList();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(300,120);
        j.setVisible(true);
    }
}
