/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class RandomNumber {
    public static void main(String[] args) {
        int RandomNumber = (int) (Math.random() * 50);
        
        if (RandomNumber < 25) {
            System.out.println("The random number is less than 25");
        }
        else if (RandomNumber > 40) {
            System.out.println("The random number is greater than 40");    
        }
        else if (RandomNumber == 18){
            System.out.println("The random number is equal to 18");
        }
        System.out.println("The random Number is " + RandomNumber);
        System.out.println(" ");
        System.out.println("#DGF");
    }
}
