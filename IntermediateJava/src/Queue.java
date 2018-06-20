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
public class Queue {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<String>();
        
        q.offer("first");
        q.offer("second");
        q.offer("third");
        System.out.printf("%s ",q);
        System.out.println();
        
        System.out.printf("%s ", q.peek());
        System.out.println();
        
        q.poll();
        System.out.printf("%s ", q);
    }
}