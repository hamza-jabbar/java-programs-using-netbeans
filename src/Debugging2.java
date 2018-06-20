/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class Debugging2 {
        public static void main(String[] args) {
        double regularPrice = 300;
        double discountPercent = 0.4;
        double discount = regularPrice * discountPercent;
        double finalPrice = regularPrice - discount;
        
            System.out.println("Discount Total: " + discount);
            System.out.println("Grand Total: " + finalPrice);
            System.out.println();
            System.out.println("#DGF");
    }
}
