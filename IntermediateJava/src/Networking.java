/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
import java.net.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

public class Networking extends JApplet {
    private HashMap<String, URL> websiteInfo;
    private ArrayList<String> titles;
    private JList mainlist;
    
    //init
    public void init() {
        websiteInfo = new HashMap<String, URL>();
        titles = new ArrayList<String>();
        
        grabHTMLinfo();
        add(new JLabel("What website do you want to visit?"), BorderLayout.NORTH);
        mainlist = new JList(titles.toArray());
        
        mainlist.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent event) {
                        Object object = mainlist.getSelectedValue();
                        URL newDocument = websiteInfo.get(object);
                        AppletContext browser = getAppletContext();
                        browser.showDocument(newDocument);
                    }
                }
        );
        add(new JScrollPane(mainlist), BorderLayout.CENTER);
    }
    //get website info
    private void grabHTMLinfo() {
        String title;
        String address;
        URL url;
        int counter = 0;
        title = getParameter("title " + counter);
        while(title != null) {
            address = getParameter("address " + counter);
            try {
                url = new URL(address);
                websiteInfo.put(title, url);
                titles.add(title);
            } catch(MalformedURLException urlException) {
                urlException.printStackTrace();
            }
            ++counter;
            title = getParameter("title " + counter);
        }
    }
}