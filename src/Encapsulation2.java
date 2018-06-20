/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Encapsulation2 {
    public static void main(String [] args) {
        Encapsulation myAccount = new Encapsulation();
        myAccount.balance = 40.00;
        myAccount.forename = "Hamza";
        myAccount.surname = "DGF";
        myAccount.address = "18 DGF lane";
        
        System.out.println("Details of my account:");
        System.out.print("Name - " + myAccount.forename);
        System.out.println(" " + myAccount.surname);
        System.out.println("Address - " + myAccount.address);
        System.out.println("Balance - " + myAccount.balance);
    }
}
/*Self explanatory tbh*/