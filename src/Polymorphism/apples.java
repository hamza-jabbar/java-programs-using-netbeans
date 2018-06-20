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
public class apples {
    public static void main(String[] args) {
        food f[] = new food[2];
        f[0] = new potpie();
        f[1] = new tuna();
        
        for(int x = 0; x < 2; x++) {
            f[x].eat();
    /*The for loop is going to loop through the array of 2 different classes and
      get the code from the eat method and print it out*/
        }
    }
}
/*Polymorphic array allows you to store objects of different classes
        in the superclass type*/