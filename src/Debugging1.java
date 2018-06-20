/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class Debugging1 {
    public static void main(String[] args) {
        double regularPrice = 300;
        double discountPercent = 0.4;
        double discount = regularPrice * discountPercent;
        double finalPrice = regularPrice + discount;/*This line is adding the
regular price and the isconted price us resulting at th value 420 instead of 120*/
        
            System.out.println("Grand Total: " + finalPrice);
            System.out.println();
            System.out.println("#DGF");
    }
}
/*This program is wrong because the program is supposed o output the value 120.0
but it ouputs 420.0 instead

The program is supposed to ouput 120.0 and 180 as a subtactio method*/