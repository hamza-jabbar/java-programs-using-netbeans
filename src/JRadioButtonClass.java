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

public class JRadioButtonClass extends JFrame {
    private JTextField tf;
    private Font pf, bf, itf, bif;
    private JRadioButton pb, bb, ib, bib;
    private ButtonGroup group; //This allows the radio buttons to be a part of a family
    
    public JRadioButtonClass() {
        super("JRadioButton");
        setLayout(new FlowLayout());
        
        tf = new JTextField("This is a sentence", 25);
        add(tf);
        
        pb = new JRadioButton("Plain Font",true);
        bb = new JRadioButton("Bold Font", false);
        ib = new JRadioButton("Italic Font", false);
        bib = new JRadioButton("Bold & Italic Font", false);
        add(pb);
        add(bb);
        add(ib);
        add(bib);
        
        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);
        /*These buttons are added to the group so that the program knows which 
        buttons are checked and which ones are not checked*/
        
        pf = new Font("Serif", Font.PLAIN, 14);
        bf = new Font("Serif", Font.BOLD, 14);
        itf = new Font("Serif", Font.ITALIC, 14);
        bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        tf.setFont(pf);
        //wait for event ot happen, pass in font object to constructor
        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));
    }
    private class HandlerClass implements ItemListener {
        private Font font;
        //font object gets variable font
        public HandlerClass(Font f) {
            font = f;
        }
        //Sets the font to the font object that was passed in
        public void itemStateChanged(ItemEvent event) {
            tf.setFont(font);
        }
    }
    public static void main(String[] args) {
        JRadioButtonClass j = new JRadioButtonClass();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(250,200);
        j.setVisible(true);
    }
}
