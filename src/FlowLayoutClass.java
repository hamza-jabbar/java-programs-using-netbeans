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
public class FlowLayoutClass extends JFrame {
    private JButton lb, cb, rb;
    private FlowLayout layout;
    private Container container;
    
    public FlowLayoutClass() {
        super("FlowLayout Class");
        
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);
        
        //Left Stuff in here
        lb = new JButton("Left button");
        add(lb);
        lb.addActionListener(
                new ActionListener() {
                    public void ActionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.LEFT);
                    //This allign the whole layout to the left when the button is clicked
                        layout.layoutContainer(container);
                    //Rearranges everything depending on what the layout is
                    }
                }
        );
        
        cb = new JButton("Center button");
        add(cb);
        cb.addActionListener(
                new ActionListener(){
                    public void ActionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.CENTER);
                    //This allign the whole layout to the left when the button is clicked
                        layout.layoutContainer(container);
                    //Rearranges everything depending on what the layout is
                    }
                }
        );
        
        rb = new JButton("Right button");
        add(rb);
        rb.addActionListener(
                new ActionListener(){
                    public void ActionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.RIGHT);
                    //This allign the whole layout to the left when the button is clicked
                        layout.layoutContainer(container);
                    //Rearranges everything depending on what the layout is
                    }
                }
        );
        
    }
    public static void main(String[] args) {
        FlowLayoutClass l = new FlowLayoutClass();
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setSize(300,100);
        l.setVisible(true);
       
    }
}
/*The program allows you to arrange the items on the JFrame around, depending on
where you want the objects to to go*/