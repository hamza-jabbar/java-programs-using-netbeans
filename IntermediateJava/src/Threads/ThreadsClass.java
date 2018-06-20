package Threads;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
import java.util.*;
//Implementing runnable allows you to run the threads
public class ThreadsClass implements Runnable {
    String name;
    int time;
    Random r = new Random();
    
    public ThreadsClass(String x) {
        name = x;
        time = r.nextInt(999);
    }
    public void run() {
        try {
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is has woke up\n", name);
        } catch(Exception e) {
            System.out.println("The thread is not working");
        }
    }
}
