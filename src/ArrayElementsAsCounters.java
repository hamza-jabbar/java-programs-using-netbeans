/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
import java.util.Random;

public class ArrayElementsAsCounters {
    public static void main(String[] args) {
        Random DGF = new Random();
        int freq[] = new int[7];//there are 7 elements because the the element starts from 0
        
        for(int roll =1; roll < 1000; roll++) {
            ++freq[1+DGF.nextInt(6)];
            /*Gives you numbers through 0 to 5. '+1' shifts all the numbers and
            gives you 1 to 6
            - ++freq adds 1 each time it hits that same number*/
        }
        System.out.println("Face\tFrequency");//Header for the table
        
        for(int face=1; face<freq.length;face++) {
            System.out.println(face+"\t" +freq[face]);
        }
        System.out.println(" ");
        System.out.println("#DGF"); 
    }
}
