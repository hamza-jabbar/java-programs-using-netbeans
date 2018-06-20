/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author Hamza
 */
public class MainThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadsClass("one"));
        Thread t2 = new Thread(new ThreadsClass("two"));
        Thread t3 = new Thread(new ThreadsClass("three"));
        Thread t4 = new Thread(new ThreadsClass("four"));
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        //"start();" - means call the run method
    }
}
