/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Hamza
 */
import javax.swing.JFrame;
public class ServerTest {
    public static void main(String[] args) {
        Server s = new Server();
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.startRunning();
    }
}
