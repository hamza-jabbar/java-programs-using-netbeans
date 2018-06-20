package WebBrowser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class WebBrowser extends JFrame {
    private JTextField addressBar;
    private JEditorPane display;
    
    //Constructor
    public WebBrowser() {
        super("Web Browser");
        
        addressBar = new JTextField("Enter a URL");
        addressBar.addActionListener(
                new ActionListener() {
                    public void ActionPerformed(ActionEvent event) {
                        loadCrap(event.getActionCommand());
                    }
                    //This event occurs when the "Enter" key is pressed
                }
        );
        add(addressBar, BorderLayout.NORTH);
        
        display = new JEditorPane();
        display.setEditable(false);
        display.addHyperlinkListener(
                new HyperlinkListener() {
                    public void HyperlinkUpdate(HyperlinkEvent event) {
                        if(event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                            loadCrap(event.getURL().toString());
                        }
                    }
                }
        );
        add(new JScrollPane(display), BorderLayout.CENTER);
        setSize(500,300);
        setVisible(true);
    }
    //load crap to disply on the screen
    private void loadCrap(String usertext) {
        try {
            display.setPage(usertext);
            addressBar.setText(usertext);
        } catch(Exception e) {
            System.out.println("Crap!!!");
        }
    }
}
