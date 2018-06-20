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

public class Server extends JFrame {
    private JTextField userText; //Area to type text before you send
    private JTextArea chatWindow; //Displays the chat
    private ObjectOutputStream output;//This allows the message to be send to him/her
    private ObjectInputStream input; //This allows messages to be sent to you
    private ServerSocket server;
    private Socket connection; //Socket = connection(Allows you to have the convo)
    
    //Constructor
    public Server() {
        super("Instant Messenger");
        userText = new JTextField();
        userText.setEditable(false);
        userText.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        sendMessage(event.getActionCommand());
                        userText.setText(""); 
                        /*This takes away the text on the TextField when the message 
                        is sent to reciever; the message shows up on the chatWindow*/
                        
                    }
                    /*This method allows the user to press enter when the message
                       is ready to be sent*/
                }
        );
        add(userText, BorderLayout.NORTH);
        chatWindow = new JTextArea();
        add(new JScrollPane(chatWindow));
        setSize(300, 150);
        setVisible(true);
    }
    //set up and run the server
    public void startRunning() {
        try {
            server = new ServerSocket(6789, 100);
            while(true) { //run forver (basically)
                try { //to connect and have a convo with someone else
                    waitForConnection(); //Wait for connection before you start convo
                    setupStreams(); //setting the input/output streams
                    whileChatting(); //Allowing messages to be sent back and forth
                } catch(EOFException eof) {
                    showMessage("\n Server ended the Connection");
                } finally {
                    closeCrap();
                }
            }
        }catch(IOException io) {
            io.printStackTrace();
        }
    }
    //wait for connection, then display connection info
    private void waitForConnection() throws IOException {
        showMessage(" Waiting for someone to connect... \n");
        connection = server.accept(); //Accepts the connection when connected
        showMessage("\n You are now connected to " + connection.getInetAddress().getHostAddress());
    }
    //get a stream to send and receive data
    public void setupStreams() throws IOException {
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush(); //This flushes the data left from your stream
        input = new ObjectInputStream(connection.getInputStream());
        showMessage("\n Streams are now setup!");
    }
    //during the conversation
    public void whileChatting() throws IOException {
        String message = "\n SERVER - You are now connected! ";
        showMessage(message);
        ableToType(true); 
        //This is set to true so that you are able to type when you are chatting
        do { //having a conversation
            try {
                message = (String) input.readObject(); //Read what user has typed
                showMessage("\n " + message);
            } catch(ClassNotFoundException cnf) {
                showMessage("\n I don't know what the user has sent! ");
            }
        } while(!message.equals("CLIENT - END")); 
    }
    //close streams and sockets when done chatting
    public void closeCrap() {
        showMessage("\n Closing connections... \n");
        ableToType(false);
        try {
            output.close();
            input.close();
            connection.close();
        } catch(IOException io) {
            io.printStackTrace();
        }
    }
    //send a message to the client
    private void sendMessage(String message) {
        try {
            output.writeObject("SERVER - " + message);
            output.flush();
            showMessage("\n SERVER - " + message);
        } catch(IOException io) {
            chatWindow.append("\n ERROR: MESSAGE SENT UNSUCCESSFULLY");
        }
    }
    //updates chatWindow
    private void showMessage(final String text) {
        SwingUtilities.invokeLater(
            new Runnable() {
                public void run() {
                    chatWindow.append(text);
                }
            }
        );
    }
    //Letting the user type things into their box
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




