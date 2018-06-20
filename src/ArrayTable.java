/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class ArrayTable {
    public static void main(String[] args) {
        System.out.println("Index\tValue");//This is the header.  
        int AT[] = {12, 28, 30, 46, 59, 61, 77, 84, 99};//Array initialiser
        //Counter starts at 0 because the index starts at 0
        //A maximum of the array //Increment                                                    
        for(int counter = 0; counter <AT.length; counter++) {
            System.out.println(counter + "\t" + AT[counter]); //'\t' is tabbing x5 
        }                               
        System.out.println(" ");
    }
}
/*The array table is to show the index and the value of the index in a table*/ 