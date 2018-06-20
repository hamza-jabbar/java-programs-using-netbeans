/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Hamza
 */
public class apples_arguement {
    public static void main(String[] args) {
        fatty fat = new fatty();
        
        food fo = new food();
        food po = new potpie();
        
        fat.digest(fo);
        fat.digest(po);
    }
}
