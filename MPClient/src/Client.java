 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Hamza
 */
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame {
    private JTextField userText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input; //From the server going into the computer
    private String message = "";
    private String serverIP;
    private Socket connection;
    
    //Constructor
    public Client(String host) {
        super("Client");
        serverIP = host;
        userText = new JTextField();
        userText.setEditable(false);
        userText.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        sendMessage(event.getActionCommand());
                        userText.setText("");
                    }
                }
        );
        add(userText, BorderLayout.NORTH);
        chatWindow = new JTextArea();
        add(new JScrollPane(chatWindow), BorderLayout.CENTER);
        setSize(300, 150);
        setVisible(true);
    }
    public void startRunning() {
        try {
            connectToServer();
            setupStreams();
            whileChatting();
        } 
        catch(EOFException eof) {
            showMessage("\n Client Terminated Connection");
        } 
        catch (IOException io) {
            io.printStackTrace();
        } finally {
            closeCrap();
        }
    }
    //Connect to server
    private void connectToServer() throws IOException {
        showMessage("Attempting Connection \n");
        connection = new Socket(InetAddress.getByName(serverIP), 6789);
        showMessage("\n Connected to: " + connection.getInetAddress().getHostName());
    }
    //setup streams to send and recieve messages
    private void setupStreams() throws IOException {
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush();
        input = new ObjectInputStream(connection.getInputStream());
        showMessage("\n The streams are now ready! \n");
    }
    //While chatting with the server
    private void whileChatting() throws IOException {
        ableToType(true);
        do {
            try {
                message = (String)input.readObject();
                showMessage("\n" + message);
            } catch(ClassNotFoundException cnf) {
                showMessage("\n I don't know that object type");
            }
        } while(!message.equals("SERVER - END"));
    }
    //Closing the streams and sockets
    private void closeCrap() {
        showMessage("\n Closing crap down... ");
        ableToType(false);
        try {
            output.close();
            input.close();
            connection.close();
        } catch(IOException io) {
            io.printStackTrace();
        }
    }
    //send Messages to the server
    private void sendMessage(String message) {
        try {
            output.writeObject("CLIENT - " + message);
            output.flush();
            showMessage("\n CLIENT - " + message);
            
        } catch(IOException io) {
            chatWindow.append("\n Message not sent");
        }
    }
    //change/update chatWindow
    private void showMessage(final String m) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        chatWindow.append(m);
                    }
                }
        );
    }
    //giving user permission to type text into the text box
    private void ableToType(final boolean tof) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        userText.setEditable(tof);
                    }
                }
        );
    }
}




